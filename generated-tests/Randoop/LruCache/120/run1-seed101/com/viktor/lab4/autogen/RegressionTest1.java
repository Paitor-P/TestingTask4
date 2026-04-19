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
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        int int17 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int16 = strLruCache1.size();
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        strLruCache1.put("hi!", charSequence7);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int5 = strLruCache1.size();
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.constant.Constable> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.constant.Constable>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass20 = charSequence19.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int25 = strLruCache1.size();
        int int26 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) (byte) 100);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int16 = strLruCache1.size();
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence25 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass26 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean13 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        boolean boolean3 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.String>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean6 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        int int7 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean17 = strLruCache1.containsKey("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int25 = strLruCache1.size();
        int int26 = strLruCache1.size();
        int int27 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.constant.Constable> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.constant.Constable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = strLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int16 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass16 = charSequence15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence23 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) ' ');
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass19 = charSequence18.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        boolean boolean17 = strLruCache1.containsKey("");
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence23 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int16 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence>((int) (short) 10);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean26 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        int int18 = strLruCache1.size();
        boolean boolean20 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence22 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 100);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 10);
        int int2 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>>(10);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        int int7 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence23 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("hi!");
        int int4 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass18 = charSequence17.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int16 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int21 = strLruCache1.size();
        int int22 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int5 = strLruCache1.size();
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean21 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        strLruCache1.put("hi!", charSequence3);
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>((int) (short) 100);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>(1);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int23 = strLruCache1.size();
        boolean boolean25 = strLruCache1.containsKey("hi!");
        int int26 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int16 = strLruCache1.size();
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int11 = strLruCache1.size();
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        strLruCache1.put("hi!", charSequence3);
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(10);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence23 = strLruCache1.get("");
        java.lang.CharSequence charSequence25 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int21 = strLruCache1.size();
        boolean boolean23 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        java.lang.CharSequence charSequence13 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type>((int) ' ');
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        strLruCache1.put("", charSequence11);
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        boolean boolean19 = strLruCache1.containsKey("");
        int int20 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence25 = strLruCache1.get("hi!");
        boolean boolean27 = strLruCache1.containsKey("");
        int int28 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor>(10);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean25 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("");
        int int9 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass20 = charSequence19.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean18 = strLruCache1.containsKey("");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean22 = strLruCache1.containsKey("");
        int int23 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int20 = strLruCache1.size();
        int int21 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.CharSequence>((int) (byte) 1);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "hi!" + "'", charSequence19, "hi!");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int16 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = charSequence19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int12 = strLruCache1.size();
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(10);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int19 = strLruCache1.size();
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = null;
        strLruCache1.put("", charSequence16);
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        int int20 = strLruCache1.size();
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        java.lang.CharSequence charSequence17 = null;
        strLruCache1.put("", charSequence17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        boolean boolean8 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) 'a');
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = charSequence18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("");
        int int24 = strLruCache1.size();
        int int25 = strLruCache1.size();
        java.lang.Class<?> wildcardClass26 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence25 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence30 = strLruCache1.get("hi!");
        boolean boolean32 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertEquals("'" + charSequence30 + "' != '" + "" + "'", charSequence30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int16 = strLruCache1.size();
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int22 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) 'a');
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = charSequence11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = null;
        strLruCache1.put("", charSequence12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>(100);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean24 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence26 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "" + "'", charSequence26, "");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence23 = strLruCache1.get("");
        java.lang.CharSequence charSequence25 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean24 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        int int19 = strLruCache1.size();
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int21 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '#');
        java.lang.Class<?> wildcardClass2 = typeDescriptorLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        boolean boolean22 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean23 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        int int21 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence23 = null;
        strLruCache1.put("hi!", charSequence23);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>((int) (byte) 1);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int7 = strLruCache1.size();
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence25 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence30 = null;
        strLruCache1.put("hi!", charSequence30);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((int) (byte) 100);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean19 = strLruCache1.containsKey("");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        strLruCache1.put("hi!", charSequence3);
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(10);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence26 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass27 = charSequence26.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence17 = null;
        strLruCache1.put("hi!", charSequence17);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        int int22 = strLruCache1.size();
        int int23 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int10 = strLruCache1.size();
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean22 = strLruCache1.containsKey("");
        int int23 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = null;
        strLruCache1.put("", charSequence16);
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int21 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        int int22 = strLruCache1.size();
        int int23 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        int int22 = strLruCache1.size();
        boolean boolean24 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        java.lang.CharSequence charSequence23 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence22 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        int int7 = strLruCache1.size();
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        boolean boolean22 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int20 = strLruCache1.size();
        int int21 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence25 = strLruCache1.get("hi!");
        boolean boolean27 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence29 = null;
        strLruCache1.put("", charSequence29);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence25 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean30 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int6 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int21 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = null;
        strLruCache1.put("hi!", charSequence19);
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        int int18 = strLruCache1.size();
        int int19 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type>((int) 'a');
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) (short) 1);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "hi!" + "'", charSequence19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(10);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        java.lang.CharSequence charSequence23 = strLruCache1.get("hi!");
        int int24 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean29 = strLruCache1.containsKey("");
        int int30 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 10);
        int int2 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence18 = null;
        strLruCache1.put("hi!", charSequence18);
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence23 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int21 = strLruCache1.size();
        java.lang.CharSequence charSequence23 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type>((int) (byte) 100);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("");
        boolean boolean18 = strLruCache1.containsKey("");
        int int19 = strLruCache1.size();
        int int20 = strLruCache1.size();
        boolean boolean22 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int20 = strLruCache1.size();
        int int21 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int20 = strLruCache1.size();
        java.lang.CharSequence charSequence22 = null;
        strLruCache1.put("hi!", charSequence22);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor>(1);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass16 = charSequence15.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int17 = strLruCache1.size();
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((int) (byte) 10);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        int int10 = strLruCache1.size();
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        strLruCache1.put("hi!", charSequence7);
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) (short) 100);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        boolean boolean7 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((int) '#');
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>(2);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        java.lang.CharSequence charSequence20 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        int int21 = strLruCache1.size();
        boolean boolean23 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.constant.Constable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.constant.Constable>(2);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        java.lang.CharSequence charSequence23 = strLruCache1.get("hi!");
        int int24 = strLruCache1.size();
        java.lang.CharSequence charSequence26 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence23 = strLruCache1.get("");
        int int24 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (byte) 100);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int25 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (short) 100);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence21 = strLruCache1.get("");
        java.lang.CharSequence charSequence23 = strLruCache1.get("hi!");
        int int24 = strLruCache1.size();
        java.lang.CharSequence charSequence26 = strLruCache1.get("");
        boolean boolean28 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean23 = strLruCache1.containsKey("");
        boolean boolean25 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) '#');
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test960");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test961");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        strLruCache1.put("hi!", charSequence3);
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test962");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test963");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String>((int) (byte) 1);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test964");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.String>((int) '#');
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test965");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test966");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test967");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test968");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test969");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test970");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>((int) ' ');
        java.lang.Class<?> wildcardClass2 = typeDescriptorLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test971");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int16 = strLruCache1.size();
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean23 = strLruCache1.containsKey("");
        boolean boolean25 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test972");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence20 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test973");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test974");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test975");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        int int22 = strLruCache1.size();
        java.lang.Class<?> wildcardClass23 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test976");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        boolean boolean20 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test977");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test978");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.GenericDeclaration> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.GenericDeclaration>((int) '4');
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test979");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = null;
        strLruCache1.put("", charSequence5);
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test980");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test981");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test982");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test983");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        int int20 = strLruCache1.size();
        java.lang.CharSequence charSequence22 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
    }

    @Test
    public void test984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test984");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        boolean boolean17 = strLruCache1.containsKey("");
        boolean boolean19 = strLruCache1.containsKey("");
        int int20 = strLruCache1.size();
        boolean boolean22 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test985");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        int int22 = strLruCache1.size();
        int int23 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test986");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test987");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean19 = strLruCache1.containsKey("");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test988");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence25 = strLruCache1.get("");
        java.lang.CharSequence charSequence27 = strLruCache1.get("hi!");
        int int28 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertEquals("'" + charSequence27 + "' != '" + "" + "'", charSequence27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test989");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test990");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int23 = strLruCache1.size();
        java.lang.Class<?> wildcardClass24 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test991");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test992");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
    }
}

