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
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = constantDesc11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = constantDesc3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence>((int) '4');
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        int int8 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>(10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (short) 100);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = constantDesc6.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = constantDesc10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        charSequenceLruCache1.put(charSequence11, (java.lang.constant.ConstantDesc) 0);
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) ' ');
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = constantDesc23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        java.lang.Class<?> wildcardClass24 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        int int2 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) ' ');
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc15 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc15);
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = constantDesc3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable>(10);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.Class<?>> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.Class<?>>((int) '#');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int9 = charSequenceLruCache1.size();
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int18 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc9);
        int int11 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>(10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>((int) ' ');
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        int int15 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(2);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) 'a');
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        java.lang.Class<?> wildcardClass30 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass22 = constantDesc21.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((int) (byte) 1);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.CharSequence charSequence16 = null;
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get(charSequence16);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + (-1.0f) + "'", constantDesc17, (-1.0f));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int9 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        int int8 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        java.lang.Class<?> wildcardClass26 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constantDescLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = constantDesc10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = constantDesc8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int5 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass6 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc9);
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type>((int) ' ');
        java.lang.Class<?> wildcardClass2 = constableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.Constable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.Constable>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc25 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc25);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>(1);
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object>(10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        int int14 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10.0d + "'", constantDesc16, 10.0d);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10.0d + "'", constantDesc18, 10.0d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>>((int) ' ');
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = constantDesc6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int14 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int21 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>>((int) 'a');
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>((int) ' ');
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (short) 100);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Object> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Object>((int) (byte) 1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.Object> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Object>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.AnnotatedElement> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.AnnotatedElement>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int9 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = constantDesc13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc17 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc17);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc15 + "' != '" + (-1.0d) + "'", constantDesc15, (-1.0d));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int18 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc31 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean33 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int23 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass24 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10.0f + "'", constantDesc22, 10.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        int int8 = charSequenceLruCache1.size();
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        int int14 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10.0d + "'", constantDesc16, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence15 = null;
        charSequenceLruCache1.put(charSequence15, (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc7 + "' != '" + 100 + "'", constantDesc7, 100);
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 100 + "'", constantDesc9, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100.0f + "'", constantDesc18, 100.0f);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = constantDesc18.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = constantDesc9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) (short) 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = constantDesc7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc7 + "' != '" + 100 + "'", constantDesc7, 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>>((int) (byte) 100);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object>((int) (short) 1);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>((int) (short) 1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.AnnotatedElement> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.AnnotatedElement>(100);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 1 + "'", constantDesc18, 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        int int5 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass6 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) '4');
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = constantDesc16.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100 + "'", constantDesc16, 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = constantDesc22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc22);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>((int) '#');
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc24 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc24);
        java.lang.constant.ConstantDesc constantDesc27 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = constantDesc27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(constantDesc27);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.Class<?>> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.Class<?>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.Constable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.Constable>((int) (short) 10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence14 = null;
        charSequenceLruCache1.put(charSequence14, (java.lang.constant.ConstantDesc) 100);
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (short) 10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((int) (byte) 10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.CharSequence charSequence10 = null;
        charSequenceLruCache1.put(charSequence10, (java.lang.constant.ConstantDesc) 0);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = constantDesc19.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 100 + "'", constantDesc19, 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass6 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = null;
        boolean boolean16 = charSequenceLruCache1.containsKey(charSequence15);
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.ConstantDesc> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(100);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = constantDesc8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence15 = null;
        boolean boolean16 = charSequenceLruCache1.containsKey(charSequence15);
        int int17 = charSequenceLruCache1.size();
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>((int) ' ');
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int16 = charSequenceLruCache1.size();
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc27 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertNull(constantDesc27);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        int int18 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc24 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc24);
        java.lang.constant.ConstantDesc constantDesc27 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc29 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(constantDesc27);
        org.junit.Assert.assertNull(constantDesc29);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100 + "'", constantDesc18, 100);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 100 + "'", constantDesc20, 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>(1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc>((int) '#');
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>(2);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        int int8 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        java.lang.CharSequence charSequence21 = null;
        boolean boolean22 = charSequenceLruCache1.containsKey(charSequence21);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc12 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc12);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>((int) ' ');
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>>((int) (byte) 10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Object> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Object>((int) (byte) 100);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc31 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc33 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean35 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertEquals("'" + constantDesc33 + "' != '" + 0L + "'", constantDesc33, 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10 + "'", constantDesc8, 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int24 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass25 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc31 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean33 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence34 = null;
        boolean boolean35 = charSequenceLruCache1.containsKey(charSequence34);
        java.lang.Class<?> wildcardClass36 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>((int) (byte) 10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int9 = charSequenceLruCache1.size();
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc9);
        int int11 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        boolean boolean4 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>(2);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.Class<?>> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.Class<?>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(100);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.GenericDeclaration> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object>((int) (short) 100);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc18);
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int22 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.Constable> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>((int) (short) 1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.invoke.TypeDescriptor> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.invoke.TypeDescriptor>((int) '4');
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.ConstantDesc> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1.0f + "'", constantDesc6, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1.0f + "'", constantDesc8, 1.0f);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable>((int) '4');
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (byte) 100);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(2);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(10);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1 + "'", constantDesc19, 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int9 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable>(10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass23 = constantDesc22.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10.0f + "'", constantDesc22, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type>((int) (byte) 1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int21 = charSequenceLruCache1.size();
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc25 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1));
        java.lang.Class<?> wildcardClass29 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(constantDesc25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Class<?> wildcardClass25 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        int int5 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = constantDesc18.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100 + "'", constantDesc18, 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type>((int) '4');
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10.0f + "'", constantDesc16, 10.0f);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        int int19 = charSequenceLruCache1.size();
        int int20 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.io.Serializable>(2);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 100.0f + "'", constantDesc19, 100.0f);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        boolean boolean28 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass29 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int18 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 100 + "'", constantDesc17, 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.Class<?> wildcardClass27 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc15 + "' != '" + 10 + "'", constantDesc15, 10);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 10 + "'", constantDesc19, 10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.CharSequence charSequence14 = null;
        charSequenceLruCache1.put(charSequence14, (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>((int) (short) 1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = null;
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get(charSequence13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + "" + "'", constantDesc12, "");
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.constant.ConstantDesc> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.constant.ConstantDesc>(100);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor>((int) (short) 10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int23 = charSequenceLruCache1.size();
        boolean boolean25 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100 + "'", constantDesc18, 100);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 100 + "'", constantDesc20, 100);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 100 + "'", constantDesc22, 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int21 = charSequenceLruCache1.size();
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc25 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(constantDesc25);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = constantDesc18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object>((int) 'a');
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        int int8 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int11 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = constantDesc17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(constantDesc17);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence23 = null;
        boolean boolean24 = charSequenceLruCache1.containsKey(charSequence23);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        boolean boolean32 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass33 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.Class<?> wildcardClass6 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass25 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100 + "'", constantDesc18, 100);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 100 + "'", constantDesc20, 100);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 100 + "'", constantDesc22, 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>((int) (short) 100);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.CharSequence charSequence10 = null;
        charSequenceLruCache1.put(charSequence10, (java.lang.constant.ConstantDesc) 0);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc31 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc33 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int34 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertEquals("'" + constantDesc33 + "' != '" + 0L + "'", constantDesc33, 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc31 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc33 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean35 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertEquals("'" + constantDesc33 + "' != '" + 0L + "'", constantDesc33, 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int24 = charSequenceLruCache1.size();
        int int25 = charSequenceLruCache1.size();
        boolean boolean27 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.CharSequence charSequence22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get(charSequence22);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.Class<?> wildcardClass27 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence14 = null;
        charSequenceLruCache1.put(charSequence14, (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((int) ' ');
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int16 = charSequenceLruCache1.size();
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int21 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 100 + "'", constantDesc23, 100);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 100L + "'", constantDesc21, 100L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence14 = null;
        boolean boolean15 = charSequenceLruCache1.containsKey(charSequence14);
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        int int18 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        java.lang.CharSequence charSequence18 = null;
        charSequenceLruCache1.put(charSequence18, (java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 100 + "'", constantDesc12, 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>(1);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = constantDesc14.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.Constable> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.Constable>((int) '#');
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>((int) ' ');
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 100L + "'", constantDesc17, 100L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "hi!");
        java.lang.CharSequence charSequence11 = null;
        boolean boolean12 = charSequenceLruCache1.containsKey(charSequence11);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1.0f + "'", constantDesc8, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc25 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc27 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + constantDesc25 + "' != '" + 0.0d + "'", constantDesc25, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc27 + "' != '" + 0.0d + "'", constantDesc27, 0.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>((int) (short) 1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100 + "'", constantDesc16, 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = constantDesc19.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + "hi!" + "'", constantDesc19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int18 = charSequenceLruCache1.size();
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass24 = constantDesc23.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 1.0d + "'", constantDesc23, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = constantDesc6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = constantDesc7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((int) (byte) 100);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = null;
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get(charSequence15);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10 + "'", constantDesc8, 10);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '#');
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        int int16 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc24 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int28 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + (-1.0f) + "'", constantDesc22, (-1.0f));
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int9 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int14 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = null;
        charSequenceLruCache1.put(charSequence11, (java.lang.constant.ConstantDesc) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence15 = null;
        charSequenceLruCache1.put(charSequence15, (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc11 + "' != '" + 0.0f + "'", constantDesc11, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = constantDesc6.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 100 + "'", constantDesc6, 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>((int) ' ');
        java.lang.Class<?> wildcardClass2 = constantDescLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>(100);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int19 = charSequenceLruCache1.size();
        int int20 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        java.lang.Class<?> wildcardClass24 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int6 = charSequenceLruCache1.size();
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        int int17 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc19 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc19);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) ' ');
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.CharSequence charSequence15 = null;
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get(charSequence15);
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0d);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = constantDesc16.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100.0d + "'", constantDesc16, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 10.0f + "'", constantDesc19, 10.0f);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }
}

