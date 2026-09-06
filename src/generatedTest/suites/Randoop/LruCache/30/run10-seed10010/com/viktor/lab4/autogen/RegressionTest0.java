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
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable>(1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String>((int) (byte) 10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = typeLruCache6.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass4, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = typeLruCache12.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache10.get((java.lang.reflect.Type) wildcardClass18);
        int int20 = typeLruCache10.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = typeLruCache22.getClass();
        boolean boolean24 = typeLruCache10.containsKey((java.lang.reflect.Type) wildcardClass23);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = typeLruCache26.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = typeLruCache31.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor38 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass37);
        int int39 = typeLruCache29.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass42 = typeLruCache41.getClass();
        boolean boolean43 = typeLruCache29.containsKey((java.lang.reflect.Type) wildcardClass42);
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass42);
        java.lang.Class<?> wildcardClass45 = typeLruCache10.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor46 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass47 = typeDescriptor46.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(typeDescriptor38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(typeDescriptor46);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass17);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        typeLruCache32.put((java.lang.reflect.Type) wildcardClass34, (java.lang.invoke.TypeDescriptor) wildcardClass36);
        java.lang.invoke.TypeDescriptor typeDescriptor38 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass36);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        typeLruCache40.put((java.lang.reflect.Type) wildcardClass42, (java.lang.invoke.TypeDescriptor) wildcardClass44);
        int int46 = typeLruCache40.size();
        java.lang.Class<?> wildcardClass47 = typeLruCache40.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass53, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        java.lang.Class<?> wildcardClass57 = typeLruCache51.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor58 = typeLruCache49.get((java.lang.reflect.Type) wildcardClass57);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache60 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        typeLruCache62.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass66);
        java.lang.Class<?> wildcardClass68 = typeLruCache62.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor69 = typeLruCache60.get((java.lang.reflect.Type) wildcardClass68);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        typeLruCache73.put((java.lang.reflect.Type) wildcardClass75, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        java.lang.invoke.TypeDescriptor typeDescriptor79 = typeLruCache71.get((java.lang.reflect.Type) wildcardClass75);
        java.lang.invoke.TypeDescriptor typeDescriptor80 = typeLruCache60.get((java.lang.reflect.Type) wildcardClass75);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache82 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache84 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj85 = new java.lang.Object();
        java.lang.Class<?> wildcardClass86 = obj85.getClass();
        java.lang.Object obj87 = new java.lang.Object();
        java.lang.Class<?> wildcardClass88 = obj87.getClass();
        typeLruCache84.put((java.lang.reflect.Type) wildcardClass86, (java.lang.invoke.TypeDescriptor) wildcardClass88);
        java.lang.Class<?> wildcardClass90 = typeLruCache84.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor91 = typeLruCache82.get((java.lang.reflect.Type) wildcardClass90);
        int int92 = typeLruCache82.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache94 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass95 = typeLruCache94.getClass();
        boolean boolean96 = typeLruCache82.containsKey((java.lang.reflect.Type) wildcardClass95);
        typeLruCache49.put((java.lang.reflect.Type) wildcardClass75, (java.lang.invoke.TypeDescriptor) wildcardClass95);
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass47, (java.lang.invoke.TypeDescriptor) wildcardClass75);
        boolean boolean99 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(typeDescriptor38);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(typeDescriptor58);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNull(typeDescriptor69);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(typeDescriptor79);
        org.junit.Assert.assertNull(typeDescriptor80);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNull(typeDescriptor91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = typeLruCache4.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor6 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = typeDescriptor6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(typeDescriptor6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        int int8 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        java.lang.invoke.TypeDescriptor typeDescriptor18 = typeLruCache10.get((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        typeLruCache20.put((java.lang.reflect.Type) wildcardClass22, (java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.invoke.TypeDescriptor typeDescriptor26 = typeLruCache10.get((java.lang.reflect.Type) wildcardClass24);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache28 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        typeLruCache28.put((java.lang.reflect.Type) wildcardClass30, (java.lang.invoke.TypeDescriptor) wildcardClass32);
        int int34 = typeLruCache28.size();
        java.lang.Class<?> wildcardClass35 = typeLruCache28.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache37 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        java.lang.Class<?> wildcardClass45 = typeLruCache39.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor46 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass45);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache50 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        typeLruCache50.put((java.lang.reflect.Type) wildcardClass52, (java.lang.invoke.TypeDescriptor) wildcardClass54);
        java.lang.Class<?> wildcardClass56 = typeLruCache50.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor57 = typeLruCache48.get((java.lang.reflect.Type) wildcardClass56);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache59 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        typeLruCache61.put((java.lang.reflect.Type) wildcardClass63, (java.lang.invoke.TypeDescriptor) wildcardClass65);
        java.lang.invoke.TypeDescriptor typeDescriptor67 = typeLruCache59.get((java.lang.reflect.Type) wildcardClass63);
        java.lang.invoke.TypeDescriptor typeDescriptor68 = typeLruCache48.get((java.lang.reflect.Type) wildcardClass63);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache70 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache72 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        typeLruCache72.put((java.lang.reflect.Type) wildcardClass74, (java.lang.invoke.TypeDescriptor) wildcardClass76);
        java.lang.Class<?> wildcardClass78 = typeLruCache72.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor79 = typeLruCache70.get((java.lang.reflect.Type) wildcardClass78);
        int int80 = typeLruCache70.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache82 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass83 = typeLruCache82.getClass();
        boolean boolean84 = typeLruCache70.containsKey((java.lang.reflect.Type) wildcardClass83);
        typeLruCache37.put((java.lang.reflect.Type) wildcardClass63, (java.lang.invoke.TypeDescriptor) wildcardClass83);
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass63);
        boolean boolean87 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(typeDescriptor18);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(typeDescriptor26);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(typeDescriptor46);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNull(typeDescriptor57);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(typeDescriptor67);
        org.junit.Assert.assertNull(typeDescriptor68);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNull(typeDescriptor79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        int int34 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>>((int) (short) 100);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = typeLruCache14.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor21 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass27);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass27);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        typeLruCache36.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = typeLruCache36.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass42);
        int int44 = typeLruCache34.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass47 = typeLruCache46.getClass();
        boolean boolean48 = typeLruCache34.containsKey((java.lang.reflect.Type) wildcardClass47);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        java.lang.Class<?> wildcardClass50 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(typeDescriptor21);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass17);
        java.lang.reflect.Type type21 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor22 = typeLruCache1.get(type21);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        typeLruCache26.put((java.lang.reflect.Type) wildcardClass28, (java.lang.invoke.TypeDescriptor) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = typeLruCache26.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor33 = typeLruCache24.get((java.lang.reflect.Type) wildcardClass32);
        int int34 = typeLruCache24.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass37 = typeLruCache36.getClass();
        boolean boolean38 = typeLruCache24.containsKey((java.lang.reflect.Type) wildcardClass37);
        java.lang.Class<?> wildcardClass39 = typeLruCache24.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        typeLruCache43.put((java.lang.reflect.Type) wildcardClass45, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        java.lang.invoke.TypeDescriptor typeDescriptor49 = typeLruCache41.get((java.lang.reflect.Type) wildcardClass45);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass53, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        java.lang.invoke.TypeDescriptor typeDescriptor57 = typeLruCache41.get((java.lang.reflect.Type) wildcardClass55);
        java.lang.reflect.Type type58 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor59 = typeLruCache41.get(type58);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache63 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        typeLruCache63.put((java.lang.reflect.Type) wildcardClass65, (java.lang.invoke.TypeDescriptor) wildcardClass67);
        java.lang.Class<?> wildcardClass69 = typeLruCache63.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor70 = typeLruCache61.get((java.lang.reflect.Type) wildcardClass69);
        int int71 = typeLruCache61.size();
        java.lang.Class<?> wildcardClass72 = typeLruCache61.getClass();
        boolean boolean73 = typeLruCache41.containsKey((java.lang.reflect.Type) wildcardClass72);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache75 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        java.lang.Object obj78 = new java.lang.Object();
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        typeLruCache75.put((java.lang.reflect.Type) wildcardClass77, (java.lang.invoke.TypeDescriptor) wildcardClass79);
        java.lang.Class<?> wildcardClass81 = typeLruCache75.getClass();
        boolean boolean82 = typeLruCache41.containsKey((java.lang.reflect.Type) wildcardClass81);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass39, (java.lang.invoke.TypeDescriptor) wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(typeDescriptor22);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(typeDescriptor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(typeDescriptor49);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNull(typeDescriptor57);
        org.junit.Assert.assertNull(typeDescriptor59);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNull(typeDescriptor70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        int int18 = typeLruCache12.size();
        java.lang.Class<?> wildcardClass19 = typeLruCache12.getClass();
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass19);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int23 = typeLruCache22.size();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache27 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass28 = typeLruCache27.getClass();
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        boolean boolean30 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass28);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        typeLruCache32.put((java.lang.reflect.Type) wildcardClass34, (java.lang.invoke.TypeDescriptor) wildcardClass36);
        int int38 = typeLruCache32.size();
        java.lang.Class<?> wildcardClass39 = typeLruCache32.getClass();
        boolean boolean40 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass39);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        typeLruCache46.put((java.lang.reflect.Type) wildcardClass48, (java.lang.invoke.TypeDescriptor) wildcardClass50);
        java.lang.invoke.TypeDescriptor typeDescriptor52 = typeLruCache44.get((java.lang.reflect.Type) wildcardClass48);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        typeLruCache54.put((java.lang.reflect.Type) wildcardClass56, (java.lang.invoke.TypeDescriptor) wildcardClass58);
        java.lang.invoke.TypeDescriptor typeDescriptor60 = typeLruCache44.get((java.lang.reflect.Type) wildcardClass58);
        boolean boolean61 = typeLruCache42.containsKey((java.lang.reflect.Type) wildcardClass58);
        int int62 = typeLruCache42.size();
        java.lang.Class<?> wildcardClass63 = typeLruCache42.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor64 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(typeDescriptor52);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(typeDescriptor60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(typeDescriptor64);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>>((int) (byte) 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Object>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        int int8 = typeLruCache1.size();
        int int9 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass10 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.Type> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.Type>((int) (short) 100);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        int int12 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache16 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache18 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        typeLruCache18.put((java.lang.reflect.Type) wildcardClass20, (java.lang.invoke.TypeDescriptor) wildcardClass22);
        java.lang.invoke.TypeDescriptor typeDescriptor24 = typeLruCache16.get((java.lang.reflect.Type) wildcardClass20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        typeLruCache26.put((java.lang.reflect.Type) wildcardClass28, (java.lang.invoke.TypeDescriptor) wildcardClass30);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache16.get((java.lang.reflect.Type) wildcardClass30);
        boolean boolean33 = typeLruCache14.containsKey((java.lang.reflect.Type) wildcardClass30);
        boolean boolean34 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass30);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache38 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        typeLruCache40.put((java.lang.reflect.Type) wildcardClass42, (java.lang.invoke.TypeDescriptor) wildcardClass44);
        java.lang.invoke.TypeDescriptor typeDescriptor46 = typeLruCache38.get((java.lang.reflect.Type) wildcardClass42);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        typeLruCache48.put((java.lang.reflect.Type) wildcardClass50, (java.lang.invoke.TypeDescriptor) wildcardClass52);
        java.lang.invoke.TypeDescriptor typeDescriptor54 = typeLruCache38.get((java.lang.reflect.Type) wildcardClass52);
        boolean boolean55 = typeLruCache36.containsKey((java.lang.reflect.Type) wildcardClass52);
        java.lang.invoke.TypeDescriptor typeDescriptor56 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(typeDescriptor24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(typeDescriptor46);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(typeDescriptor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(typeDescriptor56);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        typeLruCache35.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass39);
        java.lang.Class<?> wildcardClass41 = typeLruCache35.getClass();
        boolean boolean42 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass41);
        int int43 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((int) (byte) 100);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        int int2 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass34 = typeLruCache33.getClass();
        boolean boolean35 = typeLruCache21.containsKey((java.lang.reflect.Type) wildcardClass34);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache37 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass38 = typeLruCache37.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        typeLruCache42.put((java.lang.reflect.Type) wildcardClass44, (java.lang.invoke.TypeDescriptor) wildcardClass46);
        java.lang.Class<?> wildcardClass48 = typeLruCache42.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor49 = typeLruCache40.get((java.lang.reflect.Type) wildcardClass48);
        int int50 = typeLruCache40.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache52 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass53 = typeLruCache52.getClass();
        boolean boolean54 = typeLruCache40.containsKey((java.lang.reflect.Type) wildcardClass53);
        typeLruCache21.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass53);
        java.lang.invoke.TypeDescriptor typeDescriptor56 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass38);
        int int57 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(typeDescriptor49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(typeDescriptor56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass17);
        java.lang.reflect.Type type21 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor22 = typeLruCache1.get(type21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = typeDescriptor22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(typeDescriptor22);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = typeLruCache14.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor21 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass27);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass27);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        typeLruCache36.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = typeLruCache36.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass42);
        int int44 = typeLruCache34.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass47 = typeLruCache46.getClass();
        boolean boolean48 = typeLruCache34.containsKey((java.lang.reflect.Type) wildcardClass47);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        java.lang.reflect.Type type50 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache1.get(type50);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(typeDescriptor21);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(typeDescriptor51);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = typeLruCache13.getClass();
        boolean boolean15 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = typeLruCache19.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor26 = typeLruCache17.get((java.lang.reflect.Type) wildcardClass25);
        int int27 = typeLruCache17.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass30 = typeLruCache29.getClass();
        boolean boolean31 = typeLruCache17.containsKey((java.lang.reflect.Type) wildcardClass30);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass30);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        typeLruCache36.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = typeLruCache36.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass42);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        typeLruCache45.put((java.lang.reflect.Type) wildcardClass47, (java.lang.invoke.TypeDescriptor) wildcardClass49);
        int int51 = typeLruCache45.size();
        java.lang.Class<?> wildcardClass52 = typeLruCache45.getClass();
        boolean boolean53 = typeLruCache34.containsKey((java.lang.reflect.Type) wildcardClass52);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int56 = typeLruCache55.size();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache60 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass61 = typeLruCache60.getClass();
        typeLruCache55.put((java.lang.reflect.Type) wildcardClass58, (java.lang.invoke.TypeDescriptor) wildcardClass61);
        boolean boolean63 = typeLruCache34.containsKey((java.lang.reflect.Type) wildcardClass61);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache67 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass68 = wildcardClassLruCache67.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor69 = typeLruCache65.get((java.lang.reflect.Type) wildcardClass68);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass72 = typeLruCache71.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor73 = typeLruCache65.get((java.lang.reflect.Type) wildcardClass72);
        java.lang.invoke.TypeDescriptor typeDescriptor74 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass72);
        java.lang.invoke.TypeDescriptor typeDescriptor75 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNull(typeDescriptor69);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(typeDescriptor73);
        org.junit.Assert.assertNull(typeDescriptor74);
        org.junit.Assert.assertNull(typeDescriptor75);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        typeLruCache21.put((java.lang.reflect.Type) wildcardClass23, (java.lang.invoke.TypeDescriptor) wildcardClass25);
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass23);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache29 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass30 = constantDescLruCache29.getClass();
        boolean boolean31 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass30);
        int int32 = typeLruCache1.size();
        java.lang.reflect.Type type33 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor34 = typeLruCache1.get(type33);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(typeDescriptor34);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = typeLruCache6.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass4, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = typeLruCache12.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache10.get((java.lang.reflect.Type) wildcardClass18);
        int int20 = typeLruCache10.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = typeLruCache22.getClass();
        boolean boolean24 = typeLruCache10.containsKey((java.lang.reflect.Type) wildcardClass23);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = typeLruCache26.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = typeLruCache31.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor38 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass37);
        int int39 = typeLruCache29.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass42 = typeLruCache41.getClass();
        boolean boolean43 = typeLruCache29.containsKey((java.lang.reflect.Type) wildcardClass42);
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass42);
        java.lang.Class<?> wildcardClass45 = typeLruCache10.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor46 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass45);
        java.lang.Class<?> wildcardClass47 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(typeDescriptor38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(typeDescriptor46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = typeLruCache6.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass4, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        typeLruCache21.put((java.lang.reflect.Type) wildcardClass23, (java.lang.invoke.TypeDescriptor) wildcardClass25);
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache19.get((java.lang.reflect.Type) wildcardClass23);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass31, (java.lang.invoke.TypeDescriptor) wildcardClass33);
        java.lang.invoke.TypeDescriptor typeDescriptor35 = typeLruCache19.get((java.lang.reflect.Type) wildcardClass33);
        java.lang.reflect.Type type36 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor37 = typeLruCache19.get(type36);
        int int38 = typeLruCache19.size();
        int int39 = typeLruCache19.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        typeLruCache41.put((java.lang.reflect.Type) wildcardClass43, (java.lang.invoke.TypeDescriptor) wildcardClass45);
        int int47 = typeLruCache41.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        typeLruCache49.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass53);
        int int55 = typeLruCache49.size();
        java.lang.Class<?> wildcardClass56 = typeLruCache49.getClass();
        boolean boolean57 = typeLruCache41.containsKey((java.lang.reflect.Type) wildcardClass56);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache59 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        typeLruCache59.put((java.lang.reflect.Type) wildcardClass61, (java.lang.invoke.TypeDescriptor) wildcardClass63);
        int int65 = typeLruCache59.size();
        java.lang.Class<?> wildcardClass66 = typeLruCache59.getClass();
        boolean boolean67 = typeLruCache41.containsKey((java.lang.reflect.Type) wildcardClass66);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache69 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        typeLruCache73.put((java.lang.reflect.Type) wildcardClass75, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        java.lang.invoke.TypeDescriptor typeDescriptor79 = typeLruCache71.get((java.lang.reflect.Type) wildcardClass75);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache81 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj82 = new java.lang.Object();
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
        typeLruCache81.put((java.lang.reflect.Type) wildcardClass83, (java.lang.invoke.TypeDescriptor) wildcardClass85);
        java.lang.invoke.TypeDescriptor typeDescriptor87 = typeLruCache71.get((java.lang.reflect.Type) wildcardClass85);
        boolean boolean88 = typeLruCache69.containsKey((java.lang.reflect.Type) wildcardClass85);
        java.lang.reflect.Type type89 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor90 = typeLruCache69.get(type89);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache92 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass93 = wildcardClassLruCache92.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor94 = typeLruCache69.get((java.lang.reflect.Type) wildcardClass93);
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass66, (java.lang.invoke.TypeDescriptor) wildcardClass93);
        boolean boolean96 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass93);
        java.lang.Class<?> wildcardClass97 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(typeDescriptor35);
        org.junit.Assert.assertNull(typeDescriptor37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(typeDescriptor79);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNull(typeDescriptor87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(typeDescriptor90);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNull(typeDescriptor94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int14 = typeLruCache13.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache16 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = typeLruCache16.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor18 = typeLruCache13.get((java.lang.reflect.Type) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = null;
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass17, typeDescriptor19);
        int int21 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        int int25 = typeLruCache19.size();
        java.lang.Class<?> wildcardClass26 = typeLruCache19.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache28 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache30 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        typeLruCache30.put((java.lang.reflect.Type) wildcardClass32, (java.lang.invoke.TypeDescriptor) wildcardClass34);
        java.lang.Class<?> wildcardClass36 = typeLruCache30.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor37 = typeLruCache28.get((java.lang.reflect.Type) wildcardClass36);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        typeLruCache41.put((java.lang.reflect.Type) wildcardClass43, (java.lang.invoke.TypeDescriptor) wildcardClass45);
        java.lang.Class<?> wildcardClass47 = typeLruCache41.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor48 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass47);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache50 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache52 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        typeLruCache52.put((java.lang.reflect.Type) wildcardClass54, (java.lang.invoke.TypeDescriptor) wildcardClass56);
        java.lang.invoke.TypeDescriptor typeDescriptor58 = typeLruCache50.get((java.lang.reflect.Type) wildcardClass54);
        java.lang.invoke.TypeDescriptor typeDescriptor59 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass54);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache63 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        typeLruCache63.put((java.lang.reflect.Type) wildcardClass65, (java.lang.invoke.TypeDescriptor) wildcardClass67);
        java.lang.Class<?> wildcardClass69 = typeLruCache63.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor70 = typeLruCache61.get((java.lang.reflect.Type) wildcardClass69);
        int int71 = typeLruCache61.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass74 = typeLruCache73.getClass();
        boolean boolean75 = typeLruCache61.containsKey((java.lang.reflect.Type) wildcardClass74);
        typeLruCache28.put((java.lang.reflect.Type) wildcardClass54, (java.lang.invoke.TypeDescriptor) wildcardClass74);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass54);
        int int78 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(typeDescriptor37);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(typeDescriptor48);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNull(typeDescriptor58);
        org.junit.Assert.assertNull(typeDescriptor59);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNull(typeDescriptor70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(100);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache3 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass4 = wildcardClassLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor5 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass4);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache7 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = typeLruCache7.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass8);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        typeLruCache15.put((java.lang.reflect.Type) wildcardClass17, (java.lang.invoke.TypeDescriptor) wildcardClass19);
        java.lang.invoke.TypeDescriptor typeDescriptor21 = typeLruCache13.get((java.lang.reflect.Type) wildcardClass17);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.invoke.TypeDescriptor typeDescriptor29 = typeLruCache13.get((java.lang.reflect.Type) wildcardClass27);
        boolean boolean30 = typeLruCache11.containsKey((java.lang.reflect.Type) wildcardClass27);
        java.lang.Class<?> wildcardClass31 = typeLruCache11.getClass();
        boolean boolean32 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass31);
        int int33 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(typeDescriptor5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(typeDescriptor21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(typeDescriptor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = typeLruCache6.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass4, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = typeLruCache12.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache10.get((java.lang.reflect.Type) wildcardClass18);
        int int20 = typeLruCache10.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = typeLruCache22.getClass();
        boolean boolean24 = typeLruCache10.containsKey((java.lang.reflect.Type) wildcardClass23);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = typeLruCache26.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = typeLruCache31.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor38 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass37);
        int int39 = typeLruCache29.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass42 = typeLruCache41.getClass();
        boolean boolean43 = typeLruCache29.containsKey((java.lang.reflect.Type) wildcardClass42);
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass42);
        java.lang.Class<?> wildcardClass45 = typeLruCache10.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor46 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass45);
        int int47 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(typeDescriptor38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(typeDescriptor46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache9 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        typeLruCache9.put((java.lang.reflect.Type) wildcardClass11, (java.lang.invoke.TypeDescriptor) wildcardClass13);
        int int15 = typeLruCache9.size();
        java.lang.Class<?> wildcardClass16 = typeLruCache9.getClass();
        boolean boolean17 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        int int25 = typeLruCache19.size();
        java.lang.Class<?> wildcardClass26 = typeLruCache19.getClass();
        boolean boolean27 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache31 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass32 = wildcardClassLruCache31.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor33 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache35 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass36 = constantDescLruCache35.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache38 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        typeLruCache40.put((java.lang.reflect.Type) wildcardClass42, (java.lang.invoke.TypeDescriptor) wildcardClass44);
        java.lang.Class<?> wildcardClass46 = typeLruCache40.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache38.get((java.lang.reflect.Type) wildcardClass46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        typeLruCache49.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass53);
        int int55 = typeLruCache49.size();
        java.lang.Class<?> wildcardClass56 = typeLruCache49.getClass();
        boolean boolean57 = typeLruCache38.containsKey((java.lang.reflect.Type) wildcardClass56);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache59 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int60 = typeLruCache59.size();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache64 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass65 = typeLruCache64.getClass();
        typeLruCache59.put((java.lang.reflect.Type) wildcardClass62, (java.lang.invoke.TypeDescriptor) wildcardClass65);
        boolean boolean67 = typeLruCache38.containsKey((java.lang.reflect.Type) wildcardClass65);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache69 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache71 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass72 = wildcardClassLruCache71.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor73 = typeLruCache69.get((java.lang.reflect.Type) wildcardClass72);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache75 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass76 = typeLruCache75.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor77 = typeLruCache69.get((java.lang.reflect.Type) wildcardClass76);
        java.lang.invoke.TypeDescriptor typeDescriptor78 = typeLruCache38.get((java.lang.reflect.Type) wildcardClass76);
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass36, typeDescriptor78);
        java.lang.invoke.TypeDescriptor typeDescriptor80 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(typeDescriptor33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(typeDescriptor73);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNull(typeDescriptor77);
        org.junit.Assert.assertNull(typeDescriptor78);
        org.junit.Assert.assertNull(typeDescriptor80);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) (short) 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        typeLruCache6.put((java.lang.reflect.Type) wildcardClass8, (java.lang.invoke.TypeDescriptor) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = typeLruCache6.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor13 = typeLruCache4.get((java.lang.reflect.Type) wildcardClass12);
        boolean boolean14 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass12);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache16 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache18 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        typeLruCache20.put((java.lang.reflect.Type) wildcardClass22, (java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.invoke.TypeDescriptor typeDescriptor26 = typeLruCache18.get((java.lang.reflect.Type) wildcardClass22);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache28 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        typeLruCache28.put((java.lang.reflect.Type) wildcardClass30, (java.lang.invoke.TypeDescriptor) wildcardClass32);
        java.lang.invoke.TypeDescriptor typeDescriptor34 = typeLruCache18.get((java.lang.reflect.Type) wildcardClass32);
        java.lang.reflect.Type type35 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor36 = typeLruCache18.get(type35);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache38 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        typeLruCache38.put((java.lang.reflect.Type) wildcardClass40, (java.lang.invoke.TypeDescriptor) wildcardClass42);
        java.lang.invoke.TypeDescriptor typeDescriptor44 = typeLruCache18.get((java.lang.reflect.Type) wildcardClass40);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        typeLruCache46.put((java.lang.reflect.Type) wildcardClass48, (java.lang.invoke.TypeDescriptor) wildcardClass50);
        int int52 = typeLruCache46.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        typeLruCache54.put((java.lang.reflect.Type) wildcardClass56, (java.lang.invoke.TypeDescriptor) wildcardClass58);
        int int60 = typeLruCache54.size();
        java.lang.Class<?> wildcardClass61 = typeLruCache54.getClass();
        boolean boolean62 = typeLruCache46.containsKey((java.lang.reflect.Type) wildcardClass61);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache64 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        typeLruCache64.put((java.lang.reflect.Type) wildcardClass66, (java.lang.invoke.TypeDescriptor) wildcardClass68);
        int int70 = typeLruCache64.size();
        java.lang.Class<?> wildcardClass71 = typeLruCache64.getClass();
        boolean boolean72 = typeLruCache46.containsKey((java.lang.reflect.Type) wildcardClass71);
        boolean boolean73 = typeLruCache18.containsKey((java.lang.reflect.Type) wildcardClass71);
        boolean boolean74 = typeLruCache16.containsKey((java.lang.reflect.Type) wildcardClass71);
        java.lang.invoke.TypeDescriptor typeDescriptor75 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(typeDescriptor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(typeDescriptor26);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(typeDescriptor34);
        org.junit.Assert.assertNull(typeDescriptor36);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(typeDescriptor75);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        typeLruCache35.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass39);
        int int41 = typeLruCache35.size();
        int int42 = typeLruCache35.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        boolean boolean50 = typeLruCache35.containsKey((java.lang.reflect.Type) wildcardClass46);
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        typeLruCache55.put((java.lang.reflect.Type) wildcardClass57, (java.lang.invoke.TypeDescriptor) wildcardClass59);
        java.lang.Class<?> wildcardClass61 = typeLruCache55.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor62 = typeLruCache53.get((java.lang.reflect.Type) wildcardClass61);
        int int63 = typeLruCache53.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass66 = typeLruCache65.getClass();
        boolean boolean67 = typeLruCache53.containsKey((java.lang.reflect.Type) wildcardClass66);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache69 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass70 = typeLruCache69.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache72 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache74 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Class<?> wildcardClass78 = obj77.getClass();
        typeLruCache74.put((java.lang.reflect.Type) wildcardClass76, (java.lang.invoke.TypeDescriptor) wildcardClass78);
        java.lang.Class<?> wildcardClass80 = typeLruCache74.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor81 = typeLruCache72.get((java.lang.reflect.Type) wildcardClass80);
        int int82 = typeLruCache72.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache84 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass85 = typeLruCache84.getClass();
        boolean boolean86 = typeLruCache72.containsKey((java.lang.reflect.Type) wildcardClass85);
        typeLruCache53.put((java.lang.reflect.Type) wildcardClass70, (java.lang.invoke.TypeDescriptor) wildcardClass85);
        boolean boolean88 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(typeDescriptor51);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNull(typeDescriptor62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNull(typeDescriptor81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = typeLruCache4.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache7 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        typeLruCache7.put((java.lang.reflect.Type) wildcardClass9, (java.lang.invoke.TypeDescriptor) wildcardClass11);
        int int13 = typeLruCache7.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        typeLruCache15.put((java.lang.reflect.Type) wildcardClass17, (java.lang.invoke.TypeDescriptor) wildcardClass19);
        int int21 = typeLruCache15.size();
        java.lang.Class<?> wildcardClass22 = typeLruCache15.getClass();
        boolean boolean23 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass22);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        int int31 = typeLruCache25.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        int int39 = typeLruCache33.size();
        java.lang.Class<?> wildcardClass40 = typeLruCache33.getClass();
        boolean boolean41 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass40);
        boolean boolean42 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass40);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.Class<?> wildcardClass44 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        int int20 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        typeLruCache32.put((java.lang.reflect.Type) wildcardClass34, (java.lang.invoke.TypeDescriptor) wildcardClass36);
        java.lang.invoke.TypeDescriptor typeDescriptor38 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass36);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        typeLruCache42.put((java.lang.reflect.Type) wildcardClass44, (java.lang.invoke.TypeDescriptor) wildcardClass46);
        java.lang.Class<?> wildcardClass48 = typeLruCache42.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor49 = typeLruCache40.get((java.lang.reflect.Type) wildcardClass48);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass53, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        int int57 = typeLruCache51.size();
        java.lang.Class<?> wildcardClass58 = typeLruCache51.getClass();
        boolean boolean59 = typeLruCache40.containsKey((java.lang.reflect.Type) wildcardClass58);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass36, (java.lang.invoke.TypeDescriptor) wildcardClass58);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        typeLruCache62.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass66);
        int int68 = typeLruCache62.size();
        int int69 = typeLruCache62.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        typeLruCache71.put((java.lang.reflect.Type) wildcardClass73, (java.lang.invoke.TypeDescriptor) wildcardClass75);
        boolean boolean77 = typeLruCache62.containsKey((java.lang.reflect.Type) wildcardClass73);
        boolean boolean78 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(typeDescriptor38);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(typeDescriptor49);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(10);
        int int2 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache3 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass4 = wildcardClassLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor5 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass4);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache7 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = typeLruCache7.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass8);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache11.get((java.lang.reflect.Type) wildcardClass15);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        typeLruCache21.put((java.lang.reflect.Type) wildcardClass23, (java.lang.invoke.TypeDescriptor) wildcardClass25);
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache11.get((java.lang.reflect.Type) wildcardClass25);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass31, (java.lang.invoke.TypeDescriptor) wildcardClass33);
        int int35 = typeLruCache29.size();
        java.lang.Class<?> wildcardClass36 = typeLruCache29.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache38 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        typeLruCache40.put((java.lang.reflect.Type) wildcardClass42, (java.lang.invoke.TypeDescriptor) wildcardClass44);
        java.lang.Class<?> wildcardClass46 = typeLruCache40.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache38.get((java.lang.reflect.Type) wildcardClass46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass53, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        java.lang.Class<?> wildcardClass57 = typeLruCache51.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor58 = typeLruCache49.get((java.lang.reflect.Type) wildcardClass57);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache60 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        typeLruCache62.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass66);
        java.lang.invoke.TypeDescriptor typeDescriptor68 = typeLruCache60.get((java.lang.reflect.Type) wildcardClass64);
        java.lang.invoke.TypeDescriptor typeDescriptor69 = typeLruCache49.get((java.lang.reflect.Type) wildcardClass64);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        typeLruCache73.put((java.lang.reflect.Type) wildcardClass75, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        java.lang.Class<?> wildcardClass79 = typeLruCache73.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor80 = typeLruCache71.get((java.lang.reflect.Type) wildcardClass79);
        int int81 = typeLruCache71.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache83 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass84 = typeLruCache83.getClass();
        boolean boolean85 = typeLruCache71.containsKey((java.lang.reflect.Type) wildcardClass84);
        typeLruCache38.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass84);
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass36, (java.lang.invoke.TypeDescriptor) wildcardClass64);
        java.lang.invoke.TypeDescriptor typeDescriptor88 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(typeDescriptor5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(typeDescriptor58);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNull(typeDescriptor68);
        org.junit.Assert.assertNull(typeDescriptor69);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNull(typeDescriptor80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(typeDescriptor88);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        int int18 = typeLruCache12.size();
        java.lang.Class<?> wildcardClass19 = typeLruCache12.getClass();
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass19);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int23 = typeLruCache22.size();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache27 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass28 = typeLruCache27.getClass();
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        boolean boolean30 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass28);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache34 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass35 = wildcardClassLruCache34.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor36 = typeLruCache32.get((java.lang.reflect.Type) wildcardClass35);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache38 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass39 = typeLruCache38.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor40 = typeLruCache32.get((java.lang.reflect.Type) wildcardClass39);
        java.lang.invoke.TypeDescriptor typeDescriptor41 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass39);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        typeLruCache43.put((java.lang.reflect.Type) wildcardClass45, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        int int49 = typeLruCache43.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass53, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        int int57 = typeLruCache51.size();
        java.lang.Class<?> wildcardClass58 = typeLruCache51.getClass();
        boolean boolean59 = typeLruCache43.containsKey((java.lang.reflect.Type) wildcardClass58);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        typeLruCache61.put((java.lang.reflect.Type) wildcardClass63, (java.lang.invoke.TypeDescriptor) wildcardClass65);
        int int67 = typeLruCache61.size();
        java.lang.Class<?> wildcardClass68 = typeLruCache61.getClass();
        boolean boolean69 = typeLruCache43.containsKey((java.lang.reflect.Type) wildcardClass68);
        java.lang.invoke.TypeDescriptor typeDescriptor70 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(typeDescriptor36);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(typeDescriptor40);
        org.junit.Assert.assertNull(typeDescriptor41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(typeDescriptor70);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        int int12 = typeLruCache1.size();
        java.lang.reflect.Type type13 = null;
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        typeLruCache17.put((java.lang.reflect.Type) wildcardClass19, (java.lang.invoke.TypeDescriptor) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = typeLruCache17.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor24 = typeLruCache15.get((java.lang.reflect.Type) wildcardClass23);
        int int25 = typeLruCache15.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache27 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass28 = typeLruCache27.getClass();
        boolean boolean29 = typeLruCache15.containsKey((java.lang.reflect.Type) wildcardClass28);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = typeLruCache31.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        int int45 = typeLruCache39.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache47 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        typeLruCache47.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass51);
        int int53 = typeLruCache47.size();
        java.lang.Class<?> wildcardClass54 = typeLruCache47.getClass();
        boolean boolean55 = typeLruCache39.containsKey((java.lang.reflect.Type) wildcardClass54);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache57 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        typeLruCache57.put((java.lang.reflect.Type) wildcardClass59, (java.lang.invoke.TypeDescriptor) wildcardClass61);
        int int63 = typeLruCache57.size();
        java.lang.Class<?> wildcardClass64 = typeLruCache57.getClass();
        boolean boolean65 = typeLruCache39.containsKey((java.lang.reflect.Type) wildcardClass64);
        typeLruCache15.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass64);
        typeLruCache1.put(type13, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(typeDescriptor24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        int int8 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = typeLruCache10.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor12 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass11);
        int int13 = typeLruCache1.size();
        java.lang.reflect.Type type14 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor15 = typeLruCache1.get(type14);
        java.lang.Class<?> wildcardClass16 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(typeDescriptor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(typeDescriptor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int4 = typeLruCache3.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache8 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass12, (java.lang.invoke.TypeDescriptor) wildcardClass14);
        java.lang.invoke.TypeDescriptor typeDescriptor16 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass12);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache18 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        typeLruCache18.put((java.lang.reflect.Type) wildcardClass20, (java.lang.invoke.TypeDescriptor) wildcardClass22);
        java.lang.invoke.TypeDescriptor typeDescriptor24 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass22);
        boolean boolean25 = typeLruCache6.containsKey((java.lang.reflect.Type) wildcardClass22);
        java.lang.reflect.Type type26 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache6.get(type26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.invoke.TypeDescriptor typeDescriptor37 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass33);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        java.lang.invoke.TypeDescriptor typeDescriptor45 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass43);
        boolean boolean46 = typeLruCache6.containsKey((java.lang.reflect.Type) wildcardClass43);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache48 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass49 = constantDescLruCache48.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass43, (java.lang.invoke.TypeDescriptor) wildcardClass49);
        java.lang.invoke.TypeDescriptor typeDescriptor51 = null;
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass49, typeDescriptor51);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        typeLruCache54.put((java.lang.reflect.Type) wildcardClass56, (java.lang.invoke.TypeDescriptor) wildcardClass58);
        int int60 = typeLruCache54.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        typeLruCache62.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass66);
        int int68 = typeLruCache62.size();
        java.lang.Class<?> wildcardClass69 = typeLruCache62.getClass();
        boolean boolean70 = typeLruCache54.containsKey((java.lang.reflect.Type) wildcardClass69);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache72 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        typeLruCache72.put((java.lang.reflect.Type) wildcardClass74, (java.lang.invoke.TypeDescriptor) wildcardClass76);
        int int78 = typeLruCache72.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache80 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj81 = new java.lang.Object();
        java.lang.Class<?> wildcardClass82 = obj81.getClass();
        java.lang.Object obj83 = new java.lang.Object();
        java.lang.Class<?> wildcardClass84 = obj83.getClass();
        typeLruCache80.put((java.lang.reflect.Type) wildcardClass82, (java.lang.invoke.TypeDescriptor) wildcardClass84);
        int int86 = typeLruCache80.size();
        java.lang.Class<?> wildcardClass87 = typeLruCache80.getClass();
        boolean boolean88 = typeLruCache72.containsKey((java.lang.reflect.Type) wildcardClass87);
        boolean boolean89 = typeLruCache54.containsKey((java.lang.reflect.Type) wildcardClass87);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache91 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int92 = typeLruCache91.size();
        java.lang.Object obj93 = new java.lang.Object();
        java.lang.Class<?> wildcardClass94 = obj93.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache96 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass97 = typeLruCache96.getClass();
        typeLruCache91.put((java.lang.reflect.Type) wildcardClass94, (java.lang.invoke.TypeDescriptor) wildcardClass97);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass87, (java.lang.invoke.TypeDescriptor) wildcardClass94);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(typeDescriptor16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(typeDescriptor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(typeDescriptor37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(typeDescriptor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (byte) 10);
        int int2 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>>((int) (short) 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        int int12 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache16 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        typeLruCache16.put((java.lang.reflect.Type) wildcardClass18, (java.lang.invoke.TypeDescriptor) wildcardClass20);
        java.lang.invoke.TypeDescriptor typeDescriptor22 = typeLruCache14.get((java.lang.reflect.Type) wildcardClass18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache14.get((java.lang.reflect.Type) wildcardClass28);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        typeLruCache32.put((java.lang.reflect.Type) wildcardClass34, (java.lang.invoke.TypeDescriptor) wildcardClass36);
        int int38 = typeLruCache32.size();
        java.lang.Class<?> wildcardClass39 = typeLruCache32.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor40 = typeLruCache14.get((java.lang.reflect.Type) wildcardClass39);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int43 = typeLruCache42.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        typeLruCache45.put((java.lang.reflect.Type) wildcardClass47, (java.lang.invoke.TypeDescriptor) wildcardClass49);
        java.lang.Class<?> wildcardClass51 = typeLruCache45.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        typeLruCache53.put((java.lang.reflect.Type) wildcardClass55, (java.lang.invoke.TypeDescriptor) wildcardClass57);
        typeLruCache42.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass39, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(typeDescriptor22);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(typeDescriptor40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = typeLruCache4.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor6 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        int int7 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache9 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int10 = typeLruCache9.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = typeLruCache12.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        typeLruCache20.put((java.lang.reflect.Type) wildcardClass22, (java.lang.invoke.TypeDescriptor) wildcardClass24);
        typeLruCache9.put((java.lang.reflect.Type) wildcardClass18, (java.lang.invoke.TypeDescriptor) wildcardClass22);
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(typeDescriptor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(typeDescriptor27);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass17);
        int int21 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int24 = typeLruCache23.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = typeLruCache26.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor28 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass27);
        int int29 = typeLruCache23.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        java.lang.Class<?> wildcardClass39 = typeLruCache33.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor40 = typeLruCache31.get((java.lang.reflect.Type) wildcardClass39);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        java.lang.Class<?> wildcardClass50 = typeLruCache44.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache42.get((java.lang.reflect.Type) wildcardClass50);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        typeLruCache55.put((java.lang.reflect.Type) wildcardClass57, (java.lang.invoke.TypeDescriptor) wildcardClass59);
        java.lang.invoke.TypeDescriptor typeDescriptor61 = typeLruCache53.get((java.lang.reflect.Type) wildcardClass57);
        java.lang.invoke.TypeDescriptor typeDescriptor62 = typeLruCache42.get((java.lang.reflect.Type) wildcardClass57);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache64 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache66 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        typeLruCache66.put((java.lang.reflect.Type) wildcardClass68, (java.lang.invoke.TypeDescriptor) wildcardClass70);
        java.lang.Class<?> wildcardClass72 = typeLruCache66.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor73 = typeLruCache64.get((java.lang.reflect.Type) wildcardClass72);
        int int74 = typeLruCache64.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache76 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass77 = typeLruCache76.getClass();
        boolean boolean78 = typeLruCache64.containsKey((java.lang.reflect.Type) wildcardClass77);
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass57, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        java.lang.invoke.TypeDescriptor typeDescriptor80 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass77);
        java.lang.Class<?> wildcardClass81 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor82 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(typeDescriptor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(typeDescriptor40);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(typeDescriptor51);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(typeDescriptor61);
        org.junit.Assert.assertNull(typeDescriptor62);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(typeDescriptor73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(typeDescriptor80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNull(typeDescriptor82);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        typeLruCache21.put((java.lang.reflect.Type) wildcardClass23, (java.lang.invoke.TypeDescriptor) wildcardClass25);
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass23);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache29 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass30 = constantDescLruCache29.getClass();
        boolean boolean31 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass30);
        int int32 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        typeLruCache36.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.invoke.TypeDescriptor typeDescriptor42 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass38);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        java.lang.invoke.TypeDescriptor typeDescriptor50 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass48);
        java.lang.reflect.Type type51 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor52 = typeLruCache34.get(type51);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache56 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        typeLruCache56.put((java.lang.reflect.Type) wildcardClass58, (java.lang.invoke.TypeDescriptor) wildcardClass60);
        java.lang.Class<?> wildcardClass62 = typeLruCache56.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor63 = typeLruCache54.get((java.lang.reflect.Type) wildcardClass62);
        int int64 = typeLruCache54.size();
        java.lang.Class<?> wildcardClass65 = typeLruCache54.getClass();
        boolean boolean66 = typeLruCache34.containsKey((java.lang.reflect.Type) wildcardClass65);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache68 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        typeLruCache68.put((java.lang.reflect.Type) wildcardClass70, (java.lang.invoke.TypeDescriptor) wildcardClass72);
        java.lang.Class<?> wildcardClass74 = typeLruCache68.getClass();
        boolean boolean75 = typeLruCache34.containsKey((java.lang.reflect.Type) wildcardClass74);
        java.lang.invoke.TypeDescriptor typeDescriptor76 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass74);
        int int77 = typeLruCache1.size();
        int int78 = typeLruCache1.size();
        int int79 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(typeDescriptor42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(typeDescriptor50);
        org.junit.Assert.assertNull(typeDescriptor52);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(typeDescriptor63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(typeDescriptor76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass17);
        java.lang.reflect.Type type21 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor22 = typeLruCache1.get(type21);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        typeLruCache26.put((java.lang.reflect.Type) wildcardClass28, (java.lang.invoke.TypeDescriptor) wildcardClass30);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache24.get((java.lang.reflect.Type) wildcardClass28);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        typeLruCache34.put((java.lang.reflect.Type) wildcardClass36, (java.lang.invoke.TypeDescriptor) wildcardClass38);
        java.lang.invoke.TypeDescriptor typeDescriptor40 = typeLruCache24.get((java.lang.reflect.Type) wildcardClass38);
        boolean boolean41 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass38);
        int int42 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int52 = typeLruCache51.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass55 = typeLruCache54.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache57 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        typeLruCache57.put((java.lang.reflect.Type) wildcardClass59, (java.lang.invoke.TypeDescriptor) wildcardClass61);
        int int63 = typeLruCache57.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        typeLruCache65.put((java.lang.reflect.Type) wildcardClass67, (java.lang.invoke.TypeDescriptor) wildcardClass69);
        int int71 = typeLruCache65.size();
        java.lang.Class<?> wildcardClass72 = typeLruCache65.getClass();
        boolean boolean73 = typeLruCache57.containsKey((java.lang.reflect.Type) wildcardClass72);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache75 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        java.lang.Object obj78 = new java.lang.Object();
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        typeLruCache75.put((java.lang.reflect.Type) wildcardClass77, (java.lang.invoke.TypeDescriptor) wildcardClass79);
        int int81 = typeLruCache75.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache83 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
        java.lang.Object obj86 = new java.lang.Object();
        java.lang.Class<?> wildcardClass87 = obj86.getClass();
        typeLruCache83.put((java.lang.reflect.Type) wildcardClass85, (java.lang.invoke.TypeDescriptor) wildcardClass87);
        int int89 = typeLruCache83.size();
        java.lang.Class<?> wildcardClass90 = typeLruCache83.getClass();
        boolean boolean91 = typeLruCache75.containsKey((java.lang.reflect.Type) wildcardClass90);
        boolean boolean92 = typeLruCache57.containsKey((java.lang.reflect.Type) wildcardClass90);
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass55, (java.lang.invoke.TypeDescriptor) wildcardClass90);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(typeDescriptor22);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(typeDescriptor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int36 = typeLruCache35.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache38 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass39 = typeLruCache38.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor40 = typeLruCache35.get((java.lang.reflect.Type) wildcardClass39);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        typeLruCache42.put((java.lang.reflect.Type) wildcardClass44, (java.lang.invoke.TypeDescriptor) wildcardClass46);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass39, (java.lang.invoke.TypeDescriptor) wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(typeDescriptor40);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int36 = typeLruCache35.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache38 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        typeLruCache42.put((java.lang.reflect.Type) wildcardClass44, (java.lang.invoke.TypeDescriptor) wildcardClass46);
        java.lang.invoke.TypeDescriptor typeDescriptor48 = typeLruCache40.get((java.lang.reflect.Type) wildcardClass44);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache50 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        typeLruCache50.put((java.lang.reflect.Type) wildcardClass52, (java.lang.invoke.TypeDescriptor) wildcardClass54);
        java.lang.invoke.TypeDescriptor typeDescriptor56 = typeLruCache40.get((java.lang.reflect.Type) wildcardClass54);
        boolean boolean57 = typeLruCache38.containsKey((java.lang.reflect.Type) wildcardClass54);
        java.lang.reflect.Type type58 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor59 = typeLruCache38.get(type58);
        java.lang.Class<?> wildcardClass60 = typeLruCache38.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor61 = typeLruCache35.get((java.lang.reflect.Type) wildcardClass60);
        java.lang.invoke.TypeDescriptor typeDescriptor62 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(typeDescriptor48);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(typeDescriptor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(typeDescriptor59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNull(typeDescriptor61);
        org.junit.Assert.assertNull(typeDescriptor62);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) 'a');
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        java.lang.reflect.Type type20 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor21 = typeLruCache3.get(type20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.invoke.TypeDescriptor typeDescriptor29 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass25);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache31 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass32 = constantDescLruCache31.getClass();
        boolean boolean33 = typeLruCache3.containsKey((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int36 = typeLruCache35.size();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass41 = typeLruCache40.getClass();
        typeLruCache35.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass41);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass44);
        boolean boolean46 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass44);
        int int47 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNull(typeDescriptor21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(typeDescriptor29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (byte) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = typeLruCache5.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor12 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass11);
        int int13 = typeLruCache3.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = typeLruCache15.getClass();
        boolean boolean17 = typeLruCache3.containsKey((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = typeLruCache19.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache27 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        typeLruCache27.put((java.lang.reflect.Type) wildcardClass29, (java.lang.invoke.TypeDescriptor) wildcardClass31);
        int int33 = typeLruCache27.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        typeLruCache35.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass39);
        int int41 = typeLruCache35.size();
        java.lang.Class<?> wildcardClass42 = typeLruCache35.getClass();
        boolean boolean43 = typeLruCache27.containsKey((java.lang.reflect.Type) wildcardClass42);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        typeLruCache45.put((java.lang.reflect.Type) wildcardClass47, (java.lang.invoke.TypeDescriptor) wildcardClass49);
        int int51 = typeLruCache45.size();
        java.lang.Class<?> wildcardClass52 = typeLruCache45.getClass();
        boolean boolean53 = typeLruCache27.containsKey((java.lang.reflect.Type) wildcardClass52);
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass52);
        java.lang.Class<?> wildcardClass55 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor56 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass55);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache58 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache60 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        typeLruCache60.put((java.lang.reflect.Type) wildcardClass62, (java.lang.invoke.TypeDescriptor) wildcardClass64);
        java.lang.invoke.TypeDescriptor typeDescriptor66 = typeLruCache58.get((java.lang.reflect.Type) wildcardClass62);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache68 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        typeLruCache68.put((java.lang.reflect.Type) wildcardClass70, (java.lang.invoke.TypeDescriptor) wildcardClass72);
        java.lang.invoke.TypeDescriptor typeDescriptor74 = typeLruCache58.get((java.lang.reflect.Type) wildcardClass72);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache76 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Class<?> wildcardClass78 = obj77.getClass();
        java.lang.Object obj79 = new java.lang.Object();
        java.lang.Class<?> wildcardClass80 = obj79.getClass();
        typeLruCache76.put((java.lang.reflect.Type) wildcardClass78, (java.lang.invoke.TypeDescriptor) wildcardClass80);
        int int82 = typeLruCache76.size();
        java.lang.Class<?> wildcardClass83 = typeLruCache76.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor84 = typeLruCache58.get((java.lang.reflect.Type) wildcardClass83);
        boolean boolean85 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(typeDescriptor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNull(typeDescriptor56);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(typeDescriptor66);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(typeDescriptor74);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNull(typeDescriptor84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(10);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = typeLruCache5.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor12 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass11);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        int int20 = typeLruCache14.size();
        java.lang.Class<?> wildcardClass21 = typeLruCache14.getClass();
        boolean boolean22 = typeLruCache3.containsKey((java.lang.reflect.Type) wildcardClass21);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        typeLruCache26.put((java.lang.reflect.Type) wildcardClass28, (java.lang.invoke.TypeDescriptor) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = typeLruCache26.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor33 = typeLruCache24.get((java.lang.reflect.Type) wildcardClass32);
        int int34 = typeLruCache24.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass37 = typeLruCache36.getClass();
        boolean boolean38 = typeLruCache24.containsKey((java.lang.reflect.Type) wildcardClass37);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache40 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass41 = typeLruCache40.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        typeLruCache45.put((java.lang.reflect.Type) wildcardClass47, (java.lang.invoke.TypeDescriptor) wildcardClass49);
        java.lang.Class<?> wildcardClass51 = typeLruCache45.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor52 = typeLruCache43.get((java.lang.reflect.Type) wildcardClass51);
        int int53 = typeLruCache43.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass56 = typeLruCache55.getClass();
        boolean boolean57 = typeLruCache43.containsKey((java.lang.reflect.Type) wildcardClass56);
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass56);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(typeDescriptor12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(typeDescriptor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(typeDescriptor52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>, java.lang.invoke.TypeDescriptor> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>, java.lang.invoke.TypeDescriptor>((int) '#');
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = typeLruCache14.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor21 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass27);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass27);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        typeLruCache36.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = typeLruCache36.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass42);
        int int44 = typeLruCache34.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass47 = typeLruCache46.getClass();
        boolean boolean48 = typeLruCache34.containsKey((java.lang.reflect.Type) wildcardClass47);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        typeLruCache53.put((java.lang.reflect.Type) wildcardClass55, (java.lang.invoke.TypeDescriptor) wildcardClass57);
        java.lang.invoke.TypeDescriptor typeDescriptor59 = typeLruCache51.get((java.lang.reflect.Type) wildcardClass55);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        typeLruCache61.put((java.lang.reflect.Type) wildcardClass63, (java.lang.invoke.TypeDescriptor) wildcardClass65);
        java.lang.invoke.TypeDescriptor typeDescriptor67 = typeLruCache51.get((java.lang.reflect.Type) wildcardClass65);
        boolean boolean68 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(typeDescriptor21);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(typeDescriptor59);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(typeDescriptor67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = typeLruCache4.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache7 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        typeLruCache7.put((java.lang.reflect.Type) wildcardClass9, (java.lang.invoke.TypeDescriptor) wildcardClass11);
        int int13 = typeLruCache7.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        typeLruCache15.put((java.lang.reflect.Type) wildcardClass17, (java.lang.invoke.TypeDescriptor) wildcardClass19);
        int int21 = typeLruCache15.size();
        java.lang.Class<?> wildcardClass22 = typeLruCache15.getClass();
        boolean boolean23 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass22);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        int int31 = typeLruCache25.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        int int39 = typeLruCache33.size();
        java.lang.Class<?> wildcardClass40 = typeLruCache33.getClass();
        boolean boolean41 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass40);
        boolean boolean42 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass40);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int46 = typeLruCache45.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache50 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache52 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        typeLruCache52.put((java.lang.reflect.Type) wildcardClass54, (java.lang.invoke.TypeDescriptor) wildcardClass56);
        java.lang.invoke.TypeDescriptor typeDescriptor58 = typeLruCache50.get((java.lang.reflect.Type) wildcardClass54);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache60 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        typeLruCache60.put((java.lang.reflect.Type) wildcardClass62, (java.lang.invoke.TypeDescriptor) wildcardClass64);
        java.lang.invoke.TypeDescriptor typeDescriptor66 = typeLruCache50.get((java.lang.reflect.Type) wildcardClass64);
        boolean boolean67 = typeLruCache48.containsKey((java.lang.reflect.Type) wildcardClass64);
        java.lang.reflect.Type type68 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor69 = typeLruCache48.get(type68);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        typeLruCache73.put((java.lang.reflect.Type) wildcardClass75, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        java.lang.invoke.TypeDescriptor typeDescriptor79 = typeLruCache71.get((java.lang.reflect.Type) wildcardClass75);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache81 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj82 = new java.lang.Object();
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
        typeLruCache81.put((java.lang.reflect.Type) wildcardClass83, (java.lang.invoke.TypeDescriptor) wildcardClass85);
        java.lang.invoke.TypeDescriptor typeDescriptor87 = typeLruCache71.get((java.lang.reflect.Type) wildcardClass85);
        boolean boolean88 = typeLruCache48.containsKey((java.lang.reflect.Type) wildcardClass85);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache90 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass91 = constantDescLruCache90.getClass();
        typeLruCache45.put((java.lang.reflect.Type) wildcardClass85, (java.lang.invoke.TypeDescriptor) wildcardClass91);
        java.lang.invoke.TypeDescriptor typeDescriptor93 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass91);
        int int94 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNull(typeDescriptor58);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(typeDescriptor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(typeDescriptor69);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(typeDescriptor79);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNull(typeDescriptor87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(typeDescriptor93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        java.lang.invoke.TypeDescriptor typeDescriptor20 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass24, (java.lang.invoke.TypeDescriptor) wildcardClass26);
        java.lang.invoke.TypeDescriptor typeDescriptor28 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass26);
        java.lang.reflect.Type type29 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache12.get(type29);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        typeLruCache34.put((java.lang.reflect.Type) wildcardClass36, (java.lang.invoke.TypeDescriptor) wildcardClass38);
        java.lang.Class<?> wildcardClass40 = typeLruCache34.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor41 = typeLruCache32.get((java.lang.reflect.Type) wildcardClass40);
        int int42 = typeLruCache32.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass45 = typeLruCache44.getClass();
        boolean boolean46 = typeLruCache32.containsKey((java.lang.reflect.Type) wildcardClass45);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass49 = typeLruCache48.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        typeLruCache53.put((java.lang.reflect.Type) wildcardClass55, (java.lang.invoke.TypeDescriptor) wildcardClass57);
        java.lang.Class<?> wildcardClass59 = typeLruCache53.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor60 = typeLruCache51.get((java.lang.reflect.Type) wildcardClass59);
        int int61 = typeLruCache51.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache63 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass64 = typeLruCache63.getClass();
        boolean boolean65 = typeLruCache51.containsKey((java.lang.reflect.Type) wildcardClass64);
        typeLruCache32.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass64);
        java.lang.invoke.TypeDescriptor typeDescriptor67 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass49);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache69 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        typeLruCache73.put((java.lang.reflect.Type) wildcardClass75, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        java.lang.invoke.TypeDescriptor typeDescriptor79 = typeLruCache71.get((java.lang.reflect.Type) wildcardClass75);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache81 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj82 = new java.lang.Object();
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
        typeLruCache81.put((java.lang.reflect.Type) wildcardClass83, (java.lang.invoke.TypeDescriptor) wildcardClass85);
        java.lang.invoke.TypeDescriptor typeDescriptor87 = typeLruCache71.get((java.lang.reflect.Type) wildcardClass85);
        boolean boolean88 = typeLruCache69.containsKey((java.lang.reflect.Type) wildcardClass85);
        java.lang.Class<?> wildcardClass89 = typeLruCache69.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor90 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass89);
        java.lang.Class<?> wildcardClass91 = typeLruCache12.getClass();
        boolean boolean92 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(typeDescriptor20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(typeDescriptor28);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(typeDescriptor41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(typeDescriptor60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(typeDescriptor67);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(typeDescriptor79);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNull(typeDescriptor87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNull(typeDescriptor90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = typeLruCache13.getClass();
        boolean boolean15 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = typeLruCache17.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass24, (java.lang.invoke.TypeDescriptor) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = typeLruCache22.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor29 = typeLruCache20.get((java.lang.reflect.Type) wildcardClass28);
        int int30 = typeLruCache20.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass33 = typeLruCache32.getClass();
        boolean boolean34 = typeLruCache20.containsKey((java.lang.reflect.Type) wildcardClass33);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass18, (java.lang.invoke.TypeDescriptor) wildcardClass33);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache37 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        java.lang.invoke.TypeDescriptor typeDescriptor45 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass41);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache47 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        typeLruCache47.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass51);
        java.lang.invoke.TypeDescriptor typeDescriptor53 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass51);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        int int57 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(typeDescriptor45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(typeDescriptor53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        int int12 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache16 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache18 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        typeLruCache18.put((java.lang.reflect.Type) wildcardClass20, (java.lang.invoke.TypeDescriptor) wildcardClass22);
        java.lang.invoke.TypeDescriptor typeDescriptor24 = typeLruCache16.get((java.lang.reflect.Type) wildcardClass20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        typeLruCache26.put((java.lang.reflect.Type) wildcardClass28, (java.lang.invoke.TypeDescriptor) wildcardClass30);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache16.get((java.lang.reflect.Type) wildcardClass30);
        boolean boolean33 = typeLruCache14.containsKey((java.lang.reflect.Type) wildcardClass30);
        boolean boolean34 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass30);
        int int35 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache37 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache39 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass40 = wildcardClassLruCache39.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor41 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass40);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass44 = typeLruCache43.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor45 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass44);
        java.lang.invoke.TypeDescriptor typeDescriptor46 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass44);
        int int47 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(typeDescriptor24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(typeDescriptor41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(typeDescriptor45);
        org.junit.Assert.assertNull(typeDescriptor46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = typeDescriptorLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache3 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass4 = wildcardClassLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor5 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass4);
        int int6 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache8 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass12, (java.lang.invoke.TypeDescriptor) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = typeLruCache10.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        int int25 = typeLruCache19.size();
        java.lang.Class<?> wildcardClass26 = typeLruCache19.getClass();
        boolean boolean27 = typeLruCache8.containsKey((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int30 = typeLruCache29.size();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass35 = typeLruCache34.getClass();
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass32, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        boolean boolean37 = typeLruCache8.containsKey((java.lang.reflect.Type) wildcardClass35);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache41 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass42 = wildcardClassLruCache41.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass42);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass46 = typeLruCache45.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass46);
        java.lang.invoke.TypeDescriptor typeDescriptor48 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass46);
        boolean boolean49 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int52 = typeLruCache51.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        typeLruCache54.put((java.lang.reflect.Type) wildcardClass56, (java.lang.invoke.TypeDescriptor) wildcardClass58);
        java.lang.Class<?> wildcardClass60 = typeLruCache54.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        typeLruCache62.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass66);
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass60, (java.lang.invoke.TypeDescriptor) wildcardClass64);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache70 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache72 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        typeLruCache72.put((java.lang.reflect.Type) wildcardClass74, (java.lang.invoke.TypeDescriptor) wildcardClass76);
        java.lang.Class<?> wildcardClass78 = typeLruCache72.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor79 = typeLruCache70.get((java.lang.reflect.Type) wildcardClass78);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache81 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache83 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
        java.lang.Object obj86 = new java.lang.Object();
        java.lang.Class<?> wildcardClass87 = obj86.getClass();
        typeLruCache83.put((java.lang.reflect.Type) wildcardClass85, (java.lang.invoke.TypeDescriptor) wildcardClass87);
        java.lang.invoke.TypeDescriptor typeDescriptor89 = typeLruCache81.get((java.lang.reflect.Type) wildcardClass85);
        java.lang.invoke.TypeDescriptor typeDescriptor90 = typeLruCache70.get((java.lang.reflect.Type) wildcardClass85);
        java.lang.invoke.TypeDescriptor typeDescriptor91 = typeLruCache51.get((java.lang.reflect.Type) wildcardClass85);
        boolean boolean92 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass85);
        java.lang.reflect.Type type93 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor94 = typeLruCache1.get(type93);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(typeDescriptor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNull(typeDescriptor48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNull(typeDescriptor79);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNull(typeDescriptor89);
        org.junit.Assert.assertNull(typeDescriptor90);
        org.junit.Assert.assertNull(typeDescriptor91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(typeDescriptor94);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = typeLruCache5.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor12 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass11);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        int int20 = typeLruCache14.size();
        java.lang.Class<?> wildcardClass21 = typeLruCache14.getClass();
        boolean boolean22 = typeLruCache3.containsKey((java.lang.reflect.Type) wildcardClass21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        typeLruCache26.put((java.lang.reflect.Type) wildcardClass28, (java.lang.invoke.TypeDescriptor) wildcardClass30);
        int int32 = typeLruCache26.size();
        java.lang.Class<?> wildcardClass33 = typeLruCache26.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass24, (java.lang.invoke.TypeDescriptor) wildcardClass33);
        boolean boolean35 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass24);
        java.lang.reflect.Type type36 = null;
        boolean boolean37 = typeLruCache1.containsKey(type36);
        int int38 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(typeDescriptor12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        typeLruCache21.put((java.lang.reflect.Type) wildcardClass23, (java.lang.invoke.TypeDescriptor) wildcardClass25);
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass23);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache29 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass30 = constantDescLruCache29.getClass();
        boolean boolean31 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass30);
        int int32 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass33 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        typeLruCache35.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass39);
        int int41 = typeLruCache35.size();
        int int42 = typeLruCache35.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        boolean boolean50 = typeLruCache35.containsKey((java.lang.reflect.Type) wildcardClass46);
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        typeLruCache55.put((java.lang.reflect.Type) wildcardClass57, (java.lang.invoke.TypeDescriptor) wildcardClass59);
        java.lang.Class<?> wildcardClass61 = typeLruCache55.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor62 = typeLruCache53.get((java.lang.reflect.Type) wildcardClass61);
        int int63 = typeLruCache53.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass66 = typeLruCache65.getClass();
        boolean boolean67 = typeLruCache53.containsKey((java.lang.reflect.Type) wildcardClass66);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache69 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        typeLruCache71.put((java.lang.reflect.Type) wildcardClass73, (java.lang.invoke.TypeDescriptor) wildcardClass75);
        java.lang.Class<?> wildcardClass77 = typeLruCache71.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor78 = typeLruCache69.get((java.lang.reflect.Type) wildcardClass77);
        int int79 = typeLruCache69.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache81 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass82 = typeLruCache81.getClass();
        boolean boolean83 = typeLruCache69.containsKey((java.lang.reflect.Type) wildcardClass82);
        java.lang.invoke.TypeDescriptor typeDescriptor84 = typeLruCache53.get((java.lang.reflect.Type) wildcardClass82);
        java.lang.invoke.TypeDescriptor typeDescriptor85 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass82);
        int int86 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(typeDescriptor51);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNull(typeDescriptor62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(typeDescriptor78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(typeDescriptor84);
        org.junit.Assert.assertNull(typeDescriptor85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache37 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass38 = wildcardClassLruCache37.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor39 = typeLruCache35.get((java.lang.reflect.Type) wildcardClass38);
        int int40 = typeLruCache35.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        java.lang.Class<?> wildcardClass50 = typeLruCache44.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache42.get((java.lang.reflect.Type) wildcardClass50);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        typeLruCache53.put((java.lang.reflect.Type) wildcardClass55, (java.lang.invoke.TypeDescriptor) wildcardClass57);
        int int59 = typeLruCache53.size();
        java.lang.Class<?> wildcardClass60 = typeLruCache53.getClass();
        boolean boolean61 = typeLruCache42.containsKey((java.lang.reflect.Type) wildcardClass60);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache63 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int64 = typeLruCache63.size();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache68 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass69 = typeLruCache68.getClass();
        typeLruCache63.put((java.lang.reflect.Type) wildcardClass66, (java.lang.invoke.TypeDescriptor) wildcardClass69);
        boolean boolean71 = typeLruCache42.containsKey((java.lang.reflect.Type) wildcardClass69);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache75 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass76 = wildcardClassLruCache75.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor77 = typeLruCache73.get((java.lang.reflect.Type) wildcardClass76);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache79 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass80 = typeLruCache79.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor81 = typeLruCache73.get((java.lang.reflect.Type) wildcardClass80);
        java.lang.invoke.TypeDescriptor typeDescriptor82 = typeLruCache42.get((java.lang.reflect.Type) wildcardClass80);
        boolean boolean83 = typeLruCache35.containsKey((java.lang.reflect.Type) wildcardClass80);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache85 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache87 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj88 = new java.lang.Object();
        java.lang.Class<?> wildcardClass89 = obj88.getClass();
        java.lang.Object obj90 = new java.lang.Object();
        java.lang.Class<?> wildcardClass91 = obj90.getClass();
        typeLruCache87.put((java.lang.reflect.Type) wildcardClass89, (java.lang.invoke.TypeDescriptor) wildcardClass91);
        java.lang.Class<?> wildcardClass93 = typeLruCache87.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor94 = typeLruCache85.get((java.lang.reflect.Type) wildcardClass93);
        java.lang.invoke.TypeDescriptor typeDescriptor95 = typeLruCache35.get((java.lang.reflect.Type) wildcardClass93);
        java.lang.Class<?> wildcardClass96 = typeLruCache35.getClass();
        boolean boolean97 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(typeDescriptor39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(typeDescriptor51);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNull(typeDescriptor77);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNull(typeDescriptor81);
        org.junit.Assert.assertNull(typeDescriptor82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNull(typeDescriptor94);
        org.junit.Assert.assertNull(typeDescriptor95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        int int20 = typeLruCache1.size();
        int int21 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = typeLruCache25.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass31);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        typeLruCache36.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = typeLruCache36.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass42);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache47 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        typeLruCache47.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass51);
        java.lang.invoke.TypeDescriptor typeDescriptor53 = typeLruCache45.get((java.lang.reflect.Type) wildcardClass49);
        java.lang.invoke.TypeDescriptor typeDescriptor54 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass49);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache56 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache58 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        typeLruCache58.put((java.lang.reflect.Type) wildcardClass60, (java.lang.invoke.TypeDescriptor) wildcardClass62);
        java.lang.Class<?> wildcardClass64 = typeLruCache58.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor65 = typeLruCache56.get((java.lang.reflect.Type) wildcardClass64);
        int int66 = typeLruCache56.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache68 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass69 = typeLruCache68.getClass();
        boolean boolean70 = typeLruCache56.containsKey((java.lang.reflect.Type) wildcardClass69);
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass69);
        java.lang.invoke.TypeDescriptor typeDescriptor72 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass69);
        int int73 = typeLruCache1.size();
        int int74 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(typeDescriptor53);
        org.junit.Assert.assertNull(typeDescriptor54);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(typeDescriptor65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(typeDescriptor72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        int int8 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = typeLruCache10.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor12 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass11);
        int int13 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        typeLruCache17.put((java.lang.reflect.Type) wildcardClass19, (java.lang.invoke.TypeDescriptor) wildcardClass21);
        java.lang.invoke.TypeDescriptor typeDescriptor23 = typeLruCache15.get((java.lang.reflect.Type) wildcardClass19);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache15.get((java.lang.reflect.Type) wildcardClass29);
        java.lang.reflect.Type type32 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor33 = typeLruCache15.get(type32);
        int int34 = typeLruCache15.size();
        java.lang.Class<?> wildcardClass35 = typeLruCache15.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor36 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(typeDescriptor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(typeDescriptor23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNull(typeDescriptor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(typeDescriptor36);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>(10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache3 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass4 = wildcardClassLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor5 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass4);
        int int6 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass7 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(typeDescriptor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = typeLruCache13.getClass();
        boolean boolean15 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = typeLruCache17.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass24, (java.lang.invoke.TypeDescriptor) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = typeLruCache22.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor29 = typeLruCache20.get((java.lang.reflect.Type) wildcardClass28);
        int int30 = typeLruCache20.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass33 = typeLruCache32.getClass();
        boolean boolean34 = typeLruCache20.containsKey((java.lang.reflect.Type) wildcardClass33);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass18, (java.lang.invoke.TypeDescriptor) wildcardClass33);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache37 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        java.lang.invoke.TypeDescriptor typeDescriptor45 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass41);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache47 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        typeLruCache47.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass51);
        java.lang.invoke.TypeDescriptor typeDescriptor53 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass51);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        java.lang.reflect.Type type57 = null;
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache59 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int60 = typeLruCache59.size();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache64 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass65 = typeLruCache64.getClass();
        typeLruCache59.put((java.lang.reflect.Type) wildcardClass62, (java.lang.invoke.TypeDescriptor) wildcardClass65);
        typeLruCache1.put(type57, (java.lang.invoke.TypeDescriptor) wildcardClass62);
        int int68 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(typeDescriptor45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(typeDescriptor53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        int int20 = typeLruCache1.size();
        int int21 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = typeLruCache25.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass31);
        int int33 = typeLruCache23.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass36 = typeLruCache35.getClass();
        boolean boolean37 = typeLruCache23.containsKey((java.lang.reflect.Type) wildcardClass36);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass40 = typeLruCache39.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        java.lang.Class<?> wildcardClass50 = typeLruCache44.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache42.get((java.lang.reflect.Type) wildcardClass50);
        int int52 = typeLruCache42.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass55 = typeLruCache54.getClass();
        boolean boolean56 = typeLruCache42.containsKey((java.lang.reflect.Type) wildcardClass55);
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass40, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache59 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        typeLruCache61.put((java.lang.reflect.Type) wildcardClass63, (java.lang.invoke.TypeDescriptor) wildcardClass65);
        java.lang.invoke.TypeDescriptor typeDescriptor67 = typeLruCache59.get((java.lang.reflect.Type) wildcardClass63);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache69 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        typeLruCache69.put((java.lang.reflect.Type) wildcardClass71, (java.lang.invoke.TypeDescriptor) wildcardClass73);
        java.lang.invoke.TypeDescriptor typeDescriptor75 = typeLruCache59.get((java.lang.reflect.Type) wildcardClass73);
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass73, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        boolean boolean79 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(typeDescriptor51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(typeDescriptor67);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNull(typeDescriptor75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) '4');
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = typeLruCache5.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor12 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass11);
        int int13 = typeLruCache3.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = typeLruCache15.getClass();
        boolean boolean17 = typeLruCache3.containsKey((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass20 = typeLruCache19.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = typeLruCache24.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass30);
        int int32 = typeLruCache22.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass35 = typeLruCache34.getClass();
        boolean boolean36 = typeLruCache22.containsKey((java.lang.reflect.Type) wildcardClass35);
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass20, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        boolean boolean38 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(typeDescriptor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        int int8 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass12, (java.lang.invoke.TypeDescriptor) wildcardClass14);
        boolean boolean16 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass12);
        int int17 = typeLruCache1.size();
        int int18 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = typeLruCache4.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache7 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        typeLruCache7.put((java.lang.reflect.Type) wildcardClass9, (java.lang.invoke.TypeDescriptor) wildcardClass11);
        int int13 = typeLruCache7.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        typeLruCache15.put((java.lang.reflect.Type) wildcardClass17, (java.lang.invoke.TypeDescriptor) wildcardClass19);
        int int21 = typeLruCache15.size();
        java.lang.Class<?> wildcardClass22 = typeLruCache15.getClass();
        boolean boolean23 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass22);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        int int31 = typeLruCache25.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        int int39 = typeLruCache33.size();
        java.lang.Class<?> wildcardClass40 = typeLruCache33.getClass();
        boolean boolean41 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass40);
        boolean boolean42 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass40);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.reflect.Type type44 = null;
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        typeLruCache48.put((java.lang.reflect.Type) wildcardClass50, (java.lang.invoke.TypeDescriptor) wildcardClass52);
        java.lang.Class<?> wildcardClass54 = typeLruCache48.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor55 = typeLruCache46.get((java.lang.reflect.Type) wildcardClass54);
        int int56 = typeLruCache46.size();
        int int57 = typeLruCache46.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache59 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache63 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        typeLruCache63.put((java.lang.reflect.Type) wildcardClass65, (java.lang.invoke.TypeDescriptor) wildcardClass67);
        java.lang.invoke.TypeDescriptor typeDescriptor69 = typeLruCache61.get((java.lang.reflect.Type) wildcardClass65);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        typeLruCache71.put((java.lang.reflect.Type) wildcardClass73, (java.lang.invoke.TypeDescriptor) wildcardClass75);
        java.lang.invoke.TypeDescriptor typeDescriptor77 = typeLruCache61.get((java.lang.reflect.Type) wildcardClass75);
        boolean boolean78 = typeLruCache59.containsKey((java.lang.reflect.Type) wildcardClass75);
        boolean boolean79 = typeLruCache46.containsKey((java.lang.reflect.Type) wildcardClass75);
        int int80 = typeLruCache46.size();
        java.lang.Class<?> wildcardClass81 = typeLruCache46.getClass();
        typeLruCache1.put(type44, (java.lang.invoke.TypeDescriptor) wildcardClass81);
        int int83 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(typeDescriptor55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNull(typeDescriptor69);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNull(typeDescriptor77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = typeLruCache4.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache7 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        typeLruCache7.put((java.lang.reflect.Type) wildcardClass9, (java.lang.invoke.TypeDescriptor) wildcardClass11);
        int int13 = typeLruCache7.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        typeLruCache15.put((java.lang.reflect.Type) wildcardClass17, (java.lang.invoke.TypeDescriptor) wildcardClass19);
        int int21 = typeLruCache15.size();
        java.lang.Class<?> wildcardClass22 = typeLruCache15.getClass();
        boolean boolean23 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass22);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        int int31 = typeLruCache25.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        int int39 = typeLruCache33.size();
        java.lang.Class<?> wildcardClass40 = typeLruCache33.getClass();
        boolean boolean41 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass40);
        boolean boolean42 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass40);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.reflect.Type type44 = null;
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        typeLruCache48.put((java.lang.reflect.Type) wildcardClass50, (java.lang.invoke.TypeDescriptor) wildcardClass52);
        java.lang.Class<?> wildcardClass54 = typeLruCache48.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor55 = typeLruCache46.get((java.lang.reflect.Type) wildcardClass54);
        int int56 = typeLruCache46.size();
        int int57 = typeLruCache46.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache59 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache63 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        typeLruCache63.put((java.lang.reflect.Type) wildcardClass65, (java.lang.invoke.TypeDescriptor) wildcardClass67);
        java.lang.invoke.TypeDescriptor typeDescriptor69 = typeLruCache61.get((java.lang.reflect.Type) wildcardClass65);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        typeLruCache71.put((java.lang.reflect.Type) wildcardClass73, (java.lang.invoke.TypeDescriptor) wildcardClass75);
        java.lang.invoke.TypeDescriptor typeDescriptor77 = typeLruCache61.get((java.lang.reflect.Type) wildcardClass75);
        boolean boolean78 = typeLruCache59.containsKey((java.lang.reflect.Type) wildcardClass75);
        boolean boolean79 = typeLruCache46.containsKey((java.lang.reflect.Type) wildcardClass75);
        int int80 = typeLruCache46.size();
        java.lang.Class<?> wildcardClass81 = typeLruCache46.getClass();
        typeLruCache1.put(type44, (java.lang.invoke.TypeDescriptor) wildcardClass81);
        java.lang.Class<?> wildcardClass83 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(typeDescriptor55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNull(typeDescriptor69);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNull(typeDescriptor77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = typeLruCache13.getClass();
        boolean boolean15 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = typeLruCache19.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor26 = typeLruCache17.get((java.lang.reflect.Type) wildcardClass25);
        int int27 = typeLruCache17.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass30 = typeLruCache29.getClass();
        boolean boolean31 = typeLruCache17.containsKey((java.lang.reflect.Type) wildcardClass30);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass30);
        int int33 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass17);
        int int21 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass27);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        java.lang.invoke.TypeDescriptor typeDescriptor39 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass37);
        java.lang.reflect.Type type40 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor41 = typeLruCache23.get(type40);
        int int42 = typeLruCache23.size();
        int int43 = typeLruCache23.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass46 = typeLruCache45.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass46);
        java.lang.invoke.TypeDescriptor typeDescriptor48 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass49 = typeDescriptor48.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(typeDescriptor39);
        org.junit.Assert.assertNull(typeDescriptor41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNull(typeDescriptor48);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = typeLruCache13.getClass();
        boolean boolean15 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass14);
        java.lang.reflect.Type type16 = null;
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache18 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        typeLruCache20.put((java.lang.reflect.Type) wildcardClass22, (java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = typeLruCache20.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache18.get((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass31, (java.lang.invoke.TypeDescriptor) wildcardClass33);
        int int35 = typeLruCache29.size();
        java.lang.Class<?> wildcardClass36 = typeLruCache29.getClass();
        boolean boolean37 = typeLruCache18.containsKey((java.lang.reflect.Type) wildcardClass36);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int40 = typeLruCache39.size();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass45 = typeLruCache44.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass42, (java.lang.invoke.TypeDescriptor) wildcardClass45);
        boolean boolean47 = typeLruCache18.containsKey((java.lang.reflect.Type) wildcardClass45);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache51 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass52 = wildcardClassLruCache51.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor53 = typeLruCache49.get((java.lang.reflect.Type) wildcardClass52);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass56 = typeLruCache55.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor57 = typeLruCache49.get((java.lang.reflect.Type) wildcardClass56);
        java.lang.invoke.TypeDescriptor typeDescriptor58 = typeLruCache18.get((java.lang.reflect.Type) wildcardClass56);
        typeLruCache1.put(type16, (java.lang.invoke.TypeDescriptor) wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(typeDescriptor53);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNull(typeDescriptor57);
        org.junit.Assert.assertNull(typeDescriptor58);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = typeLruCache6.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass4, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache12 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass13 = wildcardClassLruCache12.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor14 = typeLruCache10.get((java.lang.reflect.Type) wildcardClass13);
        java.lang.invoke.TypeDescriptor typeDescriptor15 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(typeDescriptor14);
        org.junit.Assert.assertNull(typeDescriptor15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = typeLruCache13.getClass();
        boolean boolean15 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        typeLruCache17.put((java.lang.reflect.Type) wildcardClass19, (java.lang.invoke.TypeDescriptor) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = typeLruCache17.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        int int31 = typeLruCache25.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        int int39 = typeLruCache33.size();
        java.lang.Class<?> wildcardClass40 = typeLruCache33.getClass();
        boolean boolean41 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass40);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        typeLruCache43.put((java.lang.reflect.Type) wildcardClass45, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        int int49 = typeLruCache43.size();
        java.lang.Class<?> wildcardClass50 = typeLruCache43.getClass();
        boolean boolean51 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass50);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass23, (java.lang.invoke.TypeDescriptor) wildcardClass50);
        int int53 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass54 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        int int18 = typeLruCache12.size();
        java.lang.Class<?> wildcardClass19 = typeLruCache12.getClass();
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass19);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        int int30 = typeLruCache24.size();
        java.lang.Class<?> wildcardClass31 = typeLruCache24.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass22, (java.lang.invoke.TypeDescriptor) wildcardClass31);
        int int33 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        int int18 = typeLruCache12.size();
        java.lang.Class<?> wildcardClass19 = typeLruCache12.getClass();
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass19);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int23 = typeLruCache22.size();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache27 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass28 = typeLruCache27.getClass();
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        boolean boolean30 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass28);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache34 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass35 = wildcardClassLruCache34.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor36 = typeLruCache32.get((java.lang.reflect.Type) wildcardClass35);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache38 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int39 = typeLruCache38.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        typeLruCache41.put((java.lang.reflect.Type) wildcardClass43, (java.lang.invoke.TypeDescriptor) wildcardClass45);
        java.lang.Class<?> wildcardClass47 = typeLruCache41.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        typeLruCache49.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass53);
        typeLruCache38.put((java.lang.reflect.Type) wildcardClass47, (java.lang.invoke.TypeDescriptor) wildcardClass51);
        boolean boolean56 = typeLruCache32.containsKey((java.lang.reflect.Type) wildcardClass47);
        boolean boolean57 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass47);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache59 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        typeLruCache61.put((java.lang.reflect.Type) wildcardClass63, (java.lang.invoke.TypeDescriptor) wildcardClass65);
        java.lang.invoke.TypeDescriptor typeDescriptor67 = typeLruCache59.get((java.lang.reflect.Type) wildcardClass63);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache69 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        typeLruCache69.put((java.lang.reflect.Type) wildcardClass71, (java.lang.invoke.TypeDescriptor) wildcardClass73);
        java.lang.invoke.TypeDescriptor typeDescriptor75 = typeLruCache59.get((java.lang.reflect.Type) wildcardClass73);
        java.lang.reflect.Type type76 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor77 = typeLruCache59.get(type76);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache79 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache81 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj82 = new java.lang.Object();
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
        typeLruCache81.put((java.lang.reflect.Type) wildcardClass83, (java.lang.invoke.TypeDescriptor) wildcardClass85);
        java.lang.Class<?> wildcardClass87 = typeLruCache81.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor88 = typeLruCache79.get((java.lang.reflect.Type) wildcardClass87);
        int int89 = typeLruCache79.size();
        java.lang.Class<?> wildcardClass90 = typeLruCache79.getClass();
        boolean boolean91 = typeLruCache59.containsKey((java.lang.reflect.Type) wildcardClass90);
        boolean boolean92 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(typeDescriptor36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(typeDescriptor67);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNull(typeDescriptor75);
        org.junit.Assert.assertNull(typeDescriptor77);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNull(typeDescriptor88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>, java.lang.reflect.AnnotatedElement> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>, java.lang.reflect.AnnotatedElement>((int) (short) 10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>, java.io.Serializable> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>, java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        int int11 = typeLruCache5.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        int int19 = typeLruCache13.size();
        java.lang.Class<?> wildcardClass20 = typeLruCache13.getClass();
        boolean boolean21 = typeLruCache5.containsKey((java.lang.reflect.Type) wildcardClass20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        int int29 = typeLruCache23.size();
        java.lang.Class<?> wildcardClass30 = typeLruCache23.getClass();
        boolean boolean31 = typeLruCache5.containsKey((java.lang.reflect.Type) wildcardClass30);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int34 = typeLruCache33.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass37 = typeLruCache36.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        int int45 = typeLruCache39.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache47 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        typeLruCache47.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass51);
        int int53 = typeLruCache47.size();
        java.lang.Class<?> wildcardClass54 = typeLruCache47.getClass();
        boolean boolean55 = typeLruCache39.containsKey((java.lang.reflect.Type) wildcardClass54);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache57 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        typeLruCache57.put((java.lang.reflect.Type) wildcardClass59, (java.lang.invoke.TypeDescriptor) wildcardClass61);
        int int63 = typeLruCache57.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        typeLruCache65.put((java.lang.reflect.Type) wildcardClass67, (java.lang.invoke.TypeDescriptor) wildcardClass69);
        int int71 = typeLruCache65.size();
        java.lang.Class<?> wildcardClass72 = typeLruCache65.getClass();
        boolean boolean73 = typeLruCache57.containsKey((java.lang.reflect.Type) wildcardClass72);
        boolean boolean74 = typeLruCache39.containsKey((java.lang.reflect.Type) wildcardClass72);
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass72);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass30, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = typeLruCache14.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor21 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass27);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass27);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        typeLruCache36.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = typeLruCache36.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache34.get((java.lang.reflect.Type) wildcardClass42);
        int int44 = typeLruCache34.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass47 = typeLruCache46.getClass();
        boolean boolean48 = typeLruCache34.containsKey((java.lang.reflect.Type) wildcardClass47);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int52 = typeLruCache51.size();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache56 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass57 = typeLruCache56.getClass();
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass54, (java.lang.invoke.TypeDescriptor) wildcardClass57);
        boolean boolean59 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(typeDescriptor21);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.invoke.TypeDescriptor typeDescriptor29 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass25);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.invoke.TypeDescriptor typeDescriptor37 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass35);
        java.lang.reflect.Type type38 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor39 = typeLruCache21.get(type38);
        int int40 = typeLruCache21.size();
        int int41 = typeLruCache21.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        typeLruCache45.put((java.lang.reflect.Type) wildcardClass47, (java.lang.invoke.TypeDescriptor) wildcardClass49);
        java.lang.Class<?> wildcardClass51 = typeLruCache45.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor52 = typeLruCache43.get((java.lang.reflect.Type) wildcardClass51);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache56 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        typeLruCache56.put((java.lang.reflect.Type) wildcardClass58, (java.lang.invoke.TypeDescriptor) wildcardClass60);
        java.lang.Class<?> wildcardClass62 = typeLruCache56.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor63 = typeLruCache54.get((java.lang.reflect.Type) wildcardClass62);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache67 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        typeLruCache67.put((java.lang.reflect.Type) wildcardClass69, (java.lang.invoke.TypeDescriptor) wildcardClass71);
        java.lang.invoke.TypeDescriptor typeDescriptor73 = typeLruCache65.get((java.lang.reflect.Type) wildcardClass69);
        java.lang.invoke.TypeDescriptor typeDescriptor74 = typeLruCache54.get((java.lang.reflect.Type) wildcardClass69);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache76 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache78 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj79 = new java.lang.Object();
        java.lang.Class<?> wildcardClass80 = obj79.getClass();
        java.lang.Object obj81 = new java.lang.Object();
        java.lang.Class<?> wildcardClass82 = obj81.getClass();
        typeLruCache78.put((java.lang.reflect.Type) wildcardClass80, (java.lang.invoke.TypeDescriptor) wildcardClass82);
        java.lang.Class<?> wildcardClass84 = typeLruCache78.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor85 = typeLruCache76.get((java.lang.reflect.Type) wildcardClass84);
        int int86 = typeLruCache76.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache88 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass89 = typeLruCache88.getClass();
        boolean boolean90 = typeLruCache76.containsKey((java.lang.reflect.Type) wildcardClass89);
        typeLruCache43.put((java.lang.reflect.Type) wildcardClass69, (java.lang.invoke.TypeDescriptor) wildcardClass89);
        java.lang.invoke.TypeDescriptor typeDescriptor92 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass89);
        boolean boolean93 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass89);
        java.lang.reflect.Type type94 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor95 = typeLruCache1.get(type94);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(typeDescriptor29);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(typeDescriptor37);
        org.junit.Assert.assertNull(typeDescriptor39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(typeDescriptor52);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(typeDescriptor63);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNull(typeDescriptor73);
        org.junit.Assert.assertNull(typeDescriptor74);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNull(typeDescriptor85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(typeDescriptor92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(typeDescriptor95);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = typeLruCache6.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass4, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        java.lang.invoke.TypeDescriptor typeDescriptor18 = typeLruCache10.get((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        typeLruCache20.put((java.lang.reflect.Type) wildcardClass22, (java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.invoke.TypeDescriptor typeDescriptor26 = typeLruCache10.get((java.lang.reflect.Type) wildcardClass24);
        java.lang.reflect.Type type27 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor28 = typeLruCache10.get(type27);
        int int29 = typeLruCache10.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        java.lang.invoke.TypeDescriptor typeDescriptor39 = typeLruCache31.get((java.lang.reflect.Type) wildcardClass35);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        typeLruCache41.put((java.lang.reflect.Type) wildcardClass43, (java.lang.invoke.TypeDescriptor) wildcardClass45);
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache31.get((java.lang.reflect.Type) wildcardClass45);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache51.put((java.lang.reflect.Type) wildcardClass53, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        java.lang.Class<?> wildcardClass57 = typeLruCache51.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor58 = typeLruCache49.get((java.lang.reflect.Type) wildcardClass57);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache60 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        typeLruCache60.put((java.lang.reflect.Type) wildcardClass62, (java.lang.invoke.TypeDescriptor) wildcardClass64);
        int int66 = typeLruCache60.size();
        java.lang.Class<?> wildcardClass67 = typeLruCache60.getClass();
        boolean boolean68 = typeLruCache49.containsKey((java.lang.reflect.Type) wildcardClass67);
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass45, (java.lang.invoke.TypeDescriptor) wildcardClass67);
        java.lang.Class<?> wildcardClass70 = typeLruCache10.getClass();
        boolean boolean71 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass70);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        typeLruCache73.put((java.lang.reflect.Type) wildcardClass75, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        int int79 = typeLruCache73.size();
        int int80 = typeLruCache73.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache82 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj83 = new java.lang.Object();
        java.lang.Class<?> wildcardClass84 = obj83.getClass();
        java.lang.Object obj85 = new java.lang.Object();
        java.lang.Class<?> wildcardClass86 = obj85.getClass();
        typeLruCache82.put((java.lang.reflect.Type) wildcardClass84, (java.lang.invoke.TypeDescriptor) wildcardClass86);
        boolean boolean88 = typeLruCache73.containsKey((java.lang.reflect.Type) wildcardClass84);
        java.lang.Class<?> wildcardClass89 = typeLruCache73.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor90 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass89);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass91 = typeDescriptor90.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(typeDescriptor18);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(typeDescriptor26);
        org.junit.Assert.assertNull(typeDescriptor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(typeDescriptor39);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(typeDescriptor58);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNull(typeDescriptor90);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass17);
        java.lang.reflect.Type type21 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor22 = typeLruCache1.get(type21);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int25 = typeLruCache24.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache27 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        typeLruCache27.put((java.lang.reflect.Type) wildcardClass29, (java.lang.invoke.TypeDescriptor) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = typeLruCache27.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        typeLruCache35.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass39);
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        java.lang.invoke.TypeDescriptor typeDescriptor42 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(typeDescriptor22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(typeDescriptor42);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = typeLruCache13.getClass();
        boolean boolean15 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        typeLruCache17.put((java.lang.reflect.Type) wildcardClass19, (java.lang.invoke.TypeDescriptor) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = typeLruCache17.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        int int31 = typeLruCache25.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        int int39 = typeLruCache33.size();
        java.lang.Class<?> wildcardClass40 = typeLruCache33.getClass();
        boolean boolean41 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass40);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        typeLruCache43.put((java.lang.reflect.Type) wildcardClass45, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        int int49 = typeLruCache43.size();
        java.lang.Class<?> wildcardClass50 = typeLruCache43.getClass();
        boolean boolean51 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass50);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass23, (java.lang.invoke.TypeDescriptor) wildcardClass50);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int55 = typeLruCache54.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache57 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        typeLruCache57.put((java.lang.reflect.Type) wildcardClass59, (java.lang.invoke.TypeDescriptor) wildcardClass61);
        java.lang.Class<?> wildcardClass63 = typeLruCache57.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        typeLruCache65.put((java.lang.reflect.Type) wildcardClass67, (java.lang.invoke.TypeDescriptor) wildcardClass69);
        typeLruCache54.put((java.lang.reflect.Type) wildcardClass63, (java.lang.invoke.TypeDescriptor) wildcardClass67);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache75 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        java.lang.Object obj78 = new java.lang.Object();
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        typeLruCache75.put((java.lang.reflect.Type) wildcardClass77, (java.lang.invoke.TypeDescriptor) wildcardClass79);
        java.lang.Class<?> wildcardClass81 = typeLruCache75.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor82 = typeLruCache73.get((java.lang.reflect.Type) wildcardClass81);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache84 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache86 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj87 = new java.lang.Object();
        java.lang.Class<?> wildcardClass88 = obj87.getClass();
        java.lang.Object obj89 = new java.lang.Object();
        java.lang.Class<?> wildcardClass90 = obj89.getClass();
        typeLruCache86.put((java.lang.reflect.Type) wildcardClass88, (java.lang.invoke.TypeDescriptor) wildcardClass90);
        java.lang.invoke.TypeDescriptor typeDescriptor92 = typeLruCache84.get((java.lang.reflect.Type) wildcardClass88);
        java.lang.invoke.TypeDescriptor typeDescriptor93 = typeLruCache73.get((java.lang.reflect.Type) wildcardClass88);
        java.lang.invoke.TypeDescriptor typeDescriptor94 = typeLruCache54.get((java.lang.reflect.Type) wildcardClass88);
        java.lang.invoke.TypeDescriptor typeDescriptor95 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNull(typeDescriptor82);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNull(typeDescriptor92);
        org.junit.Assert.assertNull(typeDescriptor93);
        org.junit.Assert.assertNull(typeDescriptor94);
        org.junit.Assert.assertNull(typeDescriptor95);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        int int20 = typeLruCache1.size();
        int int21 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass27);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        java.lang.invoke.TypeDescriptor typeDescriptor39 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass37);
        java.lang.reflect.Type type40 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor41 = typeLruCache23.get(type40);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        typeLruCache43.put((java.lang.reflect.Type) wildcardClass45, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        java.lang.invoke.TypeDescriptor typeDescriptor49 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass45);
        boolean boolean50 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass45);
        java.lang.Class<?> wildcardClass51 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(typeDescriptor39);
        org.junit.Assert.assertNull(typeDescriptor41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(typeDescriptor49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = typeLruCache4.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache7 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        typeLruCache7.put((java.lang.reflect.Type) wildcardClass9, (java.lang.invoke.TypeDescriptor) wildcardClass11);
        int int13 = typeLruCache7.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        typeLruCache15.put((java.lang.reflect.Type) wildcardClass17, (java.lang.invoke.TypeDescriptor) wildcardClass19);
        int int21 = typeLruCache15.size();
        java.lang.Class<?> wildcardClass22 = typeLruCache15.getClass();
        boolean boolean23 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass22);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        int int31 = typeLruCache25.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        int int39 = typeLruCache33.size();
        java.lang.Class<?> wildcardClass40 = typeLruCache33.getClass();
        boolean boolean41 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass40);
        boolean boolean42 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass40);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int46 = typeLruCache45.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        typeLruCache48.put((java.lang.reflect.Type) wildcardClass50, (java.lang.invoke.TypeDescriptor) wildcardClass52);
        java.lang.Class<?> wildcardClass54 = typeLruCache48.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache56 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        typeLruCache56.put((java.lang.reflect.Type) wildcardClass58, (java.lang.invoke.TypeDescriptor) wildcardClass60);
        typeLruCache45.put((java.lang.reflect.Type) wildcardClass54, (java.lang.invoke.TypeDescriptor) wildcardClass58);
        boolean boolean63 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass58);
        int int64 = typeLruCache1.size();
        int int65 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) '#');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache9 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        typeLruCache9.put((java.lang.reflect.Type) wildcardClass11, (java.lang.invoke.TypeDescriptor) wildcardClass13);
        int int15 = typeLruCache9.size();
        java.lang.Class<?> wildcardClass16 = typeLruCache9.getClass();
        boolean boolean17 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        typeLruCache21.put((java.lang.reflect.Type) wildcardClass23, (java.lang.invoke.TypeDescriptor) wildcardClass25);
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache19.get((java.lang.reflect.Type) wildcardClass23);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass31, (java.lang.invoke.TypeDescriptor) wildcardClass33);
        java.lang.invoke.TypeDescriptor typeDescriptor35 = typeLruCache19.get((java.lang.reflect.Type) wildcardClass33);
        java.lang.reflect.Type type36 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor37 = typeLruCache19.get(type36);
        int int38 = typeLruCache19.size();
        java.lang.Class<?> wildcardClass39 = typeLruCache19.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor40 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass41 = typeDescriptor40.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(typeDescriptor35);
        org.junit.Assert.assertNull(typeDescriptor37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(typeDescriptor40);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>>((int) 'a');
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        java.lang.reflect.Type type18 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache1.get(type18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache21 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass25, (java.lang.invoke.TypeDescriptor) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = typeLruCache23.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache21.get((java.lang.reflect.Type) wildcardClass29);
        int int31 = typeLruCache21.size();
        java.lang.Class<?> wildcardClass32 = typeLruCache21.getClass();
        boolean boolean33 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass32);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        typeLruCache35.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass39);
        int int41 = typeLruCache35.size();
        int int42 = typeLruCache35.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        boolean boolean50 = typeLruCache35.containsKey((java.lang.reflect.Type) wildcardClass46);
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        typeLruCache55.put((java.lang.reflect.Type) wildcardClass57, (java.lang.invoke.TypeDescriptor) wildcardClass59);
        java.lang.Class<?> wildcardClass61 = typeLruCache55.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor62 = typeLruCache53.get((java.lang.reflect.Type) wildcardClass61);
        int int63 = typeLruCache53.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass66 = typeLruCache65.getClass();
        boolean boolean67 = typeLruCache53.containsKey((java.lang.reflect.Type) wildcardClass66);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache69 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache71 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        typeLruCache71.put((java.lang.reflect.Type) wildcardClass73, (java.lang.invoke.TypeDescriptor) wildcardClass75);
        java.lang.Class<?> wildcardClass77 = typeLruCache71.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor78 = typeLruCache69.get((java.lang.reflect.Type) wildcardClass77);
        int int79 = typeLruCache69.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache81 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass82 = typeLruCache81.getClass();
        boolean boolean83 = typeLruCache69.containsKey((java.lang.reflect.Type) wildcardClass82);
        java.lang.invoke.TypeDescriptor typeDescriptor84 = typeLruCache53.get((java.lang.reflect.Type) wildcardClass82);
        java.lang.invoke.TypeDescriptor typeDescriptor85 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass82);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache87 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache89 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj90 = new java.lang.Object();
        java.lang.Class<?> wildcardClass91 = obj90.getClass();
        java.lang.Object obj92 = new java.lang.Object();
        java.lang.Class<?> wildcardClass93 = obj92.getClass();
        typeLruCache89.put((java.lang.reflect.Type) wildcardClass91, (java.lang.invoke.TypeDescriptor) wildcardClass93);
        java.lang.Class<?> wildcardClass95 = typeLruCache89.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor96 = typeLruCache87.get((java.lang.reflect.Type) wildcardClass95);
        int int97 = typeLruCache87.size();
        java.lang.Class<?> wildcardClass98 = typeLruCache87.getClass();
        boolean boolean99 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(typeDescriptor51);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNull(typeDescriptor62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(typeDescriptor78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(typeDescriptor84);
        org.junit.Assert.assertNull(typeDescriptor85);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNull(typeDescriptor96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        int int8 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass12, (java.lang.invoke.TypeDescriptor) wildcardClass14);
        boolean boolean16 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass12);
        int int17 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass18 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int14 = typeLruCache13.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache16 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = typeLruCache16.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor18 = typeLruCache13.get((java.lang.reflect.Type) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = null;
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass17, typeDescriptor19);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        typeLruCache32.put((java.lang.reflect.Type) wildcardClass34, (java.lang.invoke.TypeDescriptor) wildcardClass36);
        java.lang.invoke.TypeDescriptor typeDescriptor38 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass36);
        java.lang.reflect.Type type39 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor40 = typeLruCache22.get(type39);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        java.lang.Class<?> wildcardClass50 = typeLruCache44.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache42.get((java.lang.reflect.Type) wildcardClass50);
        int int52 = typeLruCache42.size();
        java.lang.Class<?> wildcardClass53 = typeLruCache42.getClass();
        boolean boolean54 = typeLruCache22.containsKey((java.lang.reflect.Type) wildcardClass53);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache56 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        typeLruCache56.put((java.lang.reflect.Type) wildcardClass58, (java.lang.invoke.TypeDescriptor) wildcardClass60);
        java.lang.Class<?> wildcardClass62 = typeLruCache56.getClass();
        boolean boolean63 = typeLruCache22.containsKey((java.lang.reflect.Type) wildcardClass62);
        java.lang.invoke.TypeDescriptor typeDescriptor64 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor18);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(typeDescriptor38);
        org.junit.Assert.assertNull(typeDescriptor40);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(typeDescriptor51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(typeDescriptor64);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) ' ');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int4 = typeLruCache3.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache8 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass12, (java.lang.invoke.TypeDescriptor) wildcardClass14);
        java.lang.invoke.TypeDescriptor typeDescriptor16 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass12);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache18 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        typeLruCache18.put((java.lang.reflect.Type) wildcardClass20, (java.lang.invoke.TypeDescriptor) wildcardClass22);
        java.lang.invoke.TypeDescriptor typeDescriptor24 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass22);
        boolean boolean25 = typeLruCache6.containsKey((java.lang.reflect.Type) wildcardClass22);
        java.lang.reflect.Type type26 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache6.get(type26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.invoke.TypeDescriptor typeDescriptor37 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass33);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        java.lang.invoke.TypeDescriptor typeDescriptor45 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass43);
        boolean boolean46 = typeLruCache6.containsKey((java.lang.reflect.Type) wildcardClass43);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache48 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass49 = constantDescLruCache48.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass43, (java.lang.invoke.TypeDescriptor) wildcardClass49);
        java.lang.invoke.TypeDescriptor typeDescriptor51 = null;
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass49, typeDescriptor51);
        int int53 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass54 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(typeDescriptor16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(typeDescriptor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(typeDescriptor37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(typeDescriptor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache3 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass4 = wildcardClassLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor5 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass4);
        int int6 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache8 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass12, (java.lang.invoke.TypeDescriptor) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = typeLruCache10.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        int int25 = typeLruCache19.size();
        java.lang.Class<?> wildcardClass26 = typeLruCache19.getClass();
        boolean boolean27 = typeLruCache8.containsKey((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int30 = typeLruCache29.size();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass35 = typeLruCache34.getClass();
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass32, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        boolean boolean37 = typeLruCache8.containsKey((java.lang.reflect.Type) wildcardClass35);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache41 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass42 = wildcardClassLruCache41.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass42);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass46 = typeLruCache45.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass46);
        java.lang.invoke.TypeDescriptor typeDescriptor48 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass46);
        boolean boolean49 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        typeLruCache53.put((java.lang.reflect.Type) wildcardClass55, (java.lang.invoke.TypeDescriptor) wildcardClass57);
        java.lang.Class<?> wildcardClass59 = typeLruCache53.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor60 = typeLruCache51.get((java.lang.reflect.Type) wildcardClass59);
        java.lang.invoke.TypeDescriptor typeDescriptor61 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass59);
        int int62 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(typeDescriptor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNull(typeDescriptor48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(typeDescriptor60);
        org.junit.Assert.assertNull(typeDescriptor61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        java.lang.invoke.TypeDescriptor typeDescriptor20 = typeLruCache12.get((java.lang.reflect.Type) wildcardClass16);
        java.lang.invoke.TypeDescriptor typeDescriptor21 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass27);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        java.lang.invoke.TypeDescriptor typeDescriptor39 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass37);
        java.lang.reflect.Type type40 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor41 = typeLruCache23.get(type40);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache43 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        typeLruCache43.put((java.lang.reflect.Type) wildcardClass45, (java.lang.invoke.TypeDescriptor) wildcardClass47);
        java.lang.invoke.TypeDescriptor typeDescriptor49 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass45);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache51 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass52 = constantDescLruCache51.getClass();
        boolean boolean53 = typeLruCache23.containsKey((java.lang.reflect.Type) wildcardClass52);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int56 = typeLruCache55.size();
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache60 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass61 = typeLruCache60.getClass();
        typeLruCache55.put((java.lang.reflect.Type) wildcardClass58, (java.lang.invoke.TypeDescriptor) wildcardClass61);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass61, (java.lang.invoke.TypeDescriptor) wildcardClass64);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache67 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        typeLruCache67.put((java.lang.reflect.Type) wildcardClass69, (java.lang.invoke.TypeDescriptor) wildcardClass71);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache74 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int75 = typeLruCache74.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache77 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass78 = typeLruCache77.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor79 = typeLruCache74.get((java.lang.reflect.Type) wildcardClass78);
        boolean boolean80 = typeLruCache67.containsKey((java.lang.reflect.Type) wildcardClass78);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(typeDescriptor20);
        org.junit.Assert.assertNull(typeDescriptor21);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(typeDescriptor39);
        org.junit.Assert.assertNull(typeDescriptor41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(typeDescriptor49);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNull(typeDescriptor79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) ' ');
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = typeLruCache5.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor12 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass11);
        int int13 = typeLruCache3.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = typeLruCache15.getClass();
        boolean boolean17 = typeLruCache3.containsKey((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass20 = typeLruCache19.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = typeLruCache24.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass30);
        int int32 = typeLruCache22.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass35 = typeLruCache34.getClass();
        boolean boolean36 = typeLruCache22.containsKey((java.lang.reflect.Type) wildcardClass35);
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass20, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache41 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        typeLruCache41.put((java.lang.reflect.Type) wildcardClass43, (java.lang.invoke.TypeDescriptor) wildcardClass45);
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass43);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        typeLruCache49.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass53);
        java.lang.invoke.TypeDescriptor typeDescriptor55 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass53);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass53, (java.lang.invoke.TypeDescriptor) wildcardClass57);
        java.lang.Class<?> wildcardClass59 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor60 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass59);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int63 = typeLruCache62.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        typeLruCache65.put((java.lang.reflect.Type) wildcardClass67, (java.lang.invoke.TypeDescriptor) wildcardClass69);
        java.lang.Class<?> wildcardClass71 = typeLruCache65.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache73 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        typeLruCache73.put((java.lang.reflect.Type) wildcardClass75, (java.lang.invoke.TypeDescriptor) wildcardClass77);
        typeLruCache62.put((java.lang.reflect.Type) wildcardClass71, (java.lang.invoke.TypeDescriptor) wildcardClass75);
        java.lang.invoke.TypeDescriptor typeDescriptor80 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(typeDescriptor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNull(typeDescriptor55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(typeDescriptor60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(typeDescriptor80);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = typeLruCache4.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache7 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        typeLruCache7.put((java.lang.reflect.Type) wildcardClass9, (java.lang.invoke.TypeDescriptor) wildcardClass11);
        int int13 = typeLruCache7.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache15 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        typeLruCache15.put((java.lang.reflect.Type) wildcardClass17, (java.lang.invoke.TypeDescriptor) wildcardClass19);
        int int21 = typeLruCache15.size();
        java.lang.Class<?> wildcardClass22 = typeLruCache15.getClass();
        boolean boolean23 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass22);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        int int31 = typeLruCache25.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        typeLruCache33.put((java.lang.reflect.Type) wildcardClass35, (java.lang.invoke.TypeDescriptor) wildcardClass37);
        int int39 = typeLruCache33.size();
        java.lang.Class<?> wildcardClass40 = typeLruCache33.getClass();
        boolean boolean41 = typeLruCache25.containsKey((java.lang.reflect.Type) wildcardClass40);
        boolean boolean42 = typeLruCache7.containsKey((java.lang.reflect.Type) wildcardClass40);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        int int44 = typeLruCache1.size();
        int int45 = typeLruCache1.size();
        int int46 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache50 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        typeLruCache50.put((java.lang.reflect.Type) wildcardClass52, (java.lang.invoke.TypeDescriptor) wildcardClass54);
        java.lang.invoke.TypeDescriptor typeDescriptor56 = typeLruCache48.get((java.lang.reflect.Type) wildcardClass52);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache58 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        typeLruCache58.put((java.lang.reflect.Type) wildcardClass60, (java.lang.invoke.TypeDescriptor) wildcardClass62);
        java.lang.invoke.TypeDescriptor typeDescriptor64 = typeLruCache48.get((java.lang.reflect.Type) wildcardClass62);
        java.lang.reflect.Type type65 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor66 = typeLruCache48.get(type65);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache68 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        typeLruCache68.put((java.lang.reflect.Type) wildcardClass70, (java.lang.invoke.TypeDescriptor) wildcardClass72);
        java.lang.invoke.TypeDescriptor typeDescriptor74 = typeLruCache48.get((java.lang.reflect.Type) wildcardClass70);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache76 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass77 = constantDescLruCache76.getClass();
        boolean boolean78 = typeLruCache48.containsKey((java.lang.reflect.Type) wildcardClass77);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache80 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int81 = typeLruCache80.size();
        java.lang.Object obj82 = new java.lang.Object();
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache85 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass86 = typeLruCache85.getClass();
        typeLruCache80.put((java.lang.reflect.Type) wildcardClass83, (java.lang.invoke.TypeDescriptor) wildcardClass86);
        java.lang.Object obj88 = new java.lang.Object();
        java.lang.Class<?> wildcardClass89 = obj88.getClass();
        typeLruCache48.put((java.lang.reflect.Type) wildcardClass86, (java.lang.invoke.TypeDescriptor) wildcardClass89);
        java.lang.invoke.TypeDescriptor typeDescriptor91 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(typeDescriptor56);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(typeDescriptor64);
        org.junit.Assert.assertNull(typeDescriptor66);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(typeDescriptor74);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNull(typeDescriptor91);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache16 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        typeLruCache16.put((java.lang.reflect.Type) wildcardClass18, (java.lang.invoke.TypeDescriptor) wildcardClass20);
        java.lang.invoke.TypeDescriptor typeDescriptor22 = typeLruCache14.get((java.lang.reflect.Type) wildcardClass18);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        java.lang.invoke.TypeDescriptor typeDescriptor30 = typeLruCache14.get((java.lang.reflect.Type) wildcardClass28);
        boolean boolean31 = typeLruCache12.containsKey((java.lang.reflect.Type) wildcardClass28);
        java.lang.Class<?> wildcardClass32 = typeLruCache12.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor33 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass32);
        int int34 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(typeDescriptor22);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(typeDescriptor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        boolean boolean20 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass17);
        java.lang.reflect.Type type21 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor22 = typeLruCache1.get(type21);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache24 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass25 = wildcardClassLruCache24.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor26 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass25);
        int int27 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(typeDescriptor22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(typeDescriptor26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache9 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        typeLruCache9.put((java.lang.reflect.Type) wildcardClass11, (java.lang.invoke.TypeDescriptor) wildcardClass13);
        int int15 = typeLruCache9.size();
        java.lang.Class<?> wildcardClass16 = typeLruCache9.getClass();
        boolean boolean17 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int20 = typeLruCache19.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache26 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        typeLruCache26.put((java.lang.reflect.Type) wildcardClass28, (java.lang.invoke.TypeDescriptor) wildcardClass30);
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache24.get((java.lang.reflect.Type) wildcardClass28);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        typeLruCache34.put((java.lang.reflect.Type) wildcardClass36, (java.lang.invoke.TypeDescriptor) wildcardClass38);
        java.lang.invoke.TypeDescriptor typeDescriptor40 = typeLruCache24.get((java.lang.reflect.Type) wildcardClass38);
        boolean boolean41 = typeLruCache22.containsKey((java.lang.reflect.Type) wildcardClass38);
        java.lang.reflect.Type type42 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache22.get(type42);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache47 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        typeLruCache47.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass51);
        java.lang.invoke.TypeDescriptor typeDescriptor53 = typeLruCache45.get((java.lang.reflect.Type) wildcardClass49);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache55 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        typeLruCache55.put((java.lang.reflect.Type) wildcardClass57, (java.lang.invoke.TypeDescriptor) wildcardClass59);
        java.lang.invoke.TypeDescriptor typeDescriptor61 = typeLruCache45.get((java.lang.reflect.Type) wildcardClass59);
        boolean boolean62 = typeLruCache22.containsKey((java.lang.reflect.Type) wildcardClass59);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache64 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass65 = constantDescLruCache64.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass59, (java.lang.invoke.TypeDescriptor) wildcardClass65);
        java.lang.invoke.TypeDescriptor typeDescriptor67 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass65);
        int int68 = typeLruCache1.size();
        int int69 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(typeDescriptor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(typeDescriptor53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(typeDescriptor61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(typeDescriptor67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = typeLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor10 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass9);
        int int11 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = typeLruCache13.getClass();
        boolean boolean15 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass14);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache17 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = typeLruCache17.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass24, (java.lang.invoke.TypeDescriptor) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = typeLruCache22.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor29 = typeLruCache20.get((java.lang.reflect.Type) wildcardClass28);
        int int30 = typeLruCache20.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass33 = typeLruCache32.getClass();
        boolean boolean34 = typeLruCache20.containsKey((java.lang.reflect.Type) wildcardClass33);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass18, (java.lang.invoke.TypeDescriptor) wildcardClass33);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache37 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        java.lang.invoke.TypeDescriptor typeDescriptor45 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass41);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache47 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        typeLruCache47.put((java.lang.reflect.Type) wildcardClass49, (java.lang.invoke.TypeDescriptor) wildcardClass51);
        java.lang.invoke.TypeDescriptor typeDescriptor53 = typeLruCache37.get((java.lang.reflect.Type) wildcardClass51);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache58 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache60 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        typeLruCache62.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass66);
        java.lang.invoke.TypeDescriptor typeDescriptor68 = typeLruCache60.get((java.lang.reflect.Type) wildcardClass64);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache70 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        typeLruCache70.put((java.lang.reflect.Type) wildcardClass72, (java.lang.invoke.TypeDescriptor) wildcardClass74);
        java.lang.invoke.TypeDescriptor typeDescriptor76 = typeLruCache60.get((java.lang.reflect.Type) wildcardClass74);
        boolean boolean77 = typeLruCache58.containsKey((java.lang.reflect.Type) wildcardClass74);
        java.lang.Class<?> wildcardClass78 = typeLruCache58.getClass();
        boolean boolean79 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass78);
        java.lang.Class<?> wildcardClass80 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(typeDescriptor45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(typeDescriptor53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNull(typeDescriptor68);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNull(typeDescriptor76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass5 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) '4');
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        typeLruCache5.put((java.lang.reflect.Type) wildcardClass7, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        java.lang.invoke.TypeDescriptor typeDescriptor11 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass7);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache13 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        typeLruCache13.put((java.lang.reflect.Type) wildcardClass15, (java.lang.invoke.TypeDescriptor) wildcardClass17);
        java.lang.invoke.TypeDescriptor typeDescriptor19 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass17);
        java.lang.reflect.Type type20 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor21 = typeLruCache3.get(type20);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache23 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache25 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        typeLruCache25.put((java.lang.reflect.Type) wildcardClass27, (java.lang.invoke.TypeDescriptor) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = typeLruCache25.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor32 = typeLruCache23.get((java.lang.reflect.Type) wildcardClass31);
        int int33 = typeLruCache23.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass36 = typeLruCache35.getClass();
        boolean boolean37 = typeLruCache23.containsKey((java.lang.reflect.Type) wildcardClass36);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass40 = typeLruCache39.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache42 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        java.lang.Class<?> wildcardClass50 = typeLruCache44.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor51 = typeLruCache42.get((java.lang.reflect.Type) wildcardClass50);
        int int52 = typeLruCache42.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache54 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass55 = typeLruCache54.getClass();
        boolean boolean56 = typeLruCache42.containsKey((java.lang.reflect.Type) wildcardClass55);
        typeLruCache23.put((java.lang.reflect.Type) wildcardClass40, (java.lang.invoke.TypeDescriptor) wildcardClass55);
        java.lang.invoke.TypeDescriptor typeDescriptor58 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass40);
        java.lang.invoke.TypeDescriptor typeDescriptor59 = null;
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass40, typeDescriptor59);
        int int61 = typeLruCache1.size();
        int int62 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(typeDescriptor11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(typeDescriptor19);
        org.junit.Assert.assertNull(typeDescriptor21);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(typeDescriptor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(typeDescriptor51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(typeDescriptor58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache3 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass4 = wildcardClassLruCache3.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor5 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass4);
        int int6 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache8 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache10 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        typeLruCache10.put((java.lang.reflect.Type) wildcardClass12, (java.lang.invoke.TypeDescriptor) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = typeLruCache10.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        int int25 = typeLruCache19.size();
        java.lang.Class<?> wildcardClass26 = typeLruCache19.getClass();
        boolean boolean27 = typeLruCache8.containsKey((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int30 = typeLruCache29.size();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache34 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass35 = typeLruCache34.getClass();
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass32, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        boolean boolean37 = typeLruCache8.containsKey((java.lang.reflect.Type) wildcardClass35);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(100);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache41 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass42 = wildcardClassLruCache41.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass42);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache45 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass46 = typeLruCache45.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache39.get((java.lang.reflect.Type) wildcardClass46);
        java.lang.invoke.TypeDescriptor typeDescriptor48 = typeLruCache8.get((java.lang.reflect.Type) wildcardClass46);
        boolean boolean49 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache51 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache53 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        typeLruCache53.put((java.lang.reflect.Type) wildcardClass55, (java.lang.invoke.TypeDescriptor) wildcardClass57);
        java.lang.Class<?> wildcardClass59 = typeLruCache53.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor60 = typeLruCache51.get((java.lang.reflect.Type) wildcardClass59);
        java.lang.invoke.TypeDescriptor typeDescriptor61 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass62 = typeDescriptor61.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(typeDescriptor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNull(typeDescriptor48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(typeDescriptor60);
        org.junit.Assert.assertNull(typeDescriptor61);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        typeLruCache4.put((java.lang.reflect.Type) wildcardClass6, (java.lang.invoke.TypeDescriptor) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = typeLruCache4.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache12 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        typeLruCache12.put((java.lang.reflect.Type) wildcardClass14, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass10, (java.lang.invoke.TypeDescriptor) wildcardClass14);
        int int19 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) '4');
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int4 = typeLruCache3.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache6 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        typeLruCache6.put((java.lang.reflect.Type) wildcardClass8, (java.lang.invoke.TypeDescriptor) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = typeLruCache6.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache14 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        typeLruCache14.put((java.lang.reflect.Type) wildcardClass16, (java.lang.invoke.TypeDescriptor) wildcardClass18);
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass12, (java.lang.invoke.TypeDescriptor) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache24 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        typeLruCache24.put((java.lang.reflect.Type) wildcardClass26, (java.lang.invoke.TypeDescriptor) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = typeLruCache24.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor31 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass30);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache33 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache35 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        typeLruCache35.put((java.lang.reflect.Type) wildcardClass37, (java.lang.invoke.TypeDescriptor) wildcardClass39);
        java.lang.invoke.TypeDescriptor typeDescriptor41 = typeLruCache33.get((java.lang.reflect.Type) wildcardClass37);
        java.lang.invoke.TypeDescriptor typeDescriptor42 = typeLruCache22.get((java.lang.reflect.Type) wildcardClass37);
        java.lang.invoke.TypeDescriptor typeDescriptor43 = typeLruCache3.get((java.lang.reflect.Type) wildcardClass37);
        java.lang.invoke.TypeDescriptor typeDescriptor44 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass37);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache46 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache48 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        typeLruCache48.put((java.lang.reflect.Type) wildcardClass50, (java.lang.invoke.TypeDescriptor) wildcardClass52);
        java.lang.Class<?> wildcardClass54 = typeLruCache48.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor55 = typeLruCache46.get((java.lang.reflect.Type) wildcardClass54);
        int int56 = typeLruCache46.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache58 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass59 = typeLruCache58.getClass();
        boolean boolean60 = typeLruCache46.containsKey((java.lang.reflect.Type) wildcardClass59);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass63 = typeLruCache62.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache65 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache67 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        typeLruCache67.put((java.lang.reflect.Type) wildcardClass69, (java.lang.invoke.TypeDescriptor) wildcardClass71);
        java.lang.Class<?> wildcardClass73 = typeLruCache67.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor74 = typeLruCache65.get((java.lang.reflect.Type) wildcardClass73);
        int int75 = typeLruCache65.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache77 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass78 = typeLruCache77.getClass();
        boolean boolean79 = typeLruCache65.containsKey((java.lang.reflect.Type) wildcardClass78);
        typeLruCache46.put((java.lang.reflect.Type) wildcardClass63, (java.lang.invoke.TypeDescriptor) wildcardClass78);
        boolean boolean81 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass63);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(typeDescriptor31);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(typeDescriptor41);
        org.junit.Assert.assertNull(typeDescriptor42);
        org.junit.Assert.assertNull(typeDescriptor43);
        org.junit.Assert.assertNull(typeDescriptor44);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(typeDescriptor55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNull(typeDescriptor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        typeLruCache1.put((java.lang.reflect.Type) wildcardClass3, (java.lang.invoke.TypeDescriptor) wildcardClass5);
        int int7 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache9 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        typeLruCache9.put((java.lang.reflect.Type) wildcardClass11, (java.lang.invoke.TypeDescriptor) wildcardClass13);
        int int15 = typeLruCache9.size();
        java.lang.Class<?> wildcardClass16 = typeLruCache9.getClass();
        boolean boolean17 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass16);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        int int25 = typeLruCache19.size();
        java.lang.Class<?> wildcardClass26 = typeLruCache19.getClass();
        boolean boolean27 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass26);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache29 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache31 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        typeLruCache31.put((java.lang.reflect.Type) wildcardClass33, (java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.invoke.TypeDescriptor typeDescriptor37 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass33);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache39 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        typeLruCache39.put((java.lang.reflect.Type) wildcardClass41, (java.lang.invoke.TypeDescriptor) wildcardClass43);
        java.lang.invoke.TypeDescriptor typeDescriptor45 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass43);
        java.lang.reflect.Type type46 = null;
        java.lang.invoke.TypeDescriptor typeDescriptor47 = typeLruCache29.get(type46);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache49 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        typeLruCache49.put((java.lang.reflect.Type) wildcardClass51, (java.lang.invoke.TypeDescriptor) wildcardClass53);
        java.lang.invoke.TypeDescriptor typeDescriptor55 = typeLruCache29.get((java.lang.reflect.Type) wildcardClass51);
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache57 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass58 = constantDescLruCache57.getClass();
        boolean boolean59 = typeLruCache29.containsKey((java.lang.reflect.Type) wildcardClass58);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache61 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        int int62 = typeLruCache61.size();
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache66 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass67 = typeLruCache66.getClass();
        typeLruCache61.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass67);
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        typeLruCache29.put((java.lang.reflect.Type) wildcardClass67, (java.lang.invoke.TypeDescriptor) wildcardClass70);
        java.lang.invoke.TypeDescriptor typeDescriptor72 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass70);
        java.lang.Class<?> wildcardClass73 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(typeDescriptor37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(typeDescriptor45);
        org.junit.Assert.assertNull(typeDescriptor47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNull(typeDescriptor55);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(typeDescriptor72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        int int18 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache20 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache22 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        typeLruCache22.put((java.lang.reflect.Type) wildcardClass24, (java.lang.invoke.TypeDescriptor) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = typeLruCache22.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor29 = typeLruCache20.get((java.lang.reflect.Type) wildcardClass28);
        int int30 = typeLruCache20.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache32 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 1);
        java.lang.Class<?> wildcardClass33 = typeLruCache32.getClass();
        boolean boolean34 = typeLruCache20.containsKey((java.lang.reflect.Type) wildcardClass33);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache36 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        typeLruCache36.put((java.lang.reflect.Type) wildcardClass38, (java.lang.invoke.TypeDescriptor) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = typeLruCache36.getClass();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache44 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        typeLruCache44.put((java.lang.reflect.Type) wildcardClass46, (java.lang.invoke.TypeDescriptor) wildcardClass48);
        int int50 = typeLruCache44.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache52 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        typeLruCache52.put((java.lang.reflect.Type) wildcardClass54, (java.lang.invoke.TypeDescriptor) wildcardClass56);
        int int58 = typeLruCache52.size();
        java.lang.Class<?> wildcardClass59 = typeLruCache52.getClass();
        boolean boolean60 = typeLruCache44.containsKey((java.lang.reflect.Type) wildcardClass59);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache62 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        typeLruCache62.put((java.lang.reflect.Type) wildcardClass64, (java.lang.invoke.TypeDescriptor) wildcardClass66);
        int int68 = typeLruCache62.size();
        java.lang.Class<?> wildcardClass69 = typeLruCache62.getClass();
        boolean boolean70 = typeLruCache44.containsKey((java.lang.reflect.Type) wildcardClass69);
        typeLruCache20.put((java.lang.reflect.Type) wildcardClass42, (java.lang.invoke.TypeDescriptor) wildcardClass69);
        java.lang.invoke.TypeDescriptor typeDescriptor72 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(typeDescriptor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(typeDescriptor72);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache3 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        typeLruCache3.put((java.lang.reflect.Type) wildcardClass5, (java.lang.invoke.TypeDescriptor) wildcardClass7);
        java.lang.invoke.TypeDescriptor typeDescriptor9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass5);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache11 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        typeLruCache11.put((java.lang.reflect.Type) wildcardClass13, (java.lang.invoke.TypeDescriptor) wildcardClass15);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass15);
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache19 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        typeLruCache19.put((java.lang.reflect.Type) wildcardClass21, (java.lang.invoke.TypeDescriptor) wildcardClass23);
        int int25 = typeLruCache19.size();
        java.lang.Class<?> wildcardClass26 = typeLruCache19.getClass();
        java.lang.invoke.TypeDescriptor typeDescriptor27 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass26);
        int int28 = typeLruCache1.size();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(typeDescriptor9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(typeDescriptor27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }
}

