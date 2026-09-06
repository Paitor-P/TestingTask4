package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>(100);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.Class<?> wildcardClass3 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass14 = charSequence13.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = charSequence3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>(1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.String> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.String>(100);
        java.lang.Class<?> wildcardClass2 = strLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) '#');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>(2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.Class<?> wildcardClass4 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        java.lang.Class<?> wildcardClass3 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.String> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.String>((int) (short) 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int9 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "hi!" + "'", charSequence19, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.ConstantDesc> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.ConstantDesc>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean7 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = charSequence5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.ConstantDesc> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.io.Serializable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (short) 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        strLruCache1.put("hi!", charSequence3);
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        strLruCache1.put("hi!", charSequence3);
        int int5 = strLruCache1.size();
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean17 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = null;
        strLruCache1.put("", charSequence5);
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        boolean boolean3 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        java.lang.CharSequence charSequence9 = null;
        strLruCache1.put("hi!", charSequence9);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = charSequence13.getClass();
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
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>(10);
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass18 = charSequence17.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>(10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int6 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass4 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>(100);
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass20 = charSequence19.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = charSequence9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass12 = charSequence11.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.Constable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.Constable>(10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        boolean boolean12 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = charSequence11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int7 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) ' ');
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = null;
        strLruCache1.put("", charSequence5);
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Object> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Object>((int) 'a');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = null;
        strLruCache1.put("", charSequence5);
        boolean boolean8 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>((int) '#');
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) '4');
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        int int12 = strLruCache1.size();
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        java.lang.CharSequence charSequence6 = null;
        strLruCache1.put("", charSequence6);
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = charSequence13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        boolean boolean17 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(2);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.CharSequence> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.CharSequence>((int) 'a');
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("");
        boolean boolean8 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(100);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        boolean boolean8 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int7 = strLruCache1.size();
        java.lang.CharSequence charSequence9 = null;
        strLruCache1.put("", charSequence9);
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence8 = null;
        strLruCache1.put("hi!", charSequence8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int11 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass18 = charSequence17.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.Type> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.Type>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>((int) '#');
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) (short) 100);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>(100);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass23 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
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
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int5 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = null;
        strLruCache1.put("hi!", charSequence18);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        int int13 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int17 = strLruCache1.size();
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = charSequence10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>(100);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int15 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
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
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>((int) (short) 1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>((int) (byte) 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Object> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int16 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("");
        boolean boolean23 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean24 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass25 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = charSequence12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("hi!");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        boolean boolean8 = strLruCache1.containsKey("");
        boolean boolean10 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>(100);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>((int) ' ');
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence20 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>((int) (byte) 1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 10);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass20 = charSequence19.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>(10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        boolean boolean23 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean17 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) ' ');
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (short) 10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int23 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        boolean boolean5 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass18 = charSequence17.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        java.lang.CharSequence charSequence25 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "hi!" + "'", charSequence25, "hi!");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
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
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
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
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object>(2);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean13 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass13 = charSequence12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>((int) 'a');
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>((int) (short) 100);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (short) 100);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (byte) 10);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(10);
        int int2 = strLruCache1.size();
        java.lang.Class<?> wildcardClass3 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = null;
        strLruCache1.put("", charSequence18);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>(2);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((int) 'a');
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) '#');
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration>((int) (short) 10);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) '#');
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int10 = strLruCache1.size();
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
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
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean22 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
        java.lang.Class<?> wildcardClass24 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>(1);
        java.lang.Class<?> wildcardClass2 = typeDescriptorLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "hi!" + "'", charSequence19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String>(100);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
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
        java.lang.Class<?> wildcardClass26 = charSequence25.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean22 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass23 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass10 = charSequence9.getClass();
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type>(2);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int5 = strLruCache1.size();
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int11 = strLruCache1.size();
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>(10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        int int20 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        int int4 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(10);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) ' ');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }
}

