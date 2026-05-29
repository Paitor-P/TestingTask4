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
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>((int) ' ');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass4 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>(1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        int int4 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        int int4 = strLruCache1.size();
        int int5 = strLruCache1.size();
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        java.lang.String str9 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(100);
        int int2 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        int int4 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "");
        java.lang.String str6 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        int int12 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("hi!", "hi!");
        int int19 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        int int9 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>((int) (byte) 10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        int int13 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean12 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass13 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.io.Serializable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.io.Serializable>((int) '4');
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        boolean boolean12 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean13 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor>((int) 'a');
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (byte) 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        java.lang.String str3 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        boolean boolean12 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        int int6 = strLruCache1.size();
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>(1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        int int10 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        boolean boolean7 = strLruCache1.containsKey("");
        int int8 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        boolean boolean13 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.String str11 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>((int) '#');
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        boolean boolean11 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        java.lang.String str17 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass6 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        java.lang.String str15 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        boolean boolean5 = strLruCache1.containsKey("hi!");
        java.lang.String str7 = strLruCache1.get("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        boolean boolean12 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        int int11 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        int int9 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        boolean boolean10 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>((int) '#');
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("");
        int int14 = strLruCache1.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        java.lang.String str3 = strLruCache1.get("hi!");
        int int4 = strLruCache1.size();
        boolean boolean6 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        int int9 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("");
        boolean boolean10 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("hi!");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) ' ');
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (byte) 1);
        strLruCache1.put("", "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        boolean boolean10 = strLruCache1.containsKey("");
        boolean boolean12 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((int) '4');
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "hi!");
        boolean boolean14 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        strLruCache1.put("", "hi!");
        java.lang.String str9 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "hi!");
        java.lang.String str14 = strLruCache1.get("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        int int10 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        strLruCache1.put("", "hi!");
        boolean boolean8 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        strLruCache1.put("", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>((int) '4');
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass5 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) 100);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass14 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        boolean boolean6 = strLruCache1.containsKey("");
        java.lang.String str8 = strLruCache1.get("hi!");
        int int9 = strLruCache1.size();
        strLruCache1.put("", "hi!");
        boolean boolean14 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        strLruCache1.put("", "hi!");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        java.lang.String str13 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        int int12 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        strLruCache1.put("", "");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>(10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        boolean boolean6 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "hi!");
        boolean boolean11 = strLruCache1.containsKey("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        java.lang.String str7 = strLruCache1.get("");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.Class<?> wildcardClass11 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        java.lang.Class<?> wildcardClass7 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.String str11 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass12 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("hi!");
        strLruCache1.put("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("", "");
        java.lang.String str13 = strLruCache1.get("");
        java.lang.String str15 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass10 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        boolean boolean10 = strLruCache1.containsKey("hi!");
        int int11 = strLruCache1.size();
        java.lang.String str13 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("hi!");
        java.lang.String str13 = strLruCache1.get("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        java.lang.String str10 = strLruCache1.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        strLruCache1.put("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        java.lang.String str8 = strLruCache1.get("hi!");
        strLruCache1.put("hi!", "hi!");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        strLruCache1.put("hi!", "");
        java.lang.Class<?> wildcardClass17 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        boolean boolean7 = strLruCache1.containsKey("");
        boolean boolean9 = strLruCache1.containsKey("");
        strLruCache1.put("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        int int11 = strLruCache1.size();
        int int12 = strLruCache1.size();
        java.lang.String str14 = strLruCache1.get("");
        java.lang.Class<?> wildcardClass15 = strLruCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        java.lang.String str5 = strLruCache1.get("hi!");
        int int6 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        java.lang.String str11 = strLruCache1.get("");
        java.lang.String str13 = strLruCache1.get("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.reflect.AnnotatedElement> strLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.String, java.lang.String>, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        int int6 = strLruCache1.size();
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) '4');
        strLruCache1.put("", "");
        int int5 = strLruCache1.size();
        boolean boolean7 = strLruCache1.containsKey("");
        java.lang.Class<?> wildcardClass8 = strLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        int int8 = strLruCache1.size();
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        boolean boolean3 = strLruCache1.containsKey("");
        java.lang.String str5 = strLruCache1.get("");
        strLruCache1.put("hi!", "");
        strLruCache1.put("hi!", "");
        java.lang.String str13 = strLruCache1.get("hi!");
        java.lang.String str15 = strLruCache1.get("hi!");
        int int16 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("hi!", "hi!");
        int int5 = strLruCache1.size();
        java.lang.String str7 = strLruCache1.get("hi!");
        int int8 = strLruCache1.size();
        strLruCache1.put("", "");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        strLruCache1.put("", "");
        java.lang.String str12 = strLruCache1.get("hi!");
        java.lang.String str14 = strLruCache1.get("");
        strLruCache1.put("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        java.lang.String str3 = strLruCache1.get("hi!");
        boolean boolean5 = strLruCache1.containsKey("");
        java.lang.String str7 = strLruCache1.get("hi!");
        boolean boolean9 = strLruCache1.containsKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>((int) 'a');
        strLruCache1.put("", "");
        java.lang.String str6 = strLruCache1.get("");
        int int7 = strLruCache1.size();
        boolean boolean9 = strLruCache1.containsKey("hi!");
        java.lang.String str11 = strLruCache1.get("");
        boolean boolean13 = strLruCache1.containsKey("hi!");
        boolean boolean15 = strLruCache1.containsKey("hi!");
        boolean boolean17 = strLruCache1.containsKey("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

