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
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable11);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int18 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        int int3 = charSequenceLruCache1.size();
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable19);
        int int21 = charSequenceLruCache1.size();
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparable17.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int14 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable11);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.CharSequence charSequence16 = null;
        boolean boolean17 = charSequenceLruCache1.containsKey(charSequence16);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int22 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass23 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strComparable21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>>(10);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable13);
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "hi!" + "'", strComparable21, "hi!");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable3 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        org.junit.Assert.assertNull(strComparable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int24 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass25 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "" + "'", strComparable7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(1);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration>((int) (byte) 1);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        int int3 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = null;
        java.lang.Comparable<java.lang.String> strComparable20 = charSequenceLruCache1.get(charSequence19);
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(1);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        int int20 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "" + "'", strComparable16, "");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int20 = charSequenceLruCache1.size();
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) 'a');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable26 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable24 + "' != '" + "hi!" + "'", strComparable24, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable26 + "' != '" + "hi!" + "'", strComparable26, "hi!");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int18 = charSequenceLruCache1.size();
        int int19 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable21 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "hi!" + "'", strComparable21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) (byte) 10);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>((int) '4');
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(2);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) 'a');
        java.lang.Class<?> wildcardClass2 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = strComparable9.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence>(2);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int18 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable23 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "" + "'", strComparable23, "");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable11);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "" + "'", strComparable16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int10 = charSequenceLruCache1.size();
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "" + "'", strComparable7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence12 = null;
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get(charSequence12);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable11);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int18 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.CharSequence charSequence18 = null;
        boolean boolean19 = charSequenceLruCache1.containsKey(charSequence18);
        int int20 = charSequenceLruCache1.size();
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        int int17 = charSequenceLruCache1.size();
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence12 = null;
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get(charSequence12);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>, java.lang.invoke.TypeDescriptor> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>, java.lang.invoke.TypeDescriptor>((int) '4');
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable19);
        int int21 = charSequenceLruCache1.size();
        int int22 = charSequenceLruCache1.size();
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int25 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        int int17 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable13);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(1);
        java.lang.CharSequence charSequence2 = null;
        charSequenceLruCache1.put(charSequence2, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int7 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "" + "'", strComparable7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable9);
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>>((int) (short) 100);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int11 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int18 = charSequenceLruCache1.size();
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.CharSequence charSequence19 = null;
        charSequenceLruCache1.put(charSequence19, (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int14 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>((int) (short) 10);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int22 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence23 = null;
        boolean boolean24 = charSequenceLruCache1.containsKey(charSequence23);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "" + "'", strComparable7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable13);
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = null;
        boolean boolean20 = charSequenceLruCache1.containsKey(charSequence19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "" + "'", strComparable16, "");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable19);
        java.lang.Comparable<java.lang.String> strComparable22 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "" + "'", strComparable22, "");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + strComparable6 + "' != '" + "" + "'", strComparable6, "");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int20 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int4 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable6 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = null;
        boolean boolean15 = charSequenceLruCache1.containsKey(charSequence14);
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int8 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = charSequenceLruCache1.size();
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int10 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        int int3 = charSequenceLruCache1.size();
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceLruCache1.containsKey(charSequence8);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable25 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable27 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + strComparable25 + "' != '" + "" + "'", strComparable25, "");
        org.junit.Assert.assertEquals("'" + strComparable27 + "' != '" + "" + "'", strComparable27, "");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable9);
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(strComparable19);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (short) 100);
        java.lang.CharSequence charSequence2 = null;
        boolean boolean3 = charSequenceLruCache1.containsKey(charSequence2);
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(1);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "" + "'", strComparable16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        int int15 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence16 = null;
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get(charSequence16);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        boolean boolean4 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.io.Serializable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.io.Serializable>((int) (byte) 10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "" + "'", strComparable20, "");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable5);
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable9);
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int8 = charSequenceLruCache1.size();
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass7 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", strComparable20);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        boolean boolean4 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.AnnotatedElement> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.AnnotatedElement>((int) '#');
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int14 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass16 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strComparable13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>(100);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable4 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strComparable4);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.CharSequence charSequence15 = null;
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get(charSequence15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable25 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass26 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + strComparable25 + "' != '" + "" + "'", strComparable25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "" + "'", strComparable7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable23 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "" + "'", strComparable23, "");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        boolean boolean4 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean6 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable9);
        int int11 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable19 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(strComparable19);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>(1);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (short) 10);
        int int2 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass3 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + strComparable28 + "' != '" + "" + "'", strComparable28, "");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) '#');
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean22 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.CharSequence charSequence18 = null;
        boolean boolean19 = charSequenceLruCache1.containsKey(charSequence18);
        java.lang.Comparable<java.lang.String> strComparable21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "" + "'", strComparable21, "");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int4 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int22 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int22 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "" + "'", strComparable16, "");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>, java.io.Serializable> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>, java.lang.String> charSequenceLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>, java.lang.String>((int) (short) 1);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int12 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass13 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparable9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable20);
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "", strComparable14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        int int14 = charSequenceLruCache1.size();
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = null;
        charSequenceLruCache1.put(charSequence17, (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (short) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = charSequenceLruCache1.size();
        int int19 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable19);
        int int21 = charSequenceLruCache1.size();
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int27 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int8 = charSequenceLruCache1.size();
        int int9 = charSequenceLruCache1.size();
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable14);
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable11);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.CharSequence charSequence16 = null;
        boolean boolean17 = charSequenceLruCache1.containsKey(charSequence16);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable21 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int22 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable24 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strComparable21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNull(strComparable24);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable9);
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass18 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass22 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "" + "'", strComparable16, "");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int19 = charSequenceLruCache1.size();
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence22 = null;
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        charSequenceLruCache1.put(charSequence22, strComparable23);
        boolean boolean26 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int18 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int22 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int17 = charSequenceLruCache1.size();
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        charSequenceLruCache1.put(charSequence8, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int19 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable9);
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int13 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int16 = charSequenceLruCache1.size();
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int19 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(1);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        int int17 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean24 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass25 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "" + "'", strComparable22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int12 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable14);
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = charSequenceLruCache1.size();
        int int19 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int18 = charSequenceLruCache1.size();
        boolean boolean20 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int6 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable8 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int15 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Object>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        int int6 = charSequenceLruCache1.size();
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable20 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "" + "'", strComparable20, "");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = null;
        charSequenceLruCache1.put(charSequence13, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable19);
        int int21 = charSequenceLruCache1.size();
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int27 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable16 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = null;
        java.lang.Comparable<java.lang.String> strComparable20 = charSequenceLruCache1.get(charSequence19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int20 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable22 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable24 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "" + "'", strComparable22, "");
        org.junit.Assert.assertEquals("'" + strComparable24 + "' != '" + "hi!" + "'", strComparable24, "hi!");
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        int int15 = charSequenceLruCache1.size();
        int int16 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int20 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", strComparable19);
        int int21 = charSequenceLruCache1.size();
        boolean boolean23 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int27 = charSequenceLruCache1.size();
        java.lang.Class<?> wildcardClass28 = charSequenceLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(1);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = null;
        charSequenceLruCache1.put(charSequence17, (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int21 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = null;
        boolean boolean17 = charSequenceLruCache1.containsKey(charSequence16);
        boolean boolean19 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String>(100);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

