package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.String str19 = strLruCache1.get("hi!");
        boolean boolean21 = strLruCache1.containsKey("");
        boolean boolean23 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("");
        int int13 = strLruCache1.size();
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        int int14 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("", "");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.String str12 = strLruCache1.get("hi!");
        java.lang.String str14 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        int int18 = strLruCache1.size();
        int int19 = strLruCache1.size();
        int int20 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        java.lang.String str9 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.AnnotatedElement> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.AnnotatedElement>((int) (byte) 100);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.reflect.Type> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.reflect.Type>((int) ' ');
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("");
        int int15 = strLruCache1.size();
        java.lang.String str17 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.String str21 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        int int13 = strLruCache1.size();
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        java.lang.String str20 = strLruCache1.get("hi!");
        boolean boolean22 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.String str17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.String str16 = strLruCache1.get("");
        int int17 = strLruCache1.size();
        java.lang.String str19 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("");
        int int12 = strLruCache1.size();
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        java.lang.String str18 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>((int) '#');
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "");
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.String str15 = strLruCache1.get("");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "");
        boolean boolean16 = strLruCache1.containsKey("");
        int int17 = strLruCache1.size();
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        int int4 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        java.lang.String str20 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("hi!");
        java.lang.String str19 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.String str9 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        int int22 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        java.lang.String str15 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.String str15 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) 100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        int int19 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        int int13 = strLruCache1.size();
        java.lang.String str15 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (byte) 100);
        java.lang.String str3 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>(100);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        boolean boolean20 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        boolean boolean13 = strLruCache1.containsKey("");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.String str9 = strLruCache1.get("");
        java.lang.String str11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.String str17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "");
        java.lang.String str6 = strLruCache1.get("hi!");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        java.lang.String str9 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        java.lang.String str12 = strLruCache1.get("");
        java.lang.String str14 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("");
        java.lang.String str13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        java.lang.String str18 = strLruCache1.get("hi!");
        int int19 = strLruCache1.size();
        int int20 = strLruCache1.size();
        int int21 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.String str8 = strLruCache1.get("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        java.lang.String str20 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("hi!");
        int int13 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        java.lang.String str20 = strLruCache1.get("");
        java.lang.String str22 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str16 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        int int13 = strLruCache1.size();
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        java.lang.String str20 = strLruCache1.get("hi!");
        int int21 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.String str16 = strLruCache1.get("");
        int int17 = strLruCache1.size();
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.String str11 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.String str16 = strLruCache1.get("hi!");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("");
        int int15 = strLruCache1.size();
        java.lang.String str17 = strLruCache1.get("");
        int int18 = strLruCache1.size();
        boolean boolean20 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc>(10);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        java.lang.String str12 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str13 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        java.lang.String str18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) (byte) 10);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.constant.ConstantDesc> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.constant.ConstantDesc>((int) (short) 10);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.String str9 = strLruCache1.get("");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("hi!");
        java.lang.String str9 = strLruCache1.get("");
        java.lang.String str11 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(1);
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }
}

