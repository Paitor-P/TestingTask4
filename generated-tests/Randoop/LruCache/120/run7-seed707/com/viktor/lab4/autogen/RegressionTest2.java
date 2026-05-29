package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        java.lang.Class<?> wildcardClass26 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.constant.ConstantDesc constantDesc25 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc27 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        int int31 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc25 + "' != '" + (-1L) + "'", constantDesc25, (-1L));
        org.junit.Assert.assertNull(constantDesc27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "hi!");
        java.lang.CharSequence charSequence11 = null;
        boolean boolean12 = charSequenceLruCache1.containsKey(charSequence11);
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        int int9 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 10 + "'", constantDesc13, 10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 100 + "'", constantDesc17, 100);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 1 + "'", constantDesc18, 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        int int35 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc37 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc37 + "' != '" + 1 + "'", constantDesc37, 1);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        java.lang.CharSequence charSequence21 = null;
        charSequenceLruCache1.put(charSequence21, (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 1L + "'", constantDesc18, 1L);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 1L + "'", constantDesc20, 1L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        int int26 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1));
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + "" + "'", constantDesc12, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = null;
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get(charSequence15);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc7 + "' != '" + 100 + "'", constantDesc7, 100);
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 100 + "'", constantDesc9, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 100 + "'", constantDesc13, 100);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.CharSequence charSequence21 = null;
        boolean boolean22 = charSequenceLruCache1.containsKey(charSequence21);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        int int12 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        int int18 = charSequenceLruCache1.size();
        int int19 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        int int12 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0L + "'", constantDesc19, 0L);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>>((int) ' ');
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 10 + "'", constantDesc20, 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.GenericDeclaration> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.GenericDeclaration>((int) 'a');
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        boolean boolean28 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(constantDesc20);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc15 + "' != '" + 10 + "'", constantDesc15, 10);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 0.0f + "'", constantDesc8, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 100 + "'", constantDesc17, 100);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 10 + "'", constantDesc12, 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int18 = charSequenceLruCache1.size();
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        boolean boolean28 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc30 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc32 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(constantDesc30);
        org.junit.Assert.assertNull(constantDesc32);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + "" + "'", constantDesc12, "");
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int9 = charSequenceLruCache1.size();
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 10 + "'", constantDesc13, 10);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Object> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Object>((int) '#');
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.io.Serializable>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1));
        java.lang.CharSequence charSequence15 = null;
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get(charSequence15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type>((int) (byte) 10);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.Class<?> wildcardClass28 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc9);
        int int11 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int21 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(constantDesc20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int6 = charSequenceLruCache1.size();
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>((int) (short) 100);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0L + "'", constantDesc21, 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>(3);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10 + "'", constantDesc8, 10);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 1 + "'", constantDesc18, 1);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + (-1.0f) + "'", constantDesc17, (-1.0f));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1));
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        int int17 = charSequenceLruCache1.size();
        int int18 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.CharSequence charSequence23 = null;
        boolean boolean24 = charSequenceLruCache1.containsKey(charSequence23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0 + "'", constantDesc19, 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) (byte) 100);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        java.lang.Class<?> wildcardClass24 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 10 + "'", constantDesc20, 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.constant.ConstantDesc constantDesc25 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(constantDesc25);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = null;
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get(charSequence10);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 100.0f + "'", constantDesc21, 100.0f);
        org.junit.Assert.assertNull(constantDesc23);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        int int6 = charSequenceLruCache1.size();
        int int7 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + (-1.0d) + "'", constantDesc18, (-1.0d));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + "" + "'", constantDesc12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + "" + "'", constantDesc16, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass28 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        int int8 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        int int25 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc>(3);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1 + "'", constantDesc19, 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + (-1L) + "'", constantDesc22, (-1L));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = constantDesc21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(constantDesc21);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + (-1.0d) + "'", constantDesc21, (-1.0d));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>((int) 'a');
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean25 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        charSequenceLruCache1.put(charSequence11, (java.lang.constant.ConstantDesc) 0);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.CharSequence charSequence10 = null;
        charSequenceLruCache1.put(charSequence10, (java.lang.constant.ConstantDesc) 0);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.CharSequence> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.CharSequence>((int) (byte) 1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int6 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int23 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + "hi!" + "'", constantDesc22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.AnnotatedElement> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.AnnotatedElement>(1);
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100 + "'", constantDesc18, 100);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        java.lang.CharSequence charSequence12 = null;
        java.lang.constant.ConstantDesc constantDesc13 = null;
        charSequenceLruCache1.put(charSequence12, constantDesc13);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10 + "'", constantDesc8, 10);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = null;
        boolean boolean14 = charSequenceLruCache1.containsKey(charSequence13);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 0.0d + "'", constantDesc12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int20 = charSequenceLruCache1.size();
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass23 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = null;
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get(charSequence20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0 + "'", constantDesc19, 0);
        org.junit.Assert.assertNull(constantDesc21);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        int int8 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = constantDesc10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
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
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1.0f + "'", constantDesc16, 1.0f);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 0.0f + "'", constantDesc13, 0.0f);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1L);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        int int18 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        int int18 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc4 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        int int17 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        int int24 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc26 + "' != '" + 0.0f + "'", constantDesc26, 0.0f);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.reflect.AnnotatedElement> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.CharSequence> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.CharSequence charSequence11 = null;
        charSequenceLruCache1.put(charSequence11, (java.lang.constant.ConstantDesc) 100L);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 100 + "'", constantDesc17, 100);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        int int20 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(constantDesc22);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0d);
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100 + "'", constantDesc16, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 0.0f + "'", constantDesc17, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.CharSequence> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.CharSequence>((int) (short) 10);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNull(constantDesc17);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertEquals("'" + constantDesc15 + "' != '" + (-1.0d) + "'", constantDesc15, (-1.0d));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        java.lang.constant.ConstantDesc constantDesc33 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertNull(constantDesc33);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(100);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        int int16 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int6 = charSequenceLruCache1.size();
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1L);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 1L + "'", constantDesc13, 1L);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.lang.Class<?> wildcardClass27 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10.0f + "'", constantDesc22, 10.0f);
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertNull(constantDesc26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.Class<?> wildcardClass23 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1 + "'", constantDesc19, 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 10 + "'", constantDesc13, 10);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        java.lang.constant.ConstantDesc constantDesc35 = charSequenceLruCache1.get((java.lang.CharSequence) "");
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
        org.junit.Assert.assertEquals("'" + constantDesc35 + "' != '" + 100L + "'", constantDesc35, 100L);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 100.0d + "'", constantDesc13, 100.0d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int20 = charSequenceLruCache1.size();
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(constantDesc20);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.CharSequence charSequence10 = null;
        charSequenceLruCache1.put(charSequence10, (java.lang.constant.ConstantDesc) 0);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = constantDesc12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 10 + "'", constantDesc12, 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int6 = charSequenceLruCache1.size();
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1L);
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 10 + "'", constantDesc13, 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 3);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        int int7 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 1.0d + "'", constantDesc18, 1.0d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        int int25 = charSequenceLruCache1.size();
        int int26 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 100.0f + "'", constantDesc21, 100.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(3);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc15 + "' != '" + 100.0f + "'", constantDesc15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100 + "'", constantDesc16, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.constant.ConstantDesc constantDesc20 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1.0f + "'", constantDesc16, 1.0f);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0d);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100.0d + "'", constantDesc16, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        int int25 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc27 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean29 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10.0f + "'", constantDesc22, 10.0f);
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(constantDesc27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>(2);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = null;
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get(charSequence14);
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + (-1.0d) + "'", constantDesc17, (-1.0d));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0d);
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = constantDesc11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10 + "'", constantDesc8, 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.constant.ConstantDesc constantDesc25 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + constantDesc25 + "' != '" + 0.0d + "'", constantDesc25, 0.0d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.constant.ConstantDesc constantDesc24 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc24);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        java.lang.CharSequence charSequence13 = null;
        boolean boolean14 = charSequenceLruCache1.containsKey(charSequence13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int24 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 1.0f + "'", constantDesc23, 1.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100L + "'", constantDesc18, 100L);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100 + "'", constantDesc16, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        int int9 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        java.lang.CharSequence charSequence21 = null;
        boolean boolean22 = charSequenceLruCache1.containsKey(charSequence21);
        java.lang.Class<?> wildcardClass23 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.Class<?> wildcardClass27 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0d);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence18 = null;
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get(charSequence18);
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100.0d + "'", constantDesc16, 100.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 100 + "'", constantDesc23, 100);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc15 + "' != '" + 100.0f + "'", constantDesc15, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>((int) (byte) 10);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int18 = charSequenceLruCache1.size();
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1L));
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.CharSequence charSequence15 = null;
        boolean boolean16 = charSequenceLruCache1.containsKey(charSequence15);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int20 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int22 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100 + "'", constantDesc16, 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int25 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        int int26 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        java.lang.CharSequence charSequence18 = null;
        boolean boolean19 = charSequenceLruCache1.containsKey(charSequence18);
        int int20 = charSequenceLruCache1.size();
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int27 = charSequenceLruCache1.size();
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
        org.junit.Assert.assertEquals("'" + constantDesc26 + "' != '" + 100 + "'", constantDesc26, 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 3);
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
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.Constable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.Constable>((int) (short) 100);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(2);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = null;
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get(charSequence10);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 0.0f + "'", constantDesc8, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass5 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((int) (byte) 10);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.CharSequence charSequence21 = null;
        charSequenceLruCache1.put(charSequence21, (java.lang.constant.ConstantDesc) 10L);
        java.lang.Class<?> wildcardClass24 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 100 + "'", constantDesc12, 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.Constable> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.Constable>(2);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 100 + "'", constantDesc12, 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1.0f + "'", constantDesc16, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object>((int) (byte) 100);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        int int26 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence27 = null;
        charSequenceLruCache1.put(charSequence27, (java.lang.constant.ConstantDesc) 100L);
        java.lang.constant.ConstantDesc constantDesc31 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(constantDesc31);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int20 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int23 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int24 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int18 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0);
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc18 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc18);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        int int11 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean28 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 0.0f + "'", constantDesc12, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        java.lang.CharSequence charSequence22 = null;
        boolean boolean23 = charSequenceLruCache1.containsKey(charSequence22);
        boolean boolean25 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int26 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (short) 10);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(1);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        int int23 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.viktor.lab4.LruCache<java.lang.Object, java.io.Serializable> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.io.Serializable>((int) (byte) 10);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int20 = charSequenceLruCache1.size();
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10.0f + "'", constantDesc18, 10.0f);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1L);
        java.lang.Class<?> wildcardClass23 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = null;
        boolean boolean12 = charSequenceLruCache1.containsKey(charSequence11);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get(charSequence7);
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        int int22 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + 10 + "'", constantDesc20, 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int14 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + (-1.0d) + "'", constantDesc16, (-1.0d));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        java.lang.constant.ConstantDesc constantDesc22 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc24 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass25 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 1 + "'", constantDesc22, 1);
        org.junit.Assert.assertEquals("'" + constantDesc24 + "' != '" + 10.0d + "'", constantDesc24, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        java.lang.constant.ConstantDesc constantDesc24 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int25 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        int int2 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        java.lang.CharSequence charSequence23 = null;
        java.lang.constant.ConstantDesc constantDesc24 = charSequenceLruCache1.get(charSequence23);
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = constantDesc26.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertNull(constantDesc26);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        int int22 = charSequenceLruCache1.size();
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(constantDesc26);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>((int) (byte) 100);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1.0f + "'", constantDesc6, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = constantDesc13.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 0 + "'", constantDesc13, 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = null;
        boolean boolean13 = charSequenceLruCache1.containsKey(charSequence12);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        int int14 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10.0d + "'", constantDesc16, 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) '#');
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        int int17 = charSequenceLruCache1.size();
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        int int17 = charSequenceLruCache1.size();
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
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 3);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 10.0d + "'", constantDesc9, 10.0d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc13 + "' != '" + 100 + "'", constantDesc13, 100);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = null;
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get(charSequence18);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>((int) '4');
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc9);
        int int11 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        boolean boolean27 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int28 = charSequenceLruCache1.size();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence25 = null;
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get(charSequence25);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(constantDesc26);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.CharSequence charSequence17 = null;
        charSequenceLruCache1.put(charSequence17, (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertEquals("'" + constantDesc15 + "' != '" + (-1L) + "'", constantDesc15, (-1L));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int18 = charSequenceLruCache1.size();
        int int19 = charSequenceLruCache1.size();
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + (-1.0d) + "'", constantDesc17, (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 100 + "'", constantDesc14, 100);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor>((int) (short) 1);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) 'a');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        boolean boolean29 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass30 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 0.0f + "'", constantDesc16, 0.0f);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 10 + "'", constantDesc19, 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        charSequenceLruCache1.put(charSequence9, (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 3);
        java.lang.CharSequence charSequence19 = null;
        boolean boolean20 = charSequenceLruCache1.containsKey(charSequence19);
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc13 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc13);
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(2);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1));
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>((int) '#');
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        int int23 = charSequenceLruCache1.size();
        boolean boolean25 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence26 = null;
        java.lang.constant.ConstantDesc constantDesc27 = charSequenceLruCache1.get(charSequence26);
        boolean boolean29 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(constantDesc27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
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
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10 + "'", constantDesc16, 10);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 10 + "'", constantDesc18, 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10L);
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int24 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass25 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 10L + "'", constantDesc19, 10L);
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = constantDesc8.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10 + "'", constantDesc8, 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1L);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
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
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100 + "'", constantDesc16, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        java.lang.CharSequence charSequence18 = null;
        boolean boolean19 = charSequenceLruCache1.containsKey(charSequence18);
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc23 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc23);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 10.0f + "'", constantDesc21, 10.0f);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 2);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        int int13 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) "");
        java.lang.constant.ConstantDesc constantDesc11 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", constantDesc11);
        java.lang.constant.ConstantDesc constantDesc14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 10 + "'", constantDesc10, 10);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 100 + "'", constantDesc12, 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 3);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(10);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        int int5 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc7 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", constantDesc7);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1.0f));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc24 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(constantDesc20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(constantDesc24);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String>(10);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        boolean boolean28 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        int int17 = charSequenceLruCache1.size();
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 10 + "'", constantDesc17, 10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc28 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertNull(constantDesc26);
        org.junit.Assert.assertNull(constantDesc28);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 3);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        boolean boolean25 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int26 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10.0f + "'", constantDesc22, 10.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int27 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 0.0d + "'", constantDesc19, 0.0d);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0.0d + "'", constantDesc21, 0.0d);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10 + "'", constantDesc8, 10);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = null;
        charSequenceLruCache1.put(charSequence12, (java.lang.constant.ConstantDesc) 1L);
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        java.lang.CharSequence charSequence21 = null;
        boolean boolean22 = charSequenceLruCache1.containsKey(charSequence21);
        int int23 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass24 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Object> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Object>((int) 'a');
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = null;
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get(charSequence20);
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int9 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 10 + "'", constantDesc21, 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        int int28 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc30 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(constantDesc30);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        int int17 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0.0f + "'", constantDesc6, 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 1.0d + "'", constantDesc18, 1.0d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        int int10 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence11 = null;
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get(charSequence11);
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc constantDesc16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1.0f + "'", constantDesc16, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.lang.constant.ConstantDesc constantDesc20 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc20 + "' != '" + (-1.0d) + "'", constantDesc20, (-1.0d));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        int int25 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        java.lang.CharSequence charSequence5 = null;
        charSequenceLruCache1.put(charSequence5, (java.lang.constant.ConstantDesc) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) "hi!");
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1.0f + "'", constantDesc17, 1.0f);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + 1.0f + "'", constantDesc19, 1.0f);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + "" + "'", constantDesc19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.String>(1);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        boolean boolean34 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        boolean boolean8 = charSequenceLruCache1.containsKey(charSequence7);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1);
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = null;
        java.lang.constant.ConstantDesc constantDesc21 = charSequenceLruCache1.get(charSequence20);
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc25 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int26 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc25 + "' != '" + 100L + "'", constantDesc25, 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        int int7 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0.0d);
        java.lang.constant.ConstantDesc constantDesc12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 0.0d + "'", constantDesc12, 0.0d);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get(charSequence5);
        java.lang.constant.ConstantDesc constantDesc8 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get(charSequence9);
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        java.lang.Class<?> wildcardClass27 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(100);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        java.lang.constant.ConstantDesc constantDesc23 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean25 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass26 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0L + "'", constantDesc21, 0L);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get(charSequence8);
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 1);
        int int15 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0f);
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100L);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        java.lang.constant.ConstantDesc constantDesc26 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 0L + "'", constantDesc21, 0L);
        org.junit.Assert.assertNull(constantDesc26);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        java.lang.Class<?> wildcardClass35 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertEquals("'" + constantDesc31 + "' != '" + 0L + "'", constantDesc31, 0L);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.lang.constant.ConstantDesc constantDesc19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + constantDesc19 + "' != '" + "" + "'", constantDesc19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 0.0f);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 0L);
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = null;
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get(charSequence10);
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 100L);
        int int15 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int7 = charSequenceLruCache1.size();
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) (-1.0d));
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 2);
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.lang.constant.ConstantDesc constantDesc18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 100 + "'", constantDesc16, 100);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 100 + "'", constantDesc18, 100);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        java.lang.constant.ConstantDesc constantDesc11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 10);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int17 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100.0d);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc constantDesc3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.constant.ConstantDesc) 1.0d);
        int int7 = charSequenceLruCache1.size();
        java.lang.constant.ConstantDesc constantDesc9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.constant.ConstantDesc constantDesc15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.constant.ConstantDesc) 100);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + constantDesc15 + "' != '" + 1.0d + "'", constantDesc15, 1.0d);
    }
}

