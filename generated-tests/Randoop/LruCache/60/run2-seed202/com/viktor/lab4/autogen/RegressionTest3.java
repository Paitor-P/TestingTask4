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
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = charSequenceLruCache1.size();
        java.lang.Comparable<java.lang.String> strComparable10 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        int int11 = charSequenceLruCache1.size();
        int int12 = charSequenceLruCache1.size();
        boolean boolean14 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable>(10);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>>((int) (byte) 1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int13 = charSequenceLruCache1.size();
        boolean boolean15 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int16 = charSequenceLruCache1.size();
        java.lang.CharSequence charSequence17 = null;
        charSequenceLruCache1.put(charSequence17, (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable5 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int25 = charSequenceLruCache1.size();
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = charSequenceLruCache1.size();
        boolean boolean7 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable9 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        java.lang.Comparable<java.lang.String> strComparable11 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = charSequenceLruCache1.get((java.lang.CharSequence) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = charSequenceLruCache1.get((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        charSequenceLruCache1.put((java.lang.CharSequence) "", (java.lang.Comparable<java.lang.String>) "");
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        int int10 = charSequenceLruCache1.size();
        boolean boolean12 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "");
        int int13 = charSequenceLruCache1.size();
        charSequenceLruCache1.put((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = charSequenceLruCache1.containsKey((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }
}

