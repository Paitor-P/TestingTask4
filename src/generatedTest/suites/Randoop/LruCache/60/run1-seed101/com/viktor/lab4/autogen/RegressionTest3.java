package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        int int17 = strLruCache1.size();
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        int int12 = strLruCache1.size();
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean12 = strLruCache1.containsKey("");
        int int13 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence23 = strLruCache1.get("");
        java.lang.CharSequence charSequence25 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.CharSequence charSequence25 = strLruCache1.get("");
        java.lang.CharSequence charSequence27 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertNull(charSequence27);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int9 = strLruCache1.size();
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        int int19 = strLruCache1.size();
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String>(2);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence18 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        java.lang.CharSequence charSequence22 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "hi!" + "'", charSequence22, "hi!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        int int20 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean25 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int9 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        int int20 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int24 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        java.lang.CharSequence charSequence9 = null;
        strLruCache1.put("hi!", charSequence9);
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        java.lang.Class<?> wildcardClass23 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.CharSequence charSequence26 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int7 = strLruCache1.size();
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        java.lang.CharSequence charSequence8 = strLruCache1.get("");
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean25 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Object>((int) (byte) 1);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        java.lang.CharSequence charSequence13 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("");
        boolean boolean18 = strLruCache1.containsKey("");
        int int19 = strLruCache1.size();
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence23 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "hi!" + "'", charSequence23, "hi!");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        int int31 = strLruCache1.size();
        boolean boolean33 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "" + "'", charSequence25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        int int23 = strLruCache1.size();
        int int24 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        boolean boolean8 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        java.lang.CharSequence charSequence3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        int int19 = strLruCache1.size();
        java.lang.CharSequence charSequence21 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(charSequence21);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        boolean boolean21 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 1);
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int10 = strLruCache1.size();
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence12 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        int int4 = strLruCache1.size();
        java.lang.CharSequence charSequence6 = null;
        strLruCache1.put("", charSequence6);
        int int8 = strLruCache1.size();
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.CharSequence charSequence26 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        int int30 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "" + "'", charSequence21, "");
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "" + "'", charSequence26, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        java.lang.CharSequence charSequence4 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        java.lang.CharSequence charSequence5 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        java.lang.CharSequence charSequence3 = strLruCache1.get("");
        int int4 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.CharSequence charSequence14 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence16 = strLruCache1.get("");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.CharSequence charSequence10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        int int2 = strLruCache1.size();
        int int3 = strLruCache1.size();
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        java.lang.CharSequence charSequence7 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int13 = strLruCache1.size();
        java.lang.CharSequence charSequence15 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence17 = null;
        strLruCache1.put("hi!", charSequence17);
        java.lang.CharSequence charSequence20 = strLruCache1.get("");
        java.lang.CharSequence charSequence22 = strLruCache1.get("hi!");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(1);
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence5 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence19 = strLruCache1.get("");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>((int) '4');
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = strLruCache1.get("");
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
        int int10 = strLruCache1.size();
        java.lang.CharSequence charSequence12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) '4');
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        strLruCache1.put("", (java.lang.CharSequence) "");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        strLruCache1.put("hi!", (java.lang.CharSequence) "hi!");
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        strLruCache1.put("hi!", charSequence3);
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        java.lang.CharSequence charSequence8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        strLruCache1.put("", (java.lang.CharSequence) "");
        int int15 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        int int19 = strLruCache1.size();
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence24 = strLruCache1.get("hi!");
        java.lang.CharSequence charSequence26 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + charSequence24 + "' != '" + "" + "'", charSequence24, "");
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "" + "'", charSequence26, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        boolean boolean22 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>(100);
        strLruCache1.put("hi!", (java.lang.CharSequence) "");
        strLruCache1.put("", (java.lang.CharSequence) "hi!");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.CharSequence charSequence11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

