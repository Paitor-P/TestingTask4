package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(100);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, java.lang.CharSequence>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.String> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.String>(10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.Type>(1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
        java.lang.Class<?> wildcardClass2 = constantDescLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '#');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableLruCache1 = new com.viktor.lab4.LruCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String>((int) (short) 100);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.CharSequence>(100);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) ' ');
        java.lang.Class<?> wildcardClass2 = constableLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) 'a');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement>((int) (short) 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) (short) 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor> wildcardClassOfFieldLruCache1 = new com.viktor.lab4.LruCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor>(1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) ' ');
        int int2 = constableLruCache1.size();
        int int3 = constableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((int) '4');
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>((int) (byte) 10);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> charSequenceLruCache1 = new com.viktor.lab4.LruCache<java.lang.CharSequence, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (byte) 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Object>((int) (byte) 10);
        int int2 = typeLruCacheLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) ' ');
        int int2 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>(2);
        int int2 = constableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.invoke.TypeDescriptor>((int) (byte) 10);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (byte) 1);
        int int2 = wildcardClassLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.GenericDeclaration> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.GenericDeclaration> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.reflect.GenericDeclaration>((int) (byte) 1);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        int int2 = typeLruCacheLruCache1.size();
        java.lang.Class<?> wildcardClass3 = typeLruCacheLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.Class<?>>(100);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(2);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 10);
        int int2 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.lang.Class<?>>((int) (byte) 100);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>((int) (short) 10);
        int int2 = genericDeclarationLruCache1.size();
        java.lang.Class<?> wildcardClass3 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.io.Serializable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.io.Serializable> typeLruCacheLruCache1 = new com.viktor.lab4.LruCache<com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>, java.io.Serializable>(2);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLruCache1 = new com.viktor.lab4.LruCache<java.lang.Object, java.lang.Comparable<java.lang.String>>(2);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (byte) 10);
        int int2 = serializableLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable> strLruCache1 = new com.viktor.lab4.LruCache<java.lang.String, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.constant.Constable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String> serializableLruCache1 = new com.viktor.lab4.LruCache<java.io.Serializable, java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
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
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        // The following exception was thrown during execution in test generation
        try {
            com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable> constableLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.Constable, java.io.Serializable>((int) ' ');
        int int2 = constableLruCache1.size();
        java.lang.Class<?> wildcardClass3 = constableLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String> wildcardClassLruCache1 = new com.viktor.lab4.LruCache<java.lang.Class<?>, java.lang.String>((int) (short) 1);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescLruCache1 = new com.viktor.lab4.LruCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        java.lang.Class<?> wildcardClass4 = typeLruCache1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = typeLruCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLruCache1 = new com.viktor.lab4.LruCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
        int int2 = typeLruCache1.size();
        int int3 = typeLruCache1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }
}

