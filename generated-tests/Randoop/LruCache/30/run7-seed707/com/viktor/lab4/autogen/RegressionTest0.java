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
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(100);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        int int9 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 100 + "'", constantDesc6, 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.Class<?> wildcardClass8 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10.0f + "'", constantDesc22, 10.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence>((int) '4');
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        int int8 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int5 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1.0f + "'", constantDesc6, 1.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>(10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (short) 100);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = constantDesc6.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10 + "'", constantDesc8, 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.CharSequence charSequence10 = null;
        charSequenceLruCache1.put(charSequence10, (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) ' ');
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        int int2 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) ' ');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable>(10);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        charSequenceLruCache1.put(charSequence11, (java.lang.constant.ConstantDesc) 0);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.Class<?>> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.Class<?>>((int) '#');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (short) 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence15 = null;
        charSequenceLruCache1.put(charSequence15, (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>(10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>((int) ' ');
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100 + "'", constantDesc18, 100);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 100 + "'", constantDesc20, 100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 100 + "'", constantDesc19, 100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc22);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 100 + "'", constantDesc12, 100);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>(1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc9);
        int int11 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int18 = charSequenceLruCache1.size();
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>((int) ' ');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(2);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) 'a');
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        int int5 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        int int18 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + "" + "'", constantDesc19, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
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
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = null;
        java.lang.constant.ConstantDesc constantDesc20 = null;
        charSequenceLruCache1.put(charSequence19, constantDesc20);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        int int20 = charSequenceLruCache1.size();
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        int int8 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        java.lang.constant.ConstantDesc constantDesc22 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc22);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc7 + "' != '" + 100 + "'", constantDesc7, 100);
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 100 + "'", constantDesc9, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((int) (byte) 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }
}

