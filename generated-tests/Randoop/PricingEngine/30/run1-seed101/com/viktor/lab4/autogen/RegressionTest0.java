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
        com.viktor.lab4.PricingEngine.CustomerType customerType0 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        java.lang.Class<?> wildcardClass1 = customerType0.getClass();
        org.junit.Assert.assertTrue("'" + customerType0 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType0.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass9 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = pricingEngine0.calculateFinalPrice(pricingRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        int int13 = pricingRequest8.loyaltyPoints();
        int int14 = pricingRequest8.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        java.lang.Class<?> wildcardClass1 = pricingEngine0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) 'a');
        java.lang.String str15 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass16 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType8, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType8, false, "", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType8, false, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 10, customerType8, true, "", false, 10);
        boolean boolean29 = pricingRequest28.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.viktor.lab4.PricingEngine.CustomerType customerType0 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        java.lang.Class<?> wildcardClass1 = customerType0.getClass();
        org.junit.Assert.assertTrue("'" + customerType0 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType0.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        double double26 = pricingRequest20.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType4, false, "", false, (int) (short) 10);
        java.lang.String str15 = pricingRequest14.toString();
        double double16 = pricingRequest14.basePrice();
        double double17 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        int int13 = pricingRequest8.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        java.lang.Class<?> wildcardClass15 = pricingRequest8.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        boolean boolean14 = pricingRequest8.equals((java.lang.Object) 100.0f);
        boolean boolean15 = pricingRequest8.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType16, true, "hi!", false, (int) (byte) 100);
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType23, false, "", true, (int) (byte) 10);
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType32, true, "hi!", false, (int) (byte) 100);
        boolean boolean38 = pricingRequest37.firstOrder();
        boolean boolean39 = pricingRequest37.firstOrder();
        int int40 = pricingRequest37.quantity();
        boolean boolean41 = pricingRequest28.equals((java.lang.Object) int40);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2982.99d + "'", double29 == 2982.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.quantity();
        int int13 = pricingRequest7.quantity();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.firstOrder();
        boolean boolean13 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType11, true, "hi!", false, (int) (byte) 100);
        boolean boolean17 = pricingRequest7.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 10, customerType2, false, "hi!", false, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = customerType2.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType16, true, "hi!", false, (int) (byte) 100);
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType23, false, "", true, (int) (byte) 10);
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType32, true, "hi!", false, (int) (byte) 100);
        boolean boolean38 = pricingRequest37.firstOrder();
        boolean boolean39 = pricingRequest37.firstOrder();
        java.lang.String str40 = pricingRequest37.couponCode();
        java.lang.String str41 = pricingRequest37.couponCode();
        int int42 = pricingRequest37.quantity();
        int int43 = pricingRequest37.quantity();
        double double44 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        java.lang.String str45 = pricingRequest37.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2982.99d + "'", double29 == 2982.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2375.99d + "'", double44 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str45, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType4, false, "", false, (int) (short) 10);
        boolean boolean15 = pricingRequest14.firstOrder();
        java.lang.Class<?> wildcardClass16 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        boolean boolean38 = pricingRequest33.firstOrder();
        boolean boolean39 = pricingRequest33.firstOrder();
        boolean boolean40 = pricingRequest33.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine11 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType14, true, "hi!", false, (int) (byte) 100);
        boolean boolean20 = pricingRequest19.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        double double22 = pricingEngine11.calculateFinalPrice(pricingRequest19);
        boolean boolean23 = pricingRequest19.firstOrder();
        int int24 = pricingRequest19.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest19.customerType();
        double double26 = pricingRequest19.basePrice();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) double26);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2375.99d + "'", double22 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        java.lang.String str38 = pricingRequest33.couponCode();
        double double39 = pricingRequest33.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        int int26 = pricingRequest20.quantity();
        java.lang.Class<?> wildcardClass27 = pricingRequest20.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        int int12 = pricingRequest8.loyaltyPoints();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        java.lang.Class<?> wildcardClass14 = pricingRequest8.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2375.99d + "'", double13 == 2375.99d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        double double51 = pricingRequest45.basePrice();
        java.lang.String str52 = pricingRequest45.couponCode();
        java.lang.Class<?> wildcardClass53 = pricingRequest45.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.couponCode();
        int int10 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        java.lang.String str12 = pricingRequest8.couponCode();
        int int13 = pricingRequest8.loyaltyPoints();
        boolean boolean14 = pricingRequest8.firstOrder();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        java.lang.Class<?> wildcardClass16 = pricingRequest8.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2375.99d + "'", double15 == 2375.99d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.loyaltyPoints();
        boolean boolean13 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.loyaltyPoints();
        boolean boolean13 = pricingRequest7.firstOrder();
        boolean boolean14 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 0, customerType11, false, "", true, 0);
        java.lang.String str17 = pricingRequest16.toString();
        java.lang.Class<?> wildcardClass18 = pricingRequest16.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str17, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest33.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2375.99d + "'", double36 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str8, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType4, false, "", false, (int) (short) 10);
        double double15 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType6, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType6, false, "", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType6, false, "", true, 1);
        boolean boolean22 = pricingRequest21.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.quantity();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str15, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (byte) -1, customerType2, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        double double51 = pricingRequest45.basePrice();
        int int52 = pricingRequest45.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str13, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType54, true, "hi!", false, (int) (byte) 100);
        boolean boolean60 = pricingRequest59.firstOrder();
        boolean boolean61 = pricingRequest59.firstOrder();
        java.lang.String str62 = pricingRequest59.couponCode();
        int int63 = pricingRequest59.loyaltyPoints();
        boolean boolean64 = pricingRequest59.firstOrder();
        double double65 = pricingRequest59.basePrice();
        boolean boolean66 = pricingRequest45.equals((java.lang.Object) pricingRequest59);
        boolean boolean67 = pricingRequest59.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 0, customerType11, false, "", true, 0);
        int int17 = pricingRequest16.loyaltyPoints();
        java.lang.String str18 = pricingRequest16.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        int int13 = pricingRequest8.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        double double15 = pricingRequest8.basePrice();
        boolean boolean16 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest8.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine pricingEngine37 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest45.customerType();
        double double48 = pricingEngine37.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType52, true, "hi!", false, (int) (byte) 100);
        boolean boolean58 = pricingRequest57.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest57.customerType();
        double double60 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        boolean boolean61 = pricingRequest57.firstOrder();
        double double62 = pricingEngine37.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType65, true, "hi!", false, (int) (byte) 100);
        boolean boolean71 = pricingRequest70.firstOrder();
        boolean boolean72 = pricingRequest70.firstOrder();
        java.lang.String str73 = pricingRequest70.couponCode();
        boolean boolean74 = pricingRequest70.firstOrder();
        java.lang.Object obj75 = null;
        boolean boolean76 = pricingRequest70.equals(obj75);
        boolean boolean77 = pricingRequest57.equals((java.lang.Object) boolean76);
        double double78 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest86 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType81, true, "hi!", false, (int) (byte) 100);
        boolean boolean87 = pricingRequest86.firstOrder();
        boolean boolean88 = pricingRequest86.firstOrder();
        java.lang.String str89 = pricingRequest86.couponCode();
        java.lang.String str90 = pricingRequest86.couponCode();
        boolean boolean91 = pricingRequest86.firstOrder();
        double double92 = pricingEngine0.calculateFinalPrice(pricingRequest86);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2375.99d + "'", double36 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2375.99d + "'", double48 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2375.99d + "'", double60 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2375.99d + "'", double62 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 2375.99d + "'", double78 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 2375.99d + "'", double92 == 2375.99d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        int int13 = pricingRequest8.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        double double15 = pricingRequest8.basePrice();
        boolean boolean16 = pricingRequest8.firstOrder();
        boolean boolean17 = pricingRequest8.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType54, true, "hi!", false, (int) (byte) 100);
        boolean boolean60 = pricingRequest59.firstOrder();
        boolean boolean61 = pricingRequest59.firstOrder();
        java.lang.String str62 = pricingRequest59.couponCode();
        int int63 = pricingRequest59.loyaltyPoints();
        boolean boolean64 = pricingRequest59.firstOrder();
        double double65 = pricingRequest59.basePrice();
        boolean boolean66 = pricingRequest45.equals((java.lang.Object) pricingRequest59);
        java.lang.Class<?> wildcardClass67 = pricingRequest59.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType11, false, "", true, (int) (byte) 10);
        int int17 = pricingRequest16.loyaltyPoints();
        boolean boolean19 = pricingRequest16.equals((java.lang.Object) 1.0d);
        java.lang.String str20 = pricingRequest16.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=100.0, quantity=35, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str20, "PricingRequest[basePrice=100.0, quantity=35, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        java.lang.String str12 = pricingRequest8.couponCode();
        int int13 = pricingRequest8.loyaltyPoints();
        boolean boolean14 = pricingRequest8.firstOrder();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType19, true, "hi!", false, (int) (byte) 100);
        boolean boolean25 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest24.customerType();
        double double27 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        com.viktor.lab4.PricingEngine pricingEngine28 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType31, true, "hi!", false, (int) (byte) 100);
        boolean boolean37 = pricingRequest36.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest36.customerType();
        double double39 = pricingEngine28.calculateFinalPrice(pricingRequest36);
        boolean boolean40 = pricingRequest36.firstOrder();
        double double41 = pricingEngine16.calculateFinalPrice(pricingRequest36);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType44, true, "hi!", false, (int) (byte) 100);
        boolean boolean50 = pricingRequest49.firstOrder();
        boolean boolean51 = pricingRequest49.firstOrder();
        boolean boolean52 = pricingRequest49.firstOrder();
        double double53 = pricingEngine16.calculateFinalPrice(pricingRequest49);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType56, true, "hi!", false, (int) (byte) 100);
        boolean boolean62 = pricingRequest61.firstOrder();
        boolean boolean63 = pricingRequest61.firstOrder();
        boolean boolean64 = pricingRequest61.firstOrder();
        int int65 = pricingRequest61.quantity();
        double double66 = pricingEngine16.calculateFinalPrice(pricingRequest61);
        double double67 = pricingRequest61.basePrice();
        java.lang.String str68 = pricingRequest61.couponCode();
        double double69 = pricingEngine0.calculateFinalPrice(pricingRequest61);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest61.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = pricingRequest61.customerType();
        java.lang.String str72 = pricingRequest61.toString();
        boolean boolean73 = pricingRequest61.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2375.99d + "'", double15 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2375.99d + "'", double27 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2375.99d + "'", double39 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2375.99d + "'", double41 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2375.99d + "'", double53 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 32 + "'", int65 == 32);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 2375.99d + "'", double66 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2375.99d + "'", double69 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str72, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType54, true, "hi!", false, (int) (byte) 100);
        boolean boolean60 = pricingRequest59.firstOrder();
        boolean boolean61 = pricingRequest59.firstOrder();
        java.lang.String str62 = pricingRequest59.couponCode();
        int int63 = pricingRequest59.loyaltyPoints();
        boolean boolean64 = pricingRequest59.firstOrder();
        double double65 = pricingRequest59.basePrice();
        boolean boolean66 = pricingRequest45.equals((java.lang.Object) pricingRequest59);
        java.lang.String str67 = pricingRequest45.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType54, true, "hi!", false, (int) (byte) 100);
        boolean boolean60 = pricingRequest59.firstOrder();
        boolean boolean61 = pricingRequest59.firstOrder();
        java.lang.String str62 = pricingRequest59.couponCode();
        int int63 = pricingRequest59.loyaltyPoints();
        boolean boolean64 = pricingRequest59.firstOrder();
        double double65 = pricingRequest59.basePrice();
        boolean boolean66 = pricingRequest45.equals((java.lang.Object) pricingRequest59);
        boolean boolean67 = pricingRequest45.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType54, true, "hi!", false, (int) (byte) 100);
        boolean boolean60 = pricingRequest59.firstOrder();
        boolean boolean61 = pricingRequest59.firstOrder();
        java.lang.String str62 = pricingRequest59.couponCode();
        int int63 = pricingRequest59.loyaltyPoints();
        boolean boolean64 = pricingRequest59.firstOrder();
        double double65 = pricingRequest59.basePrice();
        boolean boolean66 = pricingRequest45.equals((java.lang.Object) pricingRequest59);
        java.lang.String str67 = pricingRequest59.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str67, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        boolean boolean38 = pricingRequest33.firstOrder();
        int int39 = pricingRequest33.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        boolean boolean14 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.firstOrder();
        java.lang.String str16 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine17 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType20, true, "hi!", false, (int) (byte) 100);
        boolean boolean26 = pricingRequest25.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest25.customerType();
        double double28 = pricingEngine17.calculateFinalPrice(pricingRequest25);
        boolean boolean29 = pricingRequest25.firstOrder();
        int int30 = pricingRequest25.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest25.customerType();
        double double32 = pricingRequest25.basePrice();
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) pricingRequest25);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2375.99d + "'", double28 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType5, true, "hi!", false, (int) (byte) 100);
        boolean boolean11 = pricingRequest10.firstOrder();
        boolean boolean12 = pricingRequest10.firstOrder();
        java.lang.String str13 = pricingRequest10.couponCode();
        java.lang.String str14 = pricingRequest10.couponCode();
        int int15 = pricingRequest10.loyaltyPoints();
        boolean boolean16 = pricingRequest10.firstOrder();
        double double17 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine pricingEngine18 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType21, true, "hi!", false, (int) (byte) 100);
        boolean boolean27 = pricingRequest26.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest26.customerType();
        double double29 = pricingEngine18.calculateFinalPrice(pricingRequest26);
        com.viktor.lab4.PricingEngine pricingEngine30 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType33, true, "hi!", false, (int) (byte) 100);
        boolean boolean39 = pricingRequest38.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest38.customerType();
        double double41 = pricingEngine30.calculateFinalPrice(pricingRequest38);
        boolean boolean42 = pricingRequest38.firstOrder();
        double double43 = pricingEngine18.calculateFinalPrice(pricingRequest38);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType46, true, "hi!", false, (int) (byte) 100);
        boolean boolean52 = pricingRequest51.firstOrder();
        boolean boolean53 = pricingRequest51.firstOrder();
        boolean boolean54 = pricingRequest51.firstOrder();
        double double55 = pricingEngine18.calculateFinalPrice(pricingRequest51);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType58, true, "hi!", false, (int) (byte) 100);
        boolean boolean64 = pricingRequest63.firstOrder();
        boolean boolean65 = pricingRequest63.firstOrder();
        boolean boolean66 = pricingRequest63.firstOrder();
        int int67 = pricingRequest63.quantity();
        double double68 = pricingEngine18.calculateFinalPrice(pricingRequest63);
        double double69 = pricingRequest63.basePrice();
        java.lang.String str70 = pricingRequest63.couponCode();
        double double71 = pricingEngine2.calculateFinalPrice(pricingRequest63);
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = pricingRequest63.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 0, customerType72, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, 32);
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2375.99d + "'", double17 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2375.99d + "'", double29 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2375.99d + "'", double41 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2375.99d + "'", double43 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 2375.99d + "'", double55 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 2375.99d + "'", double68 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2375.99d + "'", double71 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 100, customerType2, false, "", true, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        java.lang.String str38 = pricingRequest33.couponCode();
        int int39 = pricingRequest33.quantity();
        boolean boolean40 = pricingRequest33.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        double double14 = pricingRequest7.basePrice();
        int int15 = pricingRequest7.quantity();
        boolean boolean16 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        double double51 = pricingRequest45.basePrice();
        java.lang.String str52 = pricingRequest45.couponCode();
        int int53 = pricingRequest45.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType8, true, "hi!", false, (int) (byte) 100);
        boolean boolean14 = pricingRequest13.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 0, customerType15, false, "", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) '#', customerType15, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) '4');
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine pricingEngine37 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest45.customerType();
        double double48 = pricingEngine37.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType52, true, "hi!", false, (int) (byte) 100);
        boolean boolean58 = pricingRequest57.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest57.customerType();
        double double60 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        boolean boolean61 = pricingRequest57.firstOrder();
        double double62 = pricingEngine37.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType65, true, "hi!", false, (int) (byte) 100);
        boolean boolean71 = pricingRequest70.firstOrder();
        boolean boolean72 = pricingRequest70.firstOrder();
        java.lang.String str73 = pricingRequest70.couponCode();
        boolean boolean74 = pricingRequest70.firstOrder();
        java.lang.Object obj75 = null;
        boolean boolean76 = pricingRequest70.equals(obj75);
        boolean boolean77 = pricingRequest57.equals((java.lang.Object) boolean76);
        double double78 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest86 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType81, true, "hi!", false, (int) (byte) 100);
        boolean boolean87 = pricingRequest86.firstOrder();
        boolean boolean88 = pricingRequest86.firstOrder();
        java.lang.String str89 = pricingRequest86.couponCode();
        int int90 = pricingRequest86.loyaltyPoints();
        boolean boolean91 = pricingRequest86.firstOrder();
        boolean boolean93 = pricingRequest86.equals((java.lang.Object) 'a');
        java.lang.String str94 = pricingRequest86.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType95 = pricingRequest86.customerType();
        double double96 = pricingEngine0.calculateFinalPrice(pricingRequest86);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2375.99d + "'", double36 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2375.99d + "'", double48 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2375.99d + "'", double60 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2375.99d + "'", double62 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 2375.99d + "'", double78 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 100 + "'", int90 == 100);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertTrue("'" + customerType95 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType95.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 2375.99d + "'", double96 == 2375.99d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str12, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType11, true, "", false, (-1));
        boolean boolean17 = pricingRequest16.seasonalSale();
        java.lang.Class<?> wildcardClass18 = pricingRequest16.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        java.lang.String str12 = pricingRequest8.couponCode();
        int int13 = pricingRequest8.loyaltyPoints();
        boolean boolean14 = pricingRequest8.firstOrder();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType19, true, "hi!", false, (int) (byte) 100);
        boolean boolean25 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest24.customerType();
        double double27 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        com.viktor.lab4.PricingEngine pricingEngine28 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType31, true, "hi!", false, (int) (byte) 100);
        boolean boolean37 = pricingRequest36.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest36.customerType();
        double double39 = pricingEngine28.calculateFinalPrice(pricingRequest36);
        boolean boolean40 = pricingRequest36.firstOrder();
        double double41 = pricingEngine16.calculateFinalPrice(pricingRequest36);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType44, true, "hi!", false, (int) (byte) 100);
        boolean boolean50 = pricingRequest49.firstOrder();
        boolean boolean51 = pricingRequest49.firstOrder();
        boolean boolean52 = pricingRequest49.firstOrder();
        double double53 = pricingEngine16.calculateFinalPrice(pricingRequest49);
        java.lang.Object obj54 = null;
        boolean boolean55 = pricingRequest49.equals(obj54);
        double double56 = pricingEngine0.calculateFinalPrice(pricingRequest49);
        java.lang.String str57 = pricingRequest49.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2375.99d + "'", double15 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2375.99d + "'", double27 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2375.99d + "'", double39 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2375.99d + "'", double41 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2375.99d + "'", double53 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2375.99d + "'", double56 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType5, true, "hi!", false, (int) (byte) 100);
        boolean boolean11 = pricingRequest10.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest10.customerType();
        double double13 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        boolean boolean14 = pricingRequest10.firstOrder();
        int int15 = pricingRequest10.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest10.customerType();
        double double17 = pricingRequest10.basePrice();
        boolean boolean18 = pricingRequest10.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType19, true, "hi!", false, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2375.99d + "'", double13 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        java.lang.String str12 = pricingRequest8.couponCode();
        int int13 = pricingRequest8.loyaltyPoints();
        boolean boolean14 = pricingRequest8.firstOrder();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType19, true, "hi!", false, (int) (byte) 100);
        boolean boolean25 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest24.customerType();
        double double27 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        com.viktor.lab4.PricingEngine pricingEngine28 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType31, true, "hi!", false, (int) (byte) 100);
        boolean boolean37 = pricingRequest36.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest36.customerType();
        double double39 = pricingEngine28.calculateFinalPrice(pricingRequest36);
        boolean boolean40 = pricingRequest36.firstOrder();
        double double41 = pricingEngine16.calculateFinalPrice(pricingRequest36);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType44, true, "hi!", false, (int) (byte) 100);
        boolean boolean50 = pricingRequest49.firstOrder();
        boolean boolean51 = pricingRequest49.firstOrder();
        boolean boolean52 = pricingRequest49.firstOrder();
        double double53 = pricingEngine16.calculateFinalPrice(pricingRequest49);
        java.lang.Object obj54 = null;
        boolean boolean55 = pricingRequest49.equals(obj54);
        double double56 = pricingEngine0.calculateFinalPrice(pricingRequest49);
        boolean boolean57 = pricingRequest49.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2375.99d + "'", double15 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2375.99d + "'", double27 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2375.99d + "'", double39 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2375.99d + "'", double41 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2375.99d + "'", double53 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2375.99d + "'", double56 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType8, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType8, false, "", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType8, false, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 10, customerType8, true, "", false, 10);
        java.lang.String str29 = pricingRequest28.couponCode();
        boolean boolean30 = pricingRequest28.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType11, false, "", true, (int) (byte) 10);
        boolean boolean17 = pricingRequest16.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) 'a');
        java.lang.String str15 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        int int17 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType16, true, "hi!", false, (int) (byte) 100);
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType23, false, "", true, (int) (byte) 10);
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest28.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2982.99d + "'", double29 == 2982.99d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        java.lang.String str12 = pricingRequest8.couponCode();
        int int13 = pricingRequest8.loyaltyPoints();
        boolean boolean14 = pricingRequest8.firstOrder();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType19, true, "hi!", false, (int) (byte) 100);
        boolean boolean25 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest24.customerType();
        double double27 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        com.viktor.lab4.PricingEngine pricingEngine28 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType31, true, "hi!", false, (int) (byte) 100);
        boolean boolean37 = pricingRequest36.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest36.customerType();
        double double39 = pricingEngine28.calculateFinalPrice(pricingRequest36);
        boolean boolean40 = pricingRequest36.firstOrder();
        double double41 = pricingEngine16.calculateFinalPrice(pricingRequest36);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType44, true, "hi!", false, (int) (byte) 100);
        boolean boolean50 = pricingRequest49.firstOrder();
        boolean boolean51 = pricingRequest49.firstOrder();
        boolean boolean52 = pricingRequest49.firstOrder();
        double double53 = pricingEngine16.calculateFinalPrice(pricingRequest49);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType56, true, "hi!", false, (int) (byte) 100);
        boolean boolean62 = pricingRequest61.firstOrder();
        boolean boolean63 = pricingRequest61.firstOrder();
        boolean boolean64 = pricingRequest61.firstOrder();
        int int65 = pricingRequest61.quantity();
        double double66 = pricingEngine16.calculateFinalPrice(pricingRequest61);
        double double67 = pricingRequest61.basePrice();
        java.lang.String str68 = pricingRequest61.couponCode();
        double double69 = pricingEngine0.calculateFinalPrice(pricingRequest61);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest61.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = pricingRequest61.customerType();
        java.lang.String str72 = pricingRequest61.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest61.customerType();
        double double74 = pricingRequest61.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2375.99d + "'", double15 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2375.99d + "'", double27 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2375.99d + "'", double39 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2375.99d + "'", double41 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2375.99d + "'", double53 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 32 + "'", int65 == 32);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 2375.99d + "'", double66 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2375.99d + "'", double69 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str72, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType73 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType73.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        java.lang.String str12 = pricingRequest8.couponCode();
        int int13 = pricingRequest8.loyaltyPoints();
        boolean boolean14 = pricingRequest8.firstOrder();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType19, true, "hi!", false, (int) (byte) 100);
        boolean boolean25 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest24.customerType();
        double double27 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        com.viktor.lab4.PricingEngine pricingEngine28 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType31, true, "hi!", false, (int) (byte) 100);
        boolean boolean37 = pricingRequest36.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest36.customerType();
        double double39 = pricingEngine28.calculateFinalPrice(pricingRequest36);
        boolean boolean40 = pricingRequest36.firstOrder();
        double double41 = pricingEngine16.calculateFinalPrice(pricingRequest36);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType44, true, "hi!", false, (int) (byte) 100);
        boolean boolean50 = pricingRequest49.firstOrder();
        boolean boolean51 = pricingRequest49.firstOrder();
        boolean boolean52 = pricingRequest49.firstOrder();
        double double53 = pricingEngine16.calculateFinalPrice(pricingRequest49);
        java.lang.String str54 = pricingRequest49.couponCode();
        int int55 = pricingRequest49.quantity();
        double double56 = pricingEngine0.calculateFinalPrice(pricingRequest49);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2375.99d + "'", double15 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2375.99d + "'", double27 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2375.99d + "'", double39 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2375.99d + "'", double41 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2375.99d + "'", double53 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2375.99d + "'", double56 == 2375.99d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        java.lang.String str12 = pricingRequest8.couponCode();
        int int13 = pricingRequest8.loyaltyPoints();
        boolean boolean14 = pricingRequest8.firstOrder();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType19, true, "hi!", false, (int) (byte) 100);
        boolean boolean25 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest24.customerType();
        double double27 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        com.viktor.lab4.PricingEngine pricingEngine28 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType31, true, "hi!", false, (int) (byte) 100);
        boolean boolean37 = pricingRequest36.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest36.customerType();
        double double39 = pricingEngine28.calculateFinalPrice(pricingRequest36);
        boolean boolean40 = pricingRequest36.firstOrder();
        double double41 = pricingEngine16.calculateFinalPrice(pricingRequest36);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType44, true, "hi!", false, (int) (byte) 100);
        boolean boolean50 = pricingRequest49.firstOrder();
        boolean boolean51 = pricingRequest49.firstOrder();
        boolean boolean52 = pricingRequest49.firstOrder();
        double double53 = pricingEngine16.calculateFinalPrice(pricingRequest49);
        java.lang.Object obj54 = null;
        boolean boolean55 = pricingRequest49.equals(obj54);
        double double56 = pricingEngine0.calculateFinalPrice(pricingRequest49);
        double double57 = pricingRequest49.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2375.99d + "'", double15 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2375.99d + "'", double27 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2375.99d + "'", double39 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2375.99d + "'", double41 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2375.99d + "'", double53 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2375.99d + "'", double56 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        boolean boolean13 = pricingRequest8.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        boolean boolean11 = pricingRequest9.firstOrder();
        java.lang.String str12 = pricingRequest9.couponCode();
        int int13 = pricingRequest9.loyaltyPoints();
        boolean boolean14 = pricingRequest9.firstOrder();
        boolean boolean16 = pricingRequest9.equals((java.lang.Object) 'a');
        java.lang.String str17 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType18, false, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", true, (int) ' ');
        java.lang.Class<?> wildcardClass24 = pricingRequest23.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 100, customerType2, false, "", true, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = customerType2.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        int int12 = pricingRequest8.loyaltyPoints();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        double double14 = pricingRequest8.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2375.99d + "'", double13 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.firstOrder();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType4, false, "", false, (int) (short) 10);
        java.lang.String str15 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine pricingEngine37 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest45.customerType();
        double double48 = pricingEngine37.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType52, true, "hi!", false, (int) (byte) 100);
        boolean boolean58 = pricingRequest57.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest57.customerType();
        double double60 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        boolean boolean61 = pricingRequest57.firstOrder();
        double double62 = pricingEngine37.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType65, true, "hi!", false, (int) (byte) 100);
        boolean boolean71 = pricingRequest70.firstOrder();
        boolean boolean72 = pricingRequest70.firstOrder();
        java.lang.String str73 = pricingRequest70.couponCode();
        boolean boolean74 = pricingRequest70.firstOrder();
        java.lang.Object obj75 = null;
        boolean boolean76 = pricingRequest70.equals(obj75);
        boolean boolean77 = pricingRequest57.equals((java.lang.Object) boolean76);
        double double78 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest86 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType81, true, "hi!", false, (int) (byte) 100);
        boolean boolean87 = pricingRequest86.firstOrder();
        boolean boolean88 = pricingRequest86.firstOrder();
        java.lang.String str89 = pricingRequest86.couponCode();
        boolean boolean90 = pricingRequest86.firstOrder();
        boolean boolean92 = pricingRequest86.equals((java.lang.Object) 100);
        java.lang.String str93 = pricingRequest86.couponCode();
        double double94 = pricingEngine0.calculateFinalPrice(pricingRequest86);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest95 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double96 = pricingEngine0.calculateFinalPrice(pricingRequest95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2375.99d + "'", double36 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2375.99d + "'", double48 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2375.99d + "'", double60 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2375.99d + "'", double62 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 2375.99d + "'", double78 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 2375.99d + "'", double94 == 2375.99d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.quantity();
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType16, true, "hi!", false, (int) (byte) 100);
        boolean boolean22 = pricingRequest21.firstOrder();
        boolean boolean23 = pricingRequest21.firstOrder();
        java.lang.String str24 = pricingRequest21.couponCode();
        int int25 = pricingRequest21.loyaltyPoints();
        boolean boolean26 = pricingRequest21.firstOrder();
        double double27 = pricingRequest21.basePrice();
        int int28 = pricingRequest21.quantity();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str13, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) '4', customerType2, true, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", false, 100);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType41, true, "hi!", false, (int) (byte) 100);
        boolean boolean47 = pricingRequest46.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest46.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType48, true, "", false, (-1));
        boolean boolean54 = pricingRequest33.equals((java.lang.Object) "");
        int int55 = pricingRequest33.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2375.99d + "'", double36 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType16, true, "hi!", false, (int) (byte) 100);
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType23, false, "", true, (int) (byte) 10);
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        boolean boolean31 = pricingRequest28.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2982.99d + "'", double29 == 2982.99d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        boolean boolean11 = pricingRequest9.firstOrder();
        boolean boolean12 = pricingRequest9.firstOrder();
        int int13 = pricingRequest9.quantity();
        java.lang.String str14 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 32, 10, customerType15, true, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType10, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType10, false, "", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType10, false, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 10, customerType10, true, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 10, customerType10, false, "", true, (int) (byte) 10);
        java.lang.String str36 = pricingRequest35.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str36, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType8, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType8, false, "", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType8, false, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 10, customerType8, true, "", false, 10);
        double double29 = pricingRequest28.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType4, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]", false, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType4, false, "", false, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 32, customerType2, false, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        java.lang.String str10 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        boolean boolean38 = pricingRequest33.firstOrder();
        boolean boolean39 = pricingRequest33.firstOrder();
        java.lang.String str40 = pricingRequest33.toString();
        boolean boolean41 = pricingRequest33.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str40, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        java.lang.String str48 = pricingRequest45.toString();
        java.lang.String str49 = pricingRequest45.couponCode();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        java.lang.Class<?> wildcardClass51 = pricingEngine0.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str48, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        int int26 = pricingRequest20.quantity();
        double double27 = pricingRequest20.basePrice();
        boolean boolean28 = pricingRequest20.firstOrder();
        boolean boolean29 = pricingRequest20.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 32, customerType4, false, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", false, (int) '#');
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        java.lang.String str38 = pricingRequest33.couponCode();
        int int39 = pricingRequest33.quantity();
        java.lang.Class<?> wildcardClass40 = pricingRequest33.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.quantity();
        boolean boolean15 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.couponCode();
        int int12 = pricingRequest8.loyaltyPoints();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        java.lang.String str14 = pricingRequest8.couponCode();
        int int15 = pricingRequest8.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2375.99d + "'", double13 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        boolean boolean11 = pricingRequest9.firstOrder();
        java.lang.String str12 = pricingRequest9.couponCode();
        int int13 = pricingRequest9.loyaltyPoints();
        boolean boolean14 = pricingRequest9.firstOrder();
        boolean boolean16 = pricingRequest9.equals((java.lang.Object) 'a');
        java.lang.String str17 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType18, false, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", true, (int) ' ');
        boolean boolean24 = pricingRequest23.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean13 = pricingRequest7.seasonalSale();
        double double14 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.loyaltyPoints();
        int int13 = pricingRequest7.quantity();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 0, customerType14, true, "", true, 1);
        double double20 = pricingRequest19.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = pricingEngine0.calculateFinalPrice(pricingRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        int int13 = pricingRequest8.loyaltyPoints();
        java.lang.Object obj14 = null;
        boolean boolean15 = pricingRequest8.equals(obj14);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine pricingEngine37 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest45.customerType();
        double double48 = pricingEngine37.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType52, true, "hi!", false, (int) (byte) 100);
        boolean boolean58 = pricingRequest57.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest57.customerType();
        double double60 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        boolean boolean61 = pricingRequest57.firstOrder();
        double double62 = pricingEngine37.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType65, true, "hi!", false, (int) (byte) 100);
        boolean boolean71 = pricingRequest70.firstOrder();
        boolean boolean72 = pricingRequest70.firstOrder();
        java.lang.String str73 = pricingRequest70.couponCode();
        boolean boolean74 = pricingRequest70.firstOrder();
        java.lang.Object obj75 = null;
        boolean boolean76 = pricingRequest70.equals(obj75);
        boolean boolean77 = pricingRequest57.equals((java.lang.Object) boolean76);
        double double78 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        boolean boolean79 = pricingRequest57.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2375.99d + "'", double36 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2375.99d + "'", double48 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2375.99d + "'", double60 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2375.99d + "'", double62 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 2375.99d + "'", double78 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.quantity();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str13, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        java.lang.String str48 = pricingRequest45.couponCode();
        int int49 = pricingRequest45.loyaltyPoints();
        boolean boolean50 = pricingRequest45.firstOrder();
        boolean boolean52 = pricingRequest45.equals((java.lang.Object) 'a');
        java.lang.String str53 = pricingRequest45.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest45.customerType();
        double double55 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 2375.99d + "'", double55 == 2375.99d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 32, customerType2, false, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingRequest8.basePrice();
        double double14 = pricingRequest8.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        boolean boolean14 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.firstOrder();
        boolean boolean16 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType6, true, "hi!", false, (int) (byte) 100);
        boolean boolean12 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 0, customerType13, false, "", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 100, customerType13, false, "", true, (int) (short) -1);
        int int24 = pricingRequest23.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        int int26 = pricingRequest20.quantity();
        boolean boolean27 = pricingRequest20.firstOrder();
        java.lang.String str28 = pricingRequest20.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest20.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        double double51 = pricingRequest45.basePrice();
        boolean boolean52 = pricingRequest45.seasonalSale();
        int int53 = pricingRequest45.quantity();
        java.lang.String str54 = pricingRequest45.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType41, true, "hi!", false, (int) (byte) 100);
        boolean boolean47 = pricingRequest46.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest46.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType48, true, "", false, (-1));
        boolean boolean54 = pricingRequest33.equals((java.lang.Object) "");
        java.lang.String str55 = pricingRequest33.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2375.99d + "'", double36 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        int int49 = pricingRequest45.quantity();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType54, true, "hi!", false, (int) (byte) 100);
        boolean boolean60 = pricingRequest59.firstOrder();
        boolean boolean61 = pricingRequest59.firstOrder();
        java.lang.String str62 = pricingRequest59.couponCode();
        int int63 = pricingRequest59.loyaltyPoints();
        boolean boolean64 = pricingRequest59.firstOrder();
        double double65 = pricingRequest59.basePrice();
        boolean boolean66 = pricingRequest45.equals((java.lang.Object) pricingRequest59);
        double double67 = pricingRequest59.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2375.99d + "'", double50 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType16, true, "hi!", false, (int) (byte) 100);
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType23, false, "", true, (int) (byte) 10);
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType32, true, "hi!", false, (int) (byte) 100);
        boolean boolean38 = pricingRequest37.firstOrder();
        boolean boolean39 = pricingRequest37.firstOrder();
        java.lang.String str40 = pricingRequest37.couponCode();
        java.lang.String str41 = pricingRequest37.couponCode();
        int int42 = pricingRequest37.quantity();
        int int43 = pricingRequest37.quantity();
        double double44 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        boolean boolean45 = pricingRequest37.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2982.99d + "'", double29 == 2982.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2375.99d + "'", double44 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType14, true, "hi!", false, (int) (byte) 100);
        boolean boolean20 = pricingRequest19.firstOrder();
        boolean boolean21 = pricingRequest19.firstOrder();
        java.lang.String str22 = pricingRequest19.couponCode();
        boolean boolean23 = pricingRequest19.firstOrder();
        java.lang.Object obj24 = null;
        boolean boolean25 = pricingRequest19.equals(obj24);
        boolean boolean26 = pricingRequest19.firstOrder();
        boolean boolean27 = pricingRequest19.firstOrder();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str29 = pricingRequest19.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str29, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        java.lang.String str38 = pricingRequest33.couponCode();
        boolean boolean39 = pricingRequest33.seasonalSale();
        double double40 = pricingRequest33.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        int int13 = pricingRequest8.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        int int15 = pricingRequest8.quantity();
        boolean boolean16 = pricingRequest8.firstOrder();
        java.lang.String str17 = pricingRequest8.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.firstOrder();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine pricingEngine24 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType27, true, "hi!", false, (int) (byte) 100);
        boolean boolean33 = pricingRequest32.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest32.customerType();
        double double35 = pricingEngine24.calculateFinalPrice(pricingRequest32);
        boolean boolean36 = pricingRequest32.firstOrder();
        double double37 = pricingEngine12.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        double double49 = pricingEngine12.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType52, true, "hi!", false, (int) (byte) 100);
        boolean boolean58 = pricingRequest57.firstOrder();
        boolean boolean59 = pricingRequest57.firstOrder();
        boolean boolean60 = pricingRequest57.firstOrder();
        int int61 = pricingRequest57.quantity();
        double double62 = pricingEngine12.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest57.customerType();
        double double64 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2375.99d + "'", double35 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2375.99d + "'", double49 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2375.99d + "'", double62 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2375.99d + "'", double64 == 2375.99d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType28, true, "hi!", false, (int) (byte) 100);
        boolean boolean34 = pricingRequest33.firstOrder();
        boolean boolean35 = pricingRequest33.firstOrder();
        boolean boolean36 = pricingRequest33.firstOrder();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        java.lang.Object obj38 = null;
        boolean boolean39 = pricingRequest33.equals(obj38);
        int int40 = pricingRequest33.loyaltyPoints();
        int int41 = pricingRequest33.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        int int26 = pricingRequest20.quantity();
        boolean boolean27 = pricingRequest20.firstOrder();
        java.lang.String str28 = pricingRequest20.couponCode();
        int int29 = pricingRequest20.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        int int26 = pricingRequest20.quantity();
        int int27 = pricingRequest20.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2375.99d + "'", double25 == 2375.99d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean12 = pricingRequest8.firstOrder();
        int int13 = pricingRequest8.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        int int15 = pricingRequest8.quantity();
        java.lang.String str16 = pricingRequest8.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType5, true, "hi!", false, (int) (byte) 100);
        boolean boolean11 = pricingRequest10.firstOrder();
        boolean boolean12 = pricingRequest10.firstOrder();
        java.lang.String str13 = pricingRequest10.couponCode();
        java.lang.String str14 = pricingRequest10.couponCode();
        int int15 = pricingRequest10.loyaltyPoints();
        boolean boolean16 = pricingRequest10.firstOrder();
        double double17 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine pricingEngine18 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType21, true, "hi!", false, (int) (byte) 100);
        boolean boolean27 = pricingRequest26.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest26.customerType();
        double double29 = pricingEngine18.calculateFinalPrice(pricingRequest26);
        com.viktor.lab4.PricingEngine pricingEngine30 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType33, true, "hi!", false, (int) (byte) 100);
        boolean boolean39 = pricingRequest38.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest38.customerType();
        double double41 = pricingEngine30.calculateFinalPrice(pricingRequest38);
        boolean boolean42 = pricingRequest38.firstOrder();
        double double43 = pricingEngine18.calculateFinalPrice(pricingRequest38);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType46, true, "hi!", false, (int) (byte) 100);
        boolean boolean52 = pricingRequest51.firstOrder();
        boolean boolean53 = pricingRequest51.firstOrder();
        boolean boolean54 = pricingRequest51.firstOrder();
        double double55 = pricingEngine18.calculateFinalPrice(pricingRequest51);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType58, true, "hi!", false, (int) (byte) 100);
        boolean boolean64 = pricingRequest63.firstOrder();
        boolean boolean65 = pricingRequest63.firstOrder();
        boolean boolean66 = pricingRequest63.firstOrder();
        int int67 = pricingRequest63.quantity();
        double double68 = pricingEngine18.calculateFinalPrice(pricingRequest63);
        double double69 = pricingRequest63.basePrice();
        java.lang.String str70 = pricingRequest63.couponCode();
        double double71 = pricingEngine2.calculateFinalPrice(pricingRequest63);
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = pricingRequest63.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest63.customerType();
        java.lang.String str74 = pricingRequest63.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = pricingRequest63.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (-1), customerType75, false, "", false, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2375.99d + "'", double17 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2375.99d + "'", double29 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2375.99d + "'", double41 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2375.99d + "'", double43 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 2375.99d + "'", double55 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 2375.99d + "'", double68 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2375.99d + "'", double71 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType73 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType73.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str74, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType11, true, "", false, (-1));
        java.lang.String str17 = pricingRequest16.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        boolean boolean11 = pricingRequest9.firstOrder();
        java.lang.String str12 = pricingRequest9.couponCode();
        int int13 = pricingRequest9.loyaltyPoints();
        boolean boolean14 = pricingRequest9.firstOrder();
        boolean boolean16 = pricingRequest9.equals((java.lang.Object) 'a');
        java.lang.String str17 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType18, false, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", true, (int) ' ');
        int int24 = pricingRequest23.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType11, true, "", false, (-1));
        boolean boolean18 = pricingRequest16.equals((java.lang.Object) (byte) 100);
        boolean boolean19 = pricingRequest16.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType6, true, "hi!", false, (int) (byte) 100);
        boolean boolean12 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 0, customerType13, false, "", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(2982.99d, (int) (byte) 0, customerType13, false, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", true, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 32, customerType2, false, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType3, true, "hi!", false, (int) (byte) 100);
        boolean boolean9 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType15, true, "hi!", false, (int) (byte) 100);
        boolean boolean21 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine pricingEngine24 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType27, true, "hi!", false, (int) (byte) 100);
        boolean boolean33 = pricingRequest32.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest32.customerType();
        double double35 = pricingEngine24.calculateFinalPrice(pricingRequest32);
        boolean boolean36 = pricingRequest32.firstOrder();
        double double37 = pricingEngine12.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType40, true, "hi!", false, (int) (byte) 100);
        boolean boolean46 = pricingRequest45.firstOrder();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        double double49 = pricingEngine12.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType52, true, "hi!", false, (int) (byte) 100);
        boolean boolean58 = pricingRequest57.firstOrder();
        boolean boolean59 = pricingRequest57.firstOrder();
        boolean boolean60 = pricingRequest57.firstOrder();
        int int61 = pricingRequest57.quantity();
        double double62 = pricingEngine12.calculateFinalPrice(pricingRequest57);
        double double63 = pricingRequest57.basePrice();
        java.lang.String str64 = pricingRequest57.couponCode();
        double double65 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        java.lang.String str66 = pricingRequest57.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2375.99d + "'", double11 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2375.99d + "'", double23 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2375.99d + "'", double35 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2375.99d + "'", double37 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2375.99d + "'", double49 == 2375.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2375.99d + "'", double62 == 2375.99d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2375.99d + "'", double65 == 2375.99d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 0, customerType2, true, "", true, 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType10, true, "hi!", false, (int) (byte) 100);
        boolean boolean16 = pricingRequest15.firstOrder();
        boolean boolean17 = pricingRequest15.firstOrder();
        boolean boolean18 = pricingRequest15.firstOrder();
        int int19 = pricingRequest15.quantity();
        double double20 = pricingRequest15.basePrice();
        java.lang.Class<?> wildcardClass21 = pricingRequest15.getClass();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType20, true, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType20, false, "", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) -1, customerType20, false, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 10, customerType20, true, "", false, 10);
        java.lang.String str41 = pricingRequest40.couponCode();
        boolean boolean42 = pricingRequest7.equals((java.lang.Object) pricingRequest40);
        boolean boolean43 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        double double14 = pricingRequest7.basePrice();
        int int15 = pricingRequest7.quantity();
        int int16 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType19, true, "hi!", false, (int) (byte) 100);
        boolean boolean25 = pricingRequest24.firstOrder();
        boolean boolean26 = pricingRequest24.firstOrder();
        java.lang.String str27 = pricingRequest24.couponCode();
        int int28 = pricingRequest24.loyaltyPoints();
        boolean boolean29 = pricingRequest24.firstOrder();
        double double30 = pricingRequest24.basePrice();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) double30);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType4, true, "hi!", false, (int) (byte) 100);
        boolean boolean10 = pricingRequest9.firstOrder();
        boolean boolean11 = pricingRequest9.firstOrder();
        java.lang.String str12 = pricingRequest9.couponCode();
        int int13 = pricingRequest9.loyaltyPoints();
        double double14 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType15, true, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", true, 1);
        java.lang.String str21 = pricingRequest20.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=1]" + "'", str21, "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=1]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType2, true, "hi!", false, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 100);
        java.lang.String str14 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine15 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType18, true, "hi!", false, (int) (byte) 100);
        boolean boolean24 = pricingRequest23.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        double double26 = pricingEngine15.calculateFinalPrice(pricingRequest23);
        boolean boolean27 = pricingRequest23.firstOrder();
        double double28 = pricingRequest23.basePrice();
        int int29 = pricingRequest23.quantity();
        java.lang.String str30 = pricingRequest23.toString();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) pricingRequest23);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2375.99d + "'", double26 == 2375.99d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str30, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }
}

