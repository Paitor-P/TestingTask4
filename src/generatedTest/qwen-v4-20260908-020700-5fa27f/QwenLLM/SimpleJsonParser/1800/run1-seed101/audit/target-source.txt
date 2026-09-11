package com.viktor.lab4;

import java.util.ArrayList;
import java.util.List;

public class SimpleJsonParser {

    public Object parse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("input must not be null");
        }

        Parser parser = new Parser(input);
        Object value = parser.parseValue();
        parser.skipWhitespace();

        if (!parser.isAtEnd()) {
            throw new IllegalArgumentException("Unexpected trailing characters at position " + parser.position());
        }

        return value;
    }

    private static final class Parser {
        private final String source;
        private int index;

        private Parser(String source) {
            this.source = source;
            this.index = 0;
        }

        private Object parseValue() {
            skipWhitespace();
            if (isAtEnd()) {
                throw error("Unexpected end of input");
            }

            char c = source.charAt(index);
            if (c == '"') {
                return parseString();
            }
            if (c == '[') {
                return parseArray();
            }
            if (c == '-' || Character.isDigit(c)) {
                return parseNumber();
            }

            throw error("Unsupported token '" + c + "'");
        }

        private String parseString() {
            consume('"');
            StringBuilder builder = new StringBuilder();

            while (!isAtEnd()) {
                char c = source.charAt(index++);
                if (c == '"') {
                    return builder.toString();
                }

                if (c == '\\') {
                    if (isAtEnd()) {
                        throw error("Unterminated escape sequence");
                    }
                    char escaped = source.charAt(index++);
                    switch (escaped) {
                        case '"' -> builder.append('"');
                        case '\\' -> builder.append('\\');
                        case '/' -> builder.append('/');
                        case 'b' -> builder.append('\b');
                        case 'f' -> builder.append('\f');
                        case 'n' -> builder.append('\n');
                        case 'r' -> builder.append('\r');
                        case 't' -> builder.append('\t');
                        default -> throw error("Unsupported escape sequence \\" + escaped);
                    }
                } else {
                    builder.append(c);
                }
            }

            throw error("Unterminated string literal");
        }

        private Double parseNumber() {
            int start = index;

            if (peek() == '-') {
                index++;
            }

            readDigits();

            if (!isAtEnd() && peek() == '.') {
                index++;
                readDigits();
            }

            String token = source.substring(start, index);
            if (token.equals("-") || token.endsWith(".")) {
                throw error("Malformed number '" + token + "'");
            }

            try {
                return Double.valueOf(token);
            } catch (NumberFormatException ex) {
                throw error("Invalid number '" + token + "'");
            }
        }

        private List<Object> parseArray() {
            consume('[');
            skipWhitespace();
            List<Object> values = new ArrayList<>();

            if (!isAtEnd() && peek() == ']') {
                index++;
                return values;
            }

            while (true) {
                values.add(parseValue());
                skipWhitespace();

                if (isAtEnd()) {
                    throw error("Unterminated array");
                }

                char c = source.charAt(index++);
                if (c == ']') {
                    return values;
                }
                if (c != ',') {
                    throw error("Expected ',' or ']' in array but got '" + c + "'");
                }
                skipWhitespace();
            }
        }

        private void readDigits() {
            int start = index;
            while (!isAtEnd() && Character.isDigit(peek())) {
                index++;
            }
            if (start == index) {
                throw error("Expected digit");
            }
        }

        private void skipWhitespace() {
            while (!isAtEnd()) {
                char c = source.charAt(index);
                if (c == ' ' || c == '\n' || c == '\r' || c == '\t') {
                    index++;
                    continue;
                }
                break;
            }
        }

        private void consume(char expected) {
            if (isAtEnd() || source.charAt(index) != expected) {
                throw error("Expected '" + expected + "'");
            }
            index++;
        }

        private char peek() {
            return source.charAt(index);
        }

        private boolean isAtEnd() {
            return index >= source.length();
        }

        private int position() {
            return index;
        }

        private IllegalArgumentException error(String message) {
            return new IllegalArgumentException(message + " at position " + index);
        }
    }
}

