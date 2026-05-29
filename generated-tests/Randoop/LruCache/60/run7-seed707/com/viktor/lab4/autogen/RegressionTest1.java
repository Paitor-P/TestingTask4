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
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (short) 1);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (byte) 100);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        int int24 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0d);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100.0d + "'", constantDesc16, 100.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        java.lang.constant.ConstantDesc constantDesc27 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertEquals("'" + constantDesc27 + "' != '" + 0.0f + "'", constantDesc27, 0.0f);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(2);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(10);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable>(10);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
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
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        charSequenceLruCache1.put(charSequence11, (java.lang.constant.ConstantDesc) 0);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type>((int) (byte) 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
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
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        int int5 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type>((int) '4');
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.io.Serializable>(2);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
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
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        java.lang.CharSequence charSequence21 = null;
        charSequenceLruCache1.put(charSequence21, (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>((int) (short) 1);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.constant.ConstantDesc> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.constant.ConstantDesc>(100);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1.0f + "'", constantDesc6, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1.0f + "'", constantDesc8, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 1.0f + "'", constantDesc10, 1.0f);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        boolean boolean37 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
        boolean boolean30 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(constantDesc25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor>((int) (short) 10);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.CharSequence charSequence10 = null;
        charSequenceLruCache1.put(charSequence10, (java.lang.constant.ConstantDesc) 0);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
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
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) 'a');
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10.0f + "'", constantDesc16, 10.0f);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1));
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc15 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc15);
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc6 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc6);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object>((int) 'a');
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 10 + "'", constantDesc20, 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        boolean boolean25 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
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
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
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
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc15 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc15);
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        java.lang.Class<?> wildcardClass6 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
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
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
        int int18 = charSequenceLruCache1.size();
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 100.0f + "'", constantDesc21, 100.0f);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        java.lang.CharSequence charSequence21 = null;
        charSequenceLruCache1.put(charSequence21, (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>((int) (short) 100);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
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
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
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
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = null;
        boolean boolean17 = charSequenceLruCache1.containsKey(charSequence16);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        charSequenceLruCache1.put(charSequence11, (java.lang.constant.ConstantDesc) 0);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        int int7 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 10 + "'", constantDesc19, 10);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 10);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
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
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + "" + "'", constantDesc19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 10 + "'", constantDesc20, 10);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
        int int22 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 0.0f + "'", constantDesc12, 0.0f);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
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
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
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
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = null;
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get(charSequence10);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
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
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
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
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0L + "'", constantDesc21, 0L);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
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
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        java.lang.CharSequence charSequence15 = null;
        boolean boolean16 = charSequenceLruCache1.containsKey(charSequence15);
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        int int8 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence9 = null;
        boolean boolean10 = charSequenceLruCache1.containsKey(charSequence9);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
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
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
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
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((int) ' ');
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
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
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
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
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int9 = charSequenceLruCache1.size();
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
        int int32 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
        java.lang.constant.ConstantDesc constantDesc24 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc28 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10.0f + "'", constantDesc22, 10.0f);
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertNull(constantDesc26);
        org.junit.Assert.assertNull(constantDesc28);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc7);
        int int9 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>(10);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
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
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
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
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 0.0d + "'", constantDesc12, 0.0d);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        int int18 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
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
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 10 + "'", constantDesc13, 10);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
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
        java.lang.constant.ConstantDesc constantDesc25 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc25 + "' != '" + 0.0d + "'", constantDesc25, 0.0d);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
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
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1 + "'", constantDesc17, 1);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>(1);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertEquals("'" + constantDesc26 + "' != '" + (-1.0d) + "'", constantDesc26, (-1.0d));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
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
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.Constable> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.Constable>((int) '#');
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>((int) ' ');
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
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
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
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
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = null;
        charSequenceLruCache1.put(charSequence12, (java.lang.constant.ConstantDesc) 1L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
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
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>((int) (short) 1);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
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
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
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
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
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
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        int int9 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
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
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc19 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc19);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
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
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = null;
        charSequenceLruCache1.put(charSequence14, (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        int int18 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
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
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
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
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
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
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
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
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 1L + "'", constantDesc14, 1L);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
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
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
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
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
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
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence15 = null;
        charSequenceLruCache1.put(charSequence15, (java.lang.constant.ConstantDesc) 100L);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
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
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 100 + "'", constantDesc22, 100);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1L);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
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
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
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
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
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
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence14 = null;
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get(charSequence14);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int18 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((int) (byte) 100);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
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
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 0.0f + "'", constantDesc23, 0.0f);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
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
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
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
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
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
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
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
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        charSequenceLruCache1.put(charSequence11, (java.lang.constant.ConstantDesc) 0);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 0.0d + "'", constantDesc12, 0.0d);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
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
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '#');
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
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
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
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
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
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
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
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
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1.0d + "'", constantDesc16, 1.0d);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
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
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
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
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
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
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = constantDesc6.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 100 + "'", constantDesc6, 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
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
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>((int) ' ');
        java.lang.Class<?> wildcardClass2 = constantDescLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
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
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
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
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>(100);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        boolean boolean36 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
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
        java.lang.constant.ConstantDesc constantDesc23 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc23);
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
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
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 1 + "'", constantDesc18, 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
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
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
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
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>((int) (byte) 10);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
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
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 100.0f + "'", constantDesc21, 100.0f);
    }
}

