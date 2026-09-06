package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>(100);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.Class<?> wildcardClass3 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>(1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.String> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.String>(100);
        java.lang.Class<?> wildcardClass2 = strLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>(2);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.Class<?> wildcardClass4 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        java.lang.Class<?> wildcardClass3 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.String> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.String>((int) (short) 100);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.ConstantDesc> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.ConstantDesc>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.ConstantDesc> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.io.Serializable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (short) 10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        strLruCache1.put("hi!", charSequence3);
        int int5 = strLruCache1.size();
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = null;
        strLruCache1.put("", charSequence5);
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>(10);
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>(10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass4 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>(100);
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.Constable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.Constable>(10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) ' ');
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Object> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Object>((int) 'a');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>((int) '#');
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) '4');
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(2);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.CharSequence> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.CharSequence>((int) 'a');
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(100);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.Type> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.Type>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>((int) '#');
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) (short) 100);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>(100);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>(100);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Object> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>(100);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>((int) ' ');
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>((int) (byte) 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>(10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) ' ');
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (short) 10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        boolean boolean5 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object>(2);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(2);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>((int) 'a');
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>((int) (short) 100);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (short) 100);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(10);
        int int2 = strLruCache1.size();
        java.lang.Class<?> wildcardClass3 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>(2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((int) 'a');
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) '#');
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration>((int) (short) 10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) '#');
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>(1);
        java.lang.Class<?> wildcardClass2 = typeDescriptorLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String>(100);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '#');
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass10 = charSequence9.getClass();
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type>(2);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>(10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) ' ');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int12 = strLruCache1.size();
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass16 = charSequence15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>((int) (short) 10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass23 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>((int) '4');
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass15 = charSequence14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.Type> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.Type>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int9 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        int int5 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = charSequence17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        int int24 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass15 = charSequence14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>(100);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) '4');
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>((int) (byte) 1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("hi!");
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        int int21 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int5 = strLruCache1.size();
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.constant.Constable> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.constant.Constable>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) (byte) 100);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.String>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean6 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.constant.Constable> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.constant.Constable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = strLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) ' ');
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 100);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) 'a');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>>(10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>((int) (short) 100);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>(1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
}

