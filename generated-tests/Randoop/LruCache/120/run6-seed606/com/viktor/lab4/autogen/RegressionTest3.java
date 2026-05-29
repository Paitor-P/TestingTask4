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
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        int int16 = strLruCache1.size();
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("");
        int int13 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        int int17 = strLruCache1.size();
        java.lang.String str19 = strLruCache1.get("hi!");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        boolean boolean19 = strLruCache1.containsKey("hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.String str23 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.String str16 = strLruCache1.get("");
        strLruCache1.put("", "");
        java.lang.String str21 = strLruCache1.get("hi!");
        boolean boolean23 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.String str14 = strLruCache1.get("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        int int23 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        java.lang.String str13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        java.lang.String str17 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        int int4 = strLruCache1.size();
        java.lang.String str6 = strLruCache1.get("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        java.lang.String str15 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        int int7 = strLruCache1.size();
        java.lang.String str9 = strLruCache1.get("hi!");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        boolean boolean13 = strLruCache1.containsKey("");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.String str16 = strLruCache1.get("");
        strLruCache1.put("", "");
        java.lang.String str21 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        java.lang.String str12 = strLruCache1.get("hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>(100);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str13 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.String str20 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("", "");
        boolean boolean20 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        int int9 = strLruCache1.size();
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("hi!");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.String str11 = strLruCache1.get("");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        java.lang.String str9 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.ConstantDesc> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.constant.ConstantDesc>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.reflect.GenericDeclaration>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = strLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        int int18 = strLruCache1.size();
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.String str15 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        boolean boolean20 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("");
        java.lang.String str12 = strLruCache1.get("");
        java.lang.String str14 = strLruCache1.get("");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        int int14 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        java.lang.String str19 = strLruCache1.get("");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        java.lang.String str13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        int int18 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        java.lang.String str11 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        java.lang.String str22 = strLruCache1.get("hi!");
        boolean boolean24 = strLruCache1.containsKey("");
        boolean boolean26 = strLruCache1.containsKey("");
        int int27 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        java.lang.String str23 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.String str20 = strLruCache1.get("");
        boolean boolean22 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        int int16 = strLruCache1.size();
        java.lang.String str18 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) ' ');
        int int2 = strLruCache1.size();
        boolean boolean4 = strLruCache1.containsKey("hi!");
        int int5 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>((int) (short) 10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("hi!");
        java.lang.String str9 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        java.lang.String str8 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) 10);
        strLruCache1.put("", "hi!");
        strLruCache1.put("", "");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        boolean boolean14 = strLruCache1.containsKey("");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "");
        java.lang.String str6 = strLruCache1.get("hi!");
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        java.lang.String str9 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.String str17 = strLruCache1.get("hi!");
        java.lang.String str19 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>>((int) (short) 100);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.String str16 = strLruCache1.get("hi!");
        java.lang.String str18 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(2);
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (byte) 100);
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        int int4 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Object> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Object>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        int int10 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("hi!");
        int int18 = strLruCache1.size();
        boolean boolean20 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        int int16 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        int int7 = strLruCache1.size();
        java.lang.String str9 = strLruCache1.get("hi!");
        java.lang.String str11 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("", "");
        boolean boolean20 = strLruCache1.containsKey("");
        java.lang.String str22 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        java.lang.String str9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        java.lang.String str12 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean17 = strLruCache1.containsKey("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        int int22 = strLruCache1.size();
        boolean boolean24 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "hi!");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        java.lang.String str16 = strLruCache1.get("");
        int int17 = strLruCache1.size();
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("");
        java.lang.String str12 = strLruCache1.get("");
        int int13 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        java.lang.String str23 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean28 = strLruCache1.containsKey("");
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        strLruCache1.put("hi!", "");
        java.lang.String str16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.String str16 = strLruCache1.get("hi!");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        java.lang.String str12 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        int int13 = strLruCache1.size();
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.String str18 = strLruCache1.get("hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        boolean boolean26 = strLruCache1.containsKey("");
        int int27 = strLruCache1.size();
        java.lang.String str29 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) 10);
        strLruCache1.put("", "hi!");
        int int5 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        java.lang.String str9 = strLruCache1.get("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        java.lang.String str15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("");
        java.lang.String str14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        int int18 = strLruCache1.size();
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.String str14 = strLruCache1.get("hi!");
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        strLruCache1.put("", "");
        int int19 = strLruCache1.size();
        int int20 = strLruCache1.size();
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        strLruCache1.put("", "");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        int int17 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        java.lang.String str16 = strLruCache1.get("");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.String str21 = strLruCache1.get("hi!");
        int int22 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        java.lang.String str9 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = constableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.constant.Constable> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.constant.Constable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        java.lang.String str12 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        java.lang.String str18 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        java.lang.String str3 = strLruCache1.get("hi!");
        int int4 = strLruCache1.size();
        java.lang.String str6 = strLruCache1.get("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("", "");
        java.lang.String str20 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(100);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        java.lang.String str12 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        boolean boolean20 = strLruCache1.containsKey("");
        java.lang.String str22 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        int int16 = strLruCache1.size();
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.String str17 = strLruCache1.get("");
        int int18 = strLruCache1.size();
        int int19 = strLruCache1.size();
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("");
        boolean boolean17 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        boolean boolean22 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        java.lang.String str15 = strLruCache1.get("");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
        int int2 = strLruCache1.size();
        java.lang.String str4 = strLruCache1.get("");
        java.lang.String str6 = strLruCache1.get("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str14 = strLruCache1.get("hi!");
        java.lang.String str16 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.String str20 = strLruCache1.get("");
        int int21 = strLruCache1.size();
        boolean boolean23 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass27 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        int int21 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        java.lang.String str17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        strLruCache1.put("", "");
        int int19 = strLruCache1.size();
        int int20 = strLruCache1.size();
        boolean boolean22 = strLruCache1.containsKey("hi!");
        int int23 = strLruCache1.size();
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        java.lang.String str18 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str10 = strLruCache1.get("");
        java.lang.String str12 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        strLruCache1.put("", "hi!");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        java.lang.String str23 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass24 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        int int18 = strLruCache1.size();
        int int19 = strLruCache1.size();
        java.lang.String str21 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        java.lang.String str20 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass21 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        int int13 = strLruCache1.size();
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("");
        java.lang.String str19 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(1);
        strLruCache1.put("hi!", "");
        java.lang.String str6 = strLruCache1.get("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        java.lang.String str16 = strLruCache1.get("hi!");
        int int17 = strLruCache1.size();
        int int18 = strLruCache1.size();
        int int19 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean20 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        boolean boolean28 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.String str14 = strLruCache1.get("");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        int int24 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.String str29 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        int int9 = strLruCache1.size();
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("");
        boolean boolean16 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.String str16 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) ' ');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.String str17 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        int int15 = strLruCache1.size();
        int int16 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        java.lang.String str22 = strLruCache1.get("");
        java.lang.String str24 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("");
        strLruCache1.put("", "");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.String str17 = strLruCache1.get("");
        int int18 = strLruCache1.size();
        int int19 = strLruCache1.size();
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.String>((int) (short) 100);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        int int18 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.String str20 = strLruCache1.get("");
        int int21 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.Constable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.Constable>(2);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        int int18 = strLruCache1.size();
        boolean boolean20 = strLruCache1.containsKey("");
        java.lang.String str22 = strLruCache1.get("hi!");
        java.lang.String str24 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass25 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        int int21 = strLruCache1.size();
        java.lang.Class<?> wildcardClass22 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        boolean boolean25 = strLruCache1.containsKey("hi!");
        boolean boolean27 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        java.lang.String str18 = strLruCache1.get("hi!");
        java.lang.String str20 = strLruCache1.get("hi!");
        java.lang.String str22 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass23 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        int int15 = strLruCache1.size();
        java.lang.String str17 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        boolean boolean23 = strLruCache1.containsKey("");
        java.lang.String str25 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "hi!");
        int int19 = strLruCache1.size();
        java.lang.String str21 = strLruCache1.get("hi!");
        java.lang.String str23 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        boolean boolean8 = strLruCache1.containsKey("hi!");
        java.lang.String str10 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.String str15 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>>(2);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.String str12 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("");
        int int22 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        int int10 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        java.lang.String str9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        java.lang.String str15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        java.lang.String str23 = strLruCache1.get("");
        java.lang.String str25 = strLruCache1.get("");
        java.lang.String str27 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        int int22 = strLruCache1.size();
        boolean boolean24 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        java.lang.String str16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        java.lang.String str20 = strLruCache1.get("");
        int int21 = strLruCache1.size();
        int int22 = strLruCache1.size();
        boolean boolean24 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass28 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("");
        java.lang.String str19 = strLruCache1.get("");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.String str9 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        int int13 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
        int int2 = strLruCache1.size();
        java.lang.String str4 = strLruCache1.get("");
        java.lang.String str6 = strLruCache1.get("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.String str12 = strLruCache1.get("hi!");
        java.lang.String str14 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        java.lang.String str22 = strLruCache1.get("");
        strLruCache1.put("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        strLruCache1.put("hi!", "");
        boolean boolean13 = strLruCache1.containsKey("");
        int int14 = strLruCache1.size();
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        int int22 = strLruCache1.size();
        boolean boolean24 = strLruCache1.containsKey("hi!");
        boolean boolean26 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Object> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        int int13 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        boolean boolean23 = strLruCache1.containsKey("hi!");
        boolean boolean25 = strLruCache1.containsKey("hi!");
        boolean boolean27 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        java.lang.String str14 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        boolean boolean19 = strLruCache1.containsKey("hi!");
        int int20 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("");
        strLruCache1.put("", "");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        int int7 = strLruCache1.size();
        java.lang.String str9 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.String str17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        int int13 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        strLruCache1.put("hi!", "");
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        java.lang.String str13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        java.lang.String str3 = strLruCache1.get("hi!");
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.String str17 = strLruCache1.get("");
        int int18 = strLruCache1.size();
        boolean boolean20 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        int int27 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        int int19 = strLruCache1.size();
        java.lang.String str21 = strLruCache1.get("");
        boolean boolean23 = strLruCache1.containsKey("");
        boolean boolean25 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        strLruCache1.put("", "hi!");
        boolean boolean24 = strLruCache1.containsKey("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("hi!");
        int int13 = strLruCache1.size();
        int int14 = strLruCache1.size();
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        int int22 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        java.lang.String str27 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("");
        java.lang.String str16 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        int int14 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        boolean boolean19 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.String str17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        boolean boolean24 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        boolean boolean24 = strLruCache1.containsKey("");
        boolean boolean26 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        java.lang.String str14 = strLruCache1.get("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass23 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        java.lang.String str12 = strLruCache1.get("hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        java.lang.String str16 = strLruCache1.get("");
        strLruCache1.put("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.String str14 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "");
        java.lang.String str6 = strLruCache1.get("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        java.lang.String str12 = strLruCache1.get("hi!");
        int int13 = strLruCache1.size();
        java.lang.String str15 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        boolean boolean8 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.String str15 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str20 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str18 = strLruCache1.get("");
        java.lang.String str20 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        int int17 = strLruCache1.size();
        int int18 = strLruCache1.size();
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.constant.ConstantDesc> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.constant.ConstantDesc>((int) (short) 100);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        int int15 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        java.lang.String str9 = strLruCache1.get("hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        int int21 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        int int22 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        boolean boolean23 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.String str17 = strLruCache1.get("");
        java.lang.String str19 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str12 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        int int9 = strLruCache1.size();
        java.lang.String str11 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str18 = strLruCache1.get("");
        boolean boolean20 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str25 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        strLruCache1.put("", "hi!");
        int int22 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        java.lang.String str15 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        java.lang.String str17 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str14 = strLruCache1.get("");
        java.lang.String str16 = strLruCache1.get("");
        java.lang.String str18 = strLruCache1.get("");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '#');
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("hi!");
        java.lang.String str20 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean24 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "");
        java.lang.String str6 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        int int14 = strLruCache1.size();
        boolean boolean16 = strLruCache1.containsKey("hi!");
        int int17 = strLruCache1.size();
        java.lang.String str19 = strLruCache1.get("");
        java.lang.String str21 = strLruCache1.get("hi!");
        int int22 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.String str15 = strLruCache1.get("hi!");
        java.lang.String str17 = strLruCache1.get("");
        boolean boolean19 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        java.lang.String str15 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        java.lang.String str23 = strLruCache1.get("hi!");
        java.lang.String str25 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("hi!");
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        boolean boolean16 = strLruCache1.containsKey("");
        int int17 = strLruCache1.size();
        boolean boolean19 = strLruCache1.containsKey("");
        boolean boolean21 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        java.lang.String str21 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.io.Serializable> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.io.Serializable>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = strLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        java.lang.String str9 = strLruCache1.get("hi!");
        java.lang.String str11 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("");
        java.lang.String str17 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        int int7 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        int int18 = strLruCache1.size();
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "hi!");
        java.lang.Class<?> wildcardClass26 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        strLruCache1.put("", "hi!");
        int int23 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        boolean boolean21 = strLruCache1.containsKey("hi!");
        int int22 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass29 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        java.lang.String str3 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "");
        java.lang.String str19 = strLruCache1.get("hi!");
        java.lang.String str21 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (byte) 100);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>>((int) (byte) 1);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        boolean boolean16 = strLruCache1.containsKey("");
        java.lang.String str18 = strLruCache1.get("hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        boolean boolean24 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        boolean boolean8 = strLruCache1.containsKey("");
        boolean boolean10 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        java.lang.String str12 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str17 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass18 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        java.lang.String str16 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        java.lang.String str3 = strLruCache1.get("hi!");
        int int4 = strLruCache1.size();
        java.lang.String str6 = strLruCache1.get("hi!");
        java.lang.String str8 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 100);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        boolean boolean16 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        int int20 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        boolean boolean11 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        java.lang.String str16 = strLruCache1.get("");
        int int17 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        java.lang.String str16 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        java.lang.String str3 = strLruCache1.get("hi!");
        int int4 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.reflect.Type> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.reflect.Type>((int) 'a');
        java.lang.Class<?> wildcardClass2 = strLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        java.lang.String str9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        boolean boolean17 = strLruCache1.containsKey("");
        boolean boolean19 = strLruCache1.containsKey("hi!");
        java.lang.String str21 = strLruCache1.get("");
        int int22 = strLruCache1.size();
        boolean boolean24 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) 100);
        boolean boolean3 = strLruCache1.containsKey("");
        boolean boolean5 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        boolean boolean17 = strLruCache1.containsKey("");
        java.lang.String str19 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass20 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        int int13 = strLruCache1.size();
        strLruCache1.put("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("hi!");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        strLruCache1.put("", "");
        boolean boolean26 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        strLruCache1.put("", "");
        boolean boolean20 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        java.lang.String str9 = strLruCache1.get("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("hi!");
        boolean boolean16 = strLruCache1.containsKey("");
        int int17 = strLruCache1.size();
        int int18 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) 'a');
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable>(2);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        boolean boolean23 = strLruCache1.containsKey("");
        boolean boolean25 = strLruCache1.containsKey("");
        boolean boolean27 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        java.lang.String str10 = strLruCache1.get("hi!");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        int int14 = strLruCache1.size();
        java.lang.String str16 = strLruCache1.get("hi!");
        java.lang.String str18 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>(1);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        int int6 = strLruCache1.size();
        java.lang.String str8 = strLruCache1.get("hi!");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        strLruCache1.put("", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.viktor.lab4.LruCache<java.lang.String, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, com.viktor.lab4.LruCache<java.lang.String, java.lang.String>>((int) '#');
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.String str9 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        java.lang.String str23 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.String str11 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int15 = strLruCache1.size();
        java.lang.Class<?> wildcardClass16 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable>((int) (byte) 10);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("", "");
        java.lang.String str15 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean20 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        boolean boolean25 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        java.lang.String str10 = strLruCache1.get("");
        boolean boolean12 = strLruCache1.containsKey("");
        boolean boolean14 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        int int14 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        int int18 = strLruCache1.size();
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("");
        boolean boolean15 = strLruCache1.containsKey("");
        java.lang.String str17 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        boolean boolean16 = strLruCache1.containsKey("hi!");
        boolean boolean18 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        boolean boolean18 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass19 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean18 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "hi!");
        boolean boolean29 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        int int15 = strLruCache1.size();
        boolean boolean17 = strLruCache1.containsKey("hi!");
        int int18 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        boolean boolean7 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        java.lang.String str19 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '#');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.String str12 = strLruCache1.get("hi!");
        java.lang.String str14 = strLruCache1.get("hi!");
        java.lang.String str16 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        java.lang.String str9 = strLruCache1.get("");
        boolean boolean11 = strLruCache1.containsKey("hi!");
        int int12 = strLruCache1.size();
        boolean boolean14 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str19 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        strLruCache1.put("hi!", "");
        java.lang.String str17 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        java.lang.String str21 = strLruCache1.get("");
        java.lang.String str23 = strLruCache1.get("");
        boolean boolean25 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        java.lang.String str9 = strLruCache1.get("");
        int int10 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        int int23 = strLruCache1.size();
        java.lang.String str25 = strLruCache1.get("");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str25);
    }
}

