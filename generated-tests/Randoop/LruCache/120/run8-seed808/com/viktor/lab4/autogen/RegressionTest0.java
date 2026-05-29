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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(100);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
        java.lang.Class<?> wildcardClass2 = constantDescLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '#');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) -1);
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
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) ' ');
        java.lang.Class<?> wildcardClass2 = constableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>((int) (byte) 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>(2);
        int int2 = constableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>((int) (byte) 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.GenericDeclaration> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = typeLruCacheLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>(100);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
        int int2 = genericDeclarationLruCache1.size();
        java.lang.Class<?> wildcardClass3 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.io.Serializable> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.io.Serializable>(2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.reflect.Type type4 = null;
        boolean boolean5 = typeLruCache1.containsKey(type4);
        java.lang.Class<?> wildcardClass6 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) ' ');
        int int2 = constableLruCache1.size();
        java.lang.Class<?> wildcardClass3 = constableLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (short) 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>(100);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((int) 'a');
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) 'a');
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (byte) 10);
        int int2 = serializableLruCache1.size();
        int int3 = serializableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>((int) (byte) 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>((int) (short) 100);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(2);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>(100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((int) 'a');
        int int2 = wildcardClassOfFieldLruCache1.size();
        int int3 = wildcardClassOfFieldLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>((int) (byte) 10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.String>(1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.io.Serializable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) ' ');
        int int2 = constableLruCache1.size();
        int int3 = constableLruCache1.size();
        int int4 = constableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Object> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Object>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>((int) (short) 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
        int int2 = genericDeclarationLruCache1.size();
        int int3 = genericDeclarationLruCache1.size();
        java.lang.Class<?> wildcardClass4 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>>(2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) '4');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
        int int2 = constantDescLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration>((int) '4');
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.CharSequence> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.CharSequence>((int) (short) 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 1);
        int int2 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.String> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.String>((int) (byte) 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.GenericDeclaration> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.GenericDeclaration>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>>((int) '4');
        int int2 = serializableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(2);
        java.lang.Class<?> wildcardClass2 = constantDescLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = typeLruCacheLruCache1.size();
        int int3 = typeLruCacheLruCache1.size();
        int int4 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = strComparableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>>((int) (short) 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.String>((int) (short) 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(10);
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = typeLruCacheLruCache1.size();
        int int3 = typeLruCacheLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) 'a');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(100);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.viktor.lab4.LruCache<java.lang.Object, java.io.Serializable> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 10);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration>(1);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>((int) (byte) 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
        int int2 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.Type> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.Type>((int) (byte) 10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        int int5 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.String> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.String>((int) 'a');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type>((int) (short) 1);
        int int2 = serializableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = typeLruCacheLruCache1.size();
        int int3 = typeLruCacheLruCache1.size();
        int int4 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>>(10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor>((int) 'a');
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.CharSequence> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (byte) 1);
        int int2 = wildcardClassLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>((int) (byte) 100);
        int int2 = annotatedElementLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object>((int) (byte) 10);
        int int2 = typeLruCacheLruCache1.size();
        int int3 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type>((int) (byte) 1);
        int int2 = constantDescLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object>((int) (short) 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (byte) 10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Object> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.Object>((int) 'a');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object>((int) (byte) 10);
        int int2 = typeLruCacheLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(100);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object>((int) (byte) 10);
        int int2 = typeLruCacheLruCache1.size();
        int int3 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) ' ');
        int int2 = genericDeclarationLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>((int) (short) 10);
        int int2 = genericDeclarationLruCache1.size();
        int int3 = genericDeclarationLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>((int) '4');
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>>(10);
        int int2 = constantDescLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (byte) 1);
        int int2 = wildcardClassLruCache1.size();
        int int3 = wildcardClassLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>((int) (short) 100);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>>((int) (byte) 100);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (byte) 1);
        int int2 = wildcardClassLruCache1.size();
        java.lang.Class<?> wildcardClass3 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>((int) (byte) 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>((int) ' ');
        int int2 = serializableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>((int) ' ');
        int int2 = serializableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration>(10);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String>((int) (short) 100);
        int int2 = typeLruCacheLruCache1.size();
        int int3 = typeLruCacheLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor>(1);
        int int2 = wildcardClassOfFieldLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration>(1);
        int int2 = serializableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        int int5 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.CharSequence>((int) (short) 100);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc>(2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.CharSequence> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement>((int) (byte) 10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>>((int) '4');
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>((int) (short) 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>(1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>(100);
        int int2 = wildcardClassOfFieldLruCache1.size();
        java.lang.Class<?> wildcardClass3 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>(2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) ' ');
        int int2 = genericDeclarationLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.String> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.reflect.Type> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.reflect.Type>((int) (short) 1);
        int int2 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
        int int2 = genericDeclarationLruCache1.size();
        int int3 = genericDeclarationLruCache1.size();
        int int4 = genericDeclarationLruCache1.size();
        java.lang.Class<?> wildcardClass5 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
        int int2 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.reflect.AnnotatedElement> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
        int int2 = genericDeclarationLruCache1.size();
        int int3 = genericDeclarationLruCache1.size();
        java.lang.Class<?> wildcardClass4 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor>(10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) '4');
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) ' ');
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 10);
        int int2 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) 'a');
        int int2 = constantDescLruCache1.size();
        int int3 = constantDescLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>((int) (byte) 100);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>((int) (short) 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 1);
        int int2 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) ' ');
        int int2 = charSequenceLruCache1.size();
        int int3 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 10);
        int int2 = wildcardClassOfFieldLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Object> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Object>((int) '4');
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.io.Serializable> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.io.Serializable>(10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (byte) 10);
        int int2 = serializableLruCache1.size();
        java.lang.Class<?> wildcardClass3 = serializableLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence>((int) (byte) 100);
        int int2 = wildcardClassLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String>((int) (short) 100);
        int int2 = typeLruCacheLruCache1.size();
        int int3 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.Type> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.Type>(2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(1);
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassLruCache3 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>((int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = wildcardClassLruCache3.getClass();
        boolean boolean5 = typeLruCache1.containsKey((java.lang.reflect.Type) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Object>((int) (byte) 10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>(10);
        int int2 = constableLruCache1.size();
        int int3 = constableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.constant.ConstantDesc> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.constant.ConstantDesc>((int) 'a');
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) ' ');
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Object>((int) 'a');
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
        int int2 = typeLruCache1.size();
        java.lang.reflect.Type type3 = null;
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField4 = typeLruCache1.get(type3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(wildcardClassOfField4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) ' ');
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.reflect.Type> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.reflect.Type>((int) '4');
        java.lang.Class<?> wildcardClass2 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type>(1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>((int) ' ');
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
        java.lang.reflect.Type type2 = null;
        boolean boolean3 = typeLruCache1.containsKey(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.GenericDeclaration>(1);
        int int2 = serializableLruCache1.size();
        int int3 = serializableLruCache1.size();
        java.lang.Class<?> wildcardClass4 = serializableLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) '#');
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Class<?>>((int) (byte) 100);
        int int2 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(1);
        int int2 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 10);
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.ConstantDesc> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.ConstantDesc>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) '4');
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Object> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.Object>((int) (short) 100);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 100);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = strLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((int) (short) 100);
        int int2 = wildcardClassOfFieldLruCache1.size();
        java.lang.Class<?> wildcardClass3 = wildcardClassOfFieldLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>(2);
        int int2 = strLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Class<?>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Class<?>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>(2);
        java.lang.Class<?> wildcardClass2 = objLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>(100);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.ConstantDesc> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.ConstantDesc>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
        int int2 = genericDeclarationLruCache1.size();
        int int3 = genericDeclarationLruCache1.size();
        int int4 = genericDeclarationLruCache1.size();
        int int5 = genericDeclarationLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 10);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        int int5 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.reflect.Type type4 = null;
        boolean boolean5 = typeLruCache1.containsKey(type4);
        int int6 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass7 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>(2);
        int int2 = objLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.Object> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Object>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) '4');
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type>(1);
        int int2 = serializableLruCache1.size();
        java.lang.Class<?> wildcardClass3 = serializableLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc>((int) '4');
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Object>(100);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.ConstantDesc> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.constant.ConstantDesc>((int) '#');
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
        int int2 = genericDeclarationLruCache1.size();
        int int3 = genericDeclarationLruCache1.size();
        int int4 = genericDeclarationLruCache1.size();
        int int5 = genericDeclarationLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) ' ');
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = constableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>((int) (short) 10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>((int) '4');
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>(10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Class<?>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Class<?>>((int) (byte) 10);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) 'a');
        int int2 = constantDescLruCache1.size();
        int int3 = constantDescLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (short) 1);
        int int2 = wildcardClassLruCache1.size();
        int int3 = wildcardClassLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.Class<?>>((int) '4');
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
        int int2 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache4 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int5 = typeLruCache4.size();
        int int6 = typeLruCache4.size();
        int int7 = typeLruCache4.size();
        java.lang.Class<?> wildcardClass8 = typeLruCache4.getClass();
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField9 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardClassOfField9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.constant.Constable>(100);
        int int2 = charSequenceLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) 'a');
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
        int int2 = genericDeclarationLruCache1.size();
        java.lang.Class<?> wildcardClass3 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(2);
        int int2 = constantDescLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache5 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Class<?> wildcardClass6 = genericDeclarationLruCache5.getClass();
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField7 = typeLruCache1.get((java.lang.reflect.Type) wildcardClass6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardClassOfField7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>(2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constantDescLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) ' ');
        int int2 = constableLruCache1.size();
        int int3 = constableLruCache1.size();
        java.lang.Class<?> wildcardClass4 = constableLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(100);
        java.lang.Class<?> wildcardClass2 = annotatedElementLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        int int5 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.String>(2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Class<?>>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = serializableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (short) 100);
        int int2 = serializableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>((int) (short) 10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.reflect.GenericDeclaration> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.reflect.GenericDeclaration>((int) 'a');
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>(100);
        int int2 = wildcardClassLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 10);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Class<?>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.Class<?>>(10);
        int int2 = annotatedElementLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.String>((int) ' ');
        int int2 = annotatedElementLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Object> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Object>(10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>((int) (short) 1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) ' ');
        int int2 = strComparableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.invoke.TypeDescriptor>(100);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (short) 1);
        int int2 = wildcardClassLruCache1.size();
        int int3 = wildcardClassLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.invoke.TypeDescriptor> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        int int4 = typeLruCache1.size();
        int int5 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }
}

