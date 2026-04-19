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
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        java.lang.Class<?> wildcardClass1 = pricingEngine0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = customerType10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = pricingRequest7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        double double10 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(customerType11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType3, false, "", false, (int) ' ');
        int int9 = pricingRequest8.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass9 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        java.lang.Class<?> wildcardClass15 = customerType4.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        int int12 = pricingRequest8.loyaltyPoints();
        java.lang.String str13 = pricingRequest8.couponCode();
        boolean boolean15 = pricingRequest8.equals((java.lang.Object) '4');
        double double16 = pricingRequest8.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass9 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 10, customerType2, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) '4');
        java.lang.Class<?> wildcardClass8 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        java.lang.String str15 = pricingRequest14.couponCode();
        java.lang.Class<?> wildcardClass16 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str15, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNull(customerType12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType3, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int9 = pricingRequest8.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.couponCode();
        int int10 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.toString();
        double double12 = pricingRequest8.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType3, false, "", false, (int) ' ');
        java.lang.String str9 = pricingRequest8.toString();
        java.lang.String str10 = pricingRequest8.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str10, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.toString();
        int int12 = pricingRequest8.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType5, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType5, false, "", true, (int) '4');
        java.lang.String str16 = pricingRequest15.couponCode();
        boolean boolean17 = pricingRequest15.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = pricingEngine0.calculateFinalPrice(pricingRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        java.lang.Class<?> wildcardClass29 = pricingRequest28.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        java.lang.String str8 = pricingRequest7.toString();
        int int9 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str8, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        int int12 = pricingRequest8.loyaltyPoints();
        java.lang.String str13 = pricingRequest8.couponCode();
        boolean boolean15 = pricingRequest8.equals((java.lang.Object) '4');
        double double16 = pricingRequest8.basePrice();
        java.lang.String str17 = pricingRequest8.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 32, 1, customerType6, false, "hi!", true, 1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (-1.0f));
        int int10 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        java.lang.String str18 = pricingRequest14.couponCode();
        int int19 = pricingRequest14.loyaltyPoints();
        boolean boolean20 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str17, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str18, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) 'a', customerType11, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) '4');
        java.lang.String str17 = pricingRequest16.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType7, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType7, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType7, false, "hi!", false, (int) '#');
        java.lang.String str23 = pricingRequest22.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = pricingEngine0.calculateFinalPrice(pricingRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str23, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingRequest8.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str12, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType7, false, "", false, 10);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType6, false, "", false, (int) (byte) 0);
        double double22 = pricingRequest21.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 32.0d + "'", double22 == 32.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        java.lang.Class<?> wildcardClass23 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType26, false, "", false, (int) ' ');
        boolean boolean32 = pricingRequest31.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        boolean boolean17 = pricingRequest14.seasonalSale();
        int int18 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        double double29 = pricingRequest28.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        double double34 = pricingRequest31.basePrice();
        double double35 = pricingRequest31.basePrice();
        java.lang.String str36 = pricingRequest31.toString();
        int int37 = pricingRequest31.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double38 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str36, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        java.lang.String str23 = pricingRequest21.couponCode();
        java.lang.String str24 = pricingRequest21.couponCode();
        boolean boolean25 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 0, customerType8, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = customerType8.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) 'a', customerType2, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        double double15 = pricingRequest7.basePrice();
        boolean boolean16 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(customerType17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.firstOrder();
        java.lang.String str17 = pricingRequest14.toString();
        java.lang.String str18 = pricingRequest14.couponCode();
        int int19 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str18, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType7, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType7, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType7, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double23 = pricingRequest22.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest22.customerType();
        java.lang.String str25 = pricingRequest22.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = pricingEngine0.calculateFinalPrice(pricingRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType6, false, "", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType14, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int20 = pricingRequest19.quantity();
        java.lang.String str21 = pricingRequest19.couponCode();
        boolean boolean22 = pricingRequest19.firstOrder();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str24 = pricingRequest7.toString();
        double double25 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        java.lang.String str18 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str17, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.couponCode();
        int int10 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        java.lang.String str23 = pricingRequest21.couponCode();
        java.lang.String str24 = pricingRequest21.couponCode();
        int int25 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType16, false, "hi!", true, (int) (byte) 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean23 = pricingRequest21.firstOrder();
        java.lang.String str24 = pricingRequest21.toString();
        double double25 = pricingRequest21.basePrice();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        int int27 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.firstOrder();
        java.lang.String str17 = pricingRequest14.toString();
        boolean boolean18 = pricingRequest14.firstOrder();
        int int19 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        java.lang.String str22 = pricingRequest21.toString();
        java.lang.String str23 = pricingRequest21.toString();
        java.lang.Class<?> wildcardClass24 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str22, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str23, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType6, false, "", false, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = customerType6.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.firstOrder();
        java.lang.String str17 = pricingRequest14.toString();
        java.lang.String str18 = pricingRequest14.couponCode();
        java.lang.String str19 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str18, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str19, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType5, false, "", false, (int) ' ');
        double double11 = pricingRequest10.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType12, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType24, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType24, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType24, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass40 = customerType24.getClass();
        boolean boolean41 = pricingRequest17.equals((java.lang.Object) customerType24);
        // The following exception was thrown during execution in test generation
        try {
            double double42 = pricingEngine0.calculateFinalPrice(pricingRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        java.lang.String str29 = pricingRequest28.toString();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=0]" + "'", str29, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 10, customerType28, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 100, customerType28, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double39 = pricingEngine0.calculateFinalPrice(pricingRequest38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType14, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int20 = pricingRequest19.quantity();
        java.lang.String str21 = pricingRequest19.couponCode();
        boolean boolean22 = pricingRequest19.firstOrder();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str24 = pricingRequest19.couponCode();
        int int25 = pricingRequest19.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest19.customerType();
        java.lang.String str27 = pricingRequest19.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str24, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str27, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType2, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType21, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType21, false, "", true, (int) '4');
        java.lang.String str32 = pricingRequest31.couponCode();
        boolean boolean33 = pricingRequest14.equals((java.lang.Object) pricingRequest31);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (short) 10, customerType10, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType42, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType42, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType42, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean58 = pricingRequest35.equals((java.lang.Object) "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        java.lang.Class<?> wildcardClass59 = pricingRequest35.getClass();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType3, false, "", false, (int) ' ');
        double double9 = pricingRequest8.basePrice();
        int int10 = pricingRequest8.quantity();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) 97.0d);
        int int15 = pricingRequest7.quantity();
        boolean boolean16 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType23, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType23, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType23, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        boolean boolean39 = pricingRequest7.equals((java.lang.Object) (-1.0f));
        int int40 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        boolean boolean11 = pricingRequest9.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 100, customerType12, false, "", false, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = customerType12.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType8, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 0, customerType8, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        java.lang.String str14 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean23 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType14, false, "", false, (int) ' ');
        boolean boolean20 = pricingRequest7.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(customerType21);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        boolean boolean15 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingRequest21.basePrice();
        java.lang.String str24 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str24, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (short) 10, customerType10, false, "", true, (int) (byte) -1);
        int int36 = pricingRequest35.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType8, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 0, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType31, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        boolean boolean37 = pricingRequest28.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) 0, customerType6, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=0]", false, (int) '#');
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        boolean boolean8 = pricingRequest7.firstOrder();
        java.lang.String str9 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.quantity();
        int int16 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (short) 0, customerType14, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 100);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) 'a', customerType11, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) '4');
        boolean boolean17 = pricingRequest16.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType20, false, "hi!", true, (int) (byte) 0);
        boolean boolean26 = pricingRequest25.seasonalSale();
        boolean boolean27 = pricingRequest25.firstOrder();
        java.lang.String str28 = pricingRequest25.toString();
        int int29 = pricingRequest25.quantity();
        int int30 = pricingRequest25.quantity();
        boolean boolean31 = pricingRequest25.seasonalSale();
        java.lang.String str32 = pricingRequest25.toString();
        int int33 = pricingRequest25.quantity();
        boolean boolean34 = pricingRequest16.equals((java.lang.Object) int33);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str32, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 10, customerType2, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) '4');
        int int8 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.toString();
        int int12 = pricingRequest8.quantity();
        java.lang.String str13 = pricingRequest8.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType11, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        int int18 = pricingRequest16.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 0, customerType8, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = pricingRequest28.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        double double9 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.firstOrder();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        java.lang.String str22 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str22, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.toString();
        int int12 = pricingRequest8.quantity();
        int int13 = pricingRequest8.quantity();
        boolean boolean14 = pricingRequest8.seasonalSale();
        java.lang.String str15 = pricingRequest8.toString();
        int int16 = pricingRequest8.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) 'a', customerType11, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) '4');
        int int17 = pricingRequest16.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (short) 10, customerType10, false, "", true, (int) (byte) -1);
        int int36 = pricingRequest35.quantity();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean10 = pricingRequest8.firstOrder();
        java.lang.String str11 = pricingRequest8.toString();
        double double12 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType15, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int21 = pricingRequest20.quantity();
        java.lang.String str22 = pricingRequest20.couponCode();
        boolean boolean23 = pricingRequest20.firstOrder();
        boolean boolean24 = pricingRequest8.equals((java.lang.Object) pricingRequest20);
        java.lang.String str25 = pricingRequest20.couponCode();
        int int26 = pricingRequest20.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType29, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        boolean boolean35 = pricingRequest20.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double36 = pricingEngine0.calculateFinalPrice(pricingRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str22, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str25, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType16, false, "hi!", true, (int) (byte) 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        int int23 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest21.customerType();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        boolean boolean26 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        java.lang.String str22 = pricingRequest21.toString();
        java.lang.String str23 = pricingRequest21.toString();
        java.lang.String str24 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str22, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str23, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str24, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) '#', customerType10, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) ' ');
        java.lang.String str36 = pricingRequest35.couponCode();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str36, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.toString();
        boolean boolean18 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        java.lang.String str23 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) customerType13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNull(customerType14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType5, false, "", false, (int) ' ');
        boolean boolean12 = pricingRequest10.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 100, customerType13, false, "", false, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = pricingEngine0.calculateFinalPrice(pricingRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType8, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 0, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 10);
        boolean boolean29 = pricingRequest28.firstOrder();
        double double30 = pricingRequest28.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        boolean boolean13 = pricingRequest11.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 100, customerType14, false, "", false, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (byte) 10, customerType14, false, "", true, 32);
        int int25 = pricingRequest24.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType3, false, "", false, (int) ' ');
        java.lang.String str9 = pricingRequest8.toString();
        java.lang.String str10 = pricingRequest8.toString();
        java.lang.String str11 = pricingRequest8.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str10, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str11, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        int int16 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType8, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType8, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType8, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        int int29 = pricingRequest28.quantity();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType22, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType22, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType22, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 0, customerType22, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType51, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType51, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType51, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest71 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType51, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        boolean boolean73 = pricingRequest71.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass74 = pricingRequest71.getClass();
        boolean boolean75 = pricingRequest42.equals((java.lang.Object) pricingRequest71);
        boolean boolean76 = pricingRequest7.equals((java.lang.Object) pricingRequest71);
        java.lang.String str77 = pricingRequest71.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=0]" + "'", str77, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        int int12 = pricingRequest8.loyaltyPoints();
        java.lang.String str13 = pricingRequest8.couponCode();
        int int14 = pricingRequest8.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean33 = pricingRequest31.equals((java.lang.Object) (short) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        java.lang.String str35 = pricingRequest31.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double36 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str35, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.firstOrder();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) '4');
        double double15 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType18, false, "", false, (int) ' ');
        double double24 = pricingRequest23.basePrice();
        boolean boolean25 = pricingRequest23.seasonalSale();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType8, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 0, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType37, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType37, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType37, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType37, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        boolean boolean59 = pricingRequest57.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass60 = pricingRequest57.getClass();
        boolean boolean61 = pricingRequest28.equals((java.lang.Object) pricingRequest57);
        boolean boolean62 = pricingRequest57.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 1, customerType13, true, "", true, (int) '#');
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (short) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        java.lang.String str18 = pricingRequest14.couponCode();
        int int19 = pricingRequest14.quantity();
        java.lang.String str20 = pricingRequest14.toString();
        int int21 = pricingRequest14.loyaltyPoints();
        java.lang.Class<?> wildcardClass22 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str17, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str18, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (byte) 0, customerType2, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 52);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType17, false, "", false, (int) ' ');
        double double23 = pricingRequest22.basePrice();
        int int24 = pricingRequest22.quantity();
        boolean boolean25 = pricingRequest22.firstOrder();
        java.lang.String str26 = pricingRequest22.toString();
        boolean boolean27 = pricingRequest14.equals((java.lang.Object) pricingRequest22);
        boolean boolean28 = pricingRequest22.seasonalSale();
        java.lang.String str29 = pricingRequest22.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str26, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str12, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType16, false, "hi!", true, (int) (byte) 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean23 = pricingRequest21.firstOrder();
        java.lang.String str24 = pricingRequest21.toString();
        double double25 = pricingRequest21.basePrice();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        boolean boolean27 = pricingRequest21.seasonalSale();
        int int28 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        boolean boolean30 = pricingRequest28.equals((java.lang.Object) 100.0f);
        double double31 = pricingRequest28.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType12, false, "", false, (int) ' ');
        double double18 = pricingRequest17.basePrice();
        java.lang.String str19 = pricingRequest17.couponCode();
        boolean boolean20 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest17.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest17.customerType();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        java.lang.String str24 = pricingRequest17.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str24, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType10, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType10, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 52, 100, customerType10, true, "", true, 1);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (short) 10, customerType10, false, "", true, (int) (byte) -1);
        java.lang.Class<?> wildcardClass36 = pricingRequest35.getClass();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        boolean boolean16 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 10, customerType4, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 100, customerType4, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) '4');
        boolean boolean15 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.firstOrder();
        boolean boolean24 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        java.lang.String str8 = pricingRequest7.toString();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str8, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) '4');
        double double15 = pricingRequest7.basePrice();
        double double16 = pricingRequest7.basePrice();
        java.lang.String str17 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean33 = pricingRequest31.equals((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double34 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        java.lang.String str8 = pricingRequest7.toString();
        int int9 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str8, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType3, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest8.customerType();
        java.lang.String str10 = pricingRequest8.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        boolean boolean12 = pricingRequest8.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 100, customerType8, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", false, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(customerType14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.firstOrder();
        int int15 = pricingRequest7.quantity();
        java.lang.String str16 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType12, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        java.lang.String str18 = pricingRequest17.toString();
        java.lang.String str19 = pricingRequest17.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest17.customerType();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) customerType20);
        boolean boolean22 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType26, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest31.customerType();
        java.lang.String str33 = pricingRequest31.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        java.lang.Object obj35 = null;
        boolean boolean36 = pricingRequest31.equals(obj35);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest31.customerType();
        boolean boolean38 = pricingRequest31.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double39 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertNull(customerType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str33, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(customerType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType11, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType23, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType23, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType23, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass39 = customerType23.getClass();
        boolean boolean40 = pricingRequest16.equals((java.lang.Object) customerType23);
        int int41 = pricingRequest16.loyaltyPoints();
        double double42 = pricingRequest16.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        java.lang.Class<?> wildcardClass8 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        int int35 = pricingRequest31.loyaltyPoints();
        java.lang.String str36 = pricingRequest31.couponCode();
        boolean boolean38 = pricingRequest31.equals((java.lang.Object) '4');
        double double39 = pricingRequest31.basePrice();
        boolean boolean40 = pricingRequest21.equals((java.lang.Object) pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest31.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(customerType41);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.Object obj13 = null;
        boolean boolean14 = pricingRequest7.equals(obj13);
        java.lang.String str15 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 10, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 100);
        boolean boolean22 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.firstOrder();
        java.lang.String str17 = pricingRequest14.toString();
        boolean boolean18 = pricingRequest14.firstOrder();
        java.lang.String str19 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str19, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType14, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int20 = pricingRequest19.quantity();
        java.lang.String str21 = pricingRequest19.couponCode();
        boolean boolean22 = pricingRequest19.firstOrder();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str24 = pricingRequest19.couponCode();
        int int25 = pricingRequest19.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType29, false, "hi!", true, (int) (byte) 0);
        boolean boolean35 = pricingRequest34.seasonalSale();
        int int36 = pricingRequest34.quantity();
        int int37 = pricingRequest34.quantity();
        boolean boolean38 = pricingRequest34.seasonalSale();
        boolean boolean39 = pricingRequest34.firstOrder();
        java.lang.String str40 = pricingRequest34.toString();
        boolean boolean41 = pricingRequest19.equals((java.lang.Object) str40);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str24, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str40, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.firstOrder();
        java.lang.String str23 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str23, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType6, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        java.lang.String str22 = pricingRequest21.couponCode();
        int int23 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType17, false, "hi!", true, (int) (byte) 0);
        boolean boolean23 = pricingRequest22.seasonalSale();
        boolean boolean24 = pricingRequest22.firstOrder();
        java.lang.String str25 = pricingRequest22.toString();
        double double26 = pricingRequest22.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType29, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int35 = pricingRequest34.quantity();
        java.lang.String str36 = pricingRequest34.couponCode();
        boolean boolean37 = pricingRequest34.firstOrder();
        boolean boolean38 = pricingRequest22.equals((java.lang.Object) pricingRequest34);
        java.lang.String str39 = pricingRequest34.couponCode();
        int int40 = pricingRequest34.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType43, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        boolean boolean49 = pricingRequest34.equals((java.lang.Object) (-1));
        boolean boolean50 = pricingRequest34.seasonalSale();
        java.lang.Class<?> wildcardClass51 = pricingRequest34.getClass();
        boolean boolean52 = pricingRequest7.equals((java.lang.Object) pricingRequest34);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str36, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str39, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType11, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType23, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType23, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType23, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass39 = customerType23.getClass();
        boolean boolean40 = pricingRequest16.equals((java.lang.Object) customerType23);
        boolean boolean41 = pricingRequest16.seasonalSale();
        java.lang.String str42 = pricingRequest16.couponCode();
        int int43 = pricingRequest16.quantity();
        boolean boolean44 = pricingRequest16.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str42, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType26, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        boolean boolean33 = pricingRequest31.equals((java.lang.Object) (-1));
        int int34 = pricingRequest31.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.toString();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) '4');
        double double15 = pricingRequest7.basePrice();
        java.lang.String str16 = pricingRequest7.toString();
        double double17 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType16, false, "hi!", true, (int) (byte) 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean23 = pricingRequest21.firstOrder();
        java.lang.String str24 = pricingRequest21.toString();
        double double25 = pricingRequest21.basePrice();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        boolean boolean27 = pricingRequest21.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType11, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType23, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType23, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType23, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass39 = customerType23.getClass();
        boolean boolean40 = pricingRequest16.equals((java.lang.Object) customerType23);
        boolean boolean41 = pricingRequest16.seasonalSale();
        java.lang.String str42 = pricingRequest16.couponCode();
        boolean boolean43 = pricingRequest16.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str42, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str11, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType5, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType5, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int16 = pricingRequest15.loyaltyPoints();
        double double17 = pricingRequest15.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = pricingEngine0.calculateFinalPrice(pricingRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType3, false, "", false, (int) ' ');
        double double9 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        int int12 = pricingRequest8.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType3, false, "", false, (int) ' ');
        double double9 = pricingRequest8.basePrice();
        java.lang.String str10 = pricingRequest8.couponCode();
        boolean boolean11 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest8.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.Object obj13 = null;
        boolean boolean14 = pricingRequest7.equals(obj13);
        boolean boolean15 = pricingRequest7.firstOrder();
        boolean boolean16 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType14, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int20 = pricingRequest19.quantity();
        java.lang.String str21 = pricingRequest19.couponCode();
        boolean boolean22 = pricingRequest19.firstOrder();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str24 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass25 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass16 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) 'a', customerType11, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) '4');
        double double17 = pricingRequest16.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        int int23 = pricingRequest21.quantity();
        int int24 = pricingRequest21.loyaltyPoints();
        java.lang.String str25 = pricingRequest21.toString();
        java.lang.Class<?> wildcardClass26 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        int int16 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        int int35 = pricingRequest31.loyaltyPoints();
        java.lang.String str36 = pricingRequest31.couponCode();
        boolean boolean38 = pricingRequest31.equals((java.lang.Object) '4');
        double double39 = pricingRequest31.basePrice();
        boolean boolean40 = pricingRequest21.equals((java.lang.Object) pricingRequest31);
        int int41 = pricingRequest21.loyaltyPoints();
        int int42 = pricingRequest21.quantity();
        java.lang.String str43 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str43, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        int int17 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double24 = pricingRequest23.basePrice();
        int int25 = pricingRequest23.quantity();
        int int26 = pricingRequest23.loyaltyPoints();
        java.lang.String str27 = pricingRequest23.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, 52, customerType28, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        java.lang.String str17 = pricingRequest14.couponCode();
        double double18 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) 'a', customerType2, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        java.lang.Class<?> wildcardClass8 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        java.lang.String str12 = pricingRequest7.couponCode();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        boolean boolean11 = pricingRequest9.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType12, false, "", false, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.String str15 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(customerType16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType18, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int24 = pricingRequest23.quantity();
        java.lang.String str25 = pricingRequest23.couponCode();
        java.lang.String str26 = pricingRequest23.toString();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str25, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType30, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType30, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) -1, customerType30, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 10);
        boolean boolean46 = pricingRequest45.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double47 = pricingEngine0.calculateFinalPrice(pricingRequest45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (short) 0, customerType4, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (int) ' ');
        java.lang.String str15 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str15, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        int int35 = pricingRequest31.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType42, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType42, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType42, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass58 = customerType42.getClass();
        boolean boolean59 = pricingRequest31.equals((java.lang.Object) customerType42);
        // The following exception was thrown during execution in test generation
        try {
            double double60 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        java.lang.String str35 = pricingRequest31.couponCode();
        java.lang.String str36 = pricingRequest31.toString();
        java.lang.String str37 = pricingRequest31.couponCode();
        boolean boolean38 = pricingRequest31.firstOrder();
        java.lang.String str39 = pricingRequest31.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double40 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str36, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.seasonalSale();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) '4');
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType25, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType25, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType25, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType25, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType25, false, "hi!", false, (int) (byte) 0);
        boolean boolean51 = pricingRequest7.equals((java.lang.Object) "hi!");
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(customerType52);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        java.lang.String str24 = pricingRequest21.toString();
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = pricingRequest21.equals(obj25);
        java.lang.String str27 = pricingRequest21.toString();
        java.lang.Class<?> wildcardClass28 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean23 = pricingRequest21.seasonalSale();
        java.lang.Class<?> wildcardClass24 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType4, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType4, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType8, false, "", true, 0);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType16, false, "hi!", true, (int) (byte) 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean23 = pricingRequest21.firstOrder();
        java.lang.String str24 = pricingRequest21.toString();
        double double25 = pricingRequest21.basePrice();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        double double27 = pricingRequest7.basePrice();
        double double28 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        java.lang.String str24 = pricingRequest21.toString();
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = pricingRequest21.equals(obj25);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType29, false, "hi!", true, (int) (byte) 0);
        boolean boolean35 = pricingRequest34.seasonalSale();
        boolean boolean36 = pricingRequest34.firstOrder();
        java.lang.String str37 = pricingRequest34.toString();
        int int38 = pricingRequest34.quantity();
        int int39 = pricingRequest34.quantity();
        boolean boolean40 = pricingRequest34.seasonalSale();
        boolean boolean41 = pricingRequest21.equals((java.lang.Object) pricingRequest34);
        int int42 = pricingRequest34.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str37, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType4, false, "hi!", true, (int) (byte) 0);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean11 = pricingRequest9.firstOrder();
        java.lang.String str12 = pricingRequest9.toString();
        double double13 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType16, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int22 = pricingRequest21.quantity();
        java.lang.String str23 = pricingRequest21.couponCode();
        boolean boolean24 = pricingRequest21.firstOrder();
        boolean boolean25 = pricingRequest9.equals((java.lang.Object) pricingRequest21);
        java.lang.String str26 = pricingRequest21.couponCode();
        int int27 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(97.0d, (int) 'a', customerType28, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, (int) (short) 100);
        double double34 = pricingRequest33.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str23, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str26, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 97.0d + "'", double34 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType8, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType8, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest28.customerType();
        int int30 = pricingRequest28.quantity();
        int int31 = pricingRequest28.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType30, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType30, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType30, false, "hi!", false, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double46 = pricingEngine0.calculateFinalPrice(pricingRequest45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType14, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int20 = pricingRequest19.quantity();
        java.lang.String str21 = pricingRequest19.couponCode();
        boolean boolean22 = pricingRequest19.firstOrder();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str24 = pricingRequest19.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest19.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str24, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType11, false, "", false, (int) ' ');
        double double17 = pricingRequest16.basePrice();
        java.lang.String str18 = pricingRequest16.couponCode();
        boolean boolean19 = pricingRequest16.seasonalSale();
        double double20 = pricingRequest16.basePrice();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) pricingRequest16);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType4, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType4, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        boolean boolean15 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        double double24 = pricingRequest22.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest22.customerType();
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.Object obj13 = null;
        boolean boolean14 = pricingRequest7.equals(obj13);
        boolean boolean15 = pricingRequest7.firstOrder();
        boolean boolean16 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) '4');
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType25, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType25, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType25, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType25, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType25, false, "hi!", false, (int) (byte) 0);
        boolean boolean51 = pricingRequest7.equals((java.lang.Object) "hi!");
        boolean boolean52 = pricingRequest7.seasonalSale();
        java.lang.String str53 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str53, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType26, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest31.customerType();
        java.lang.String str33 = pricingRequest31.toString();
        java.lang.String str34 = pricingRequest31.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertNull(customerType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str33, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str34, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        boolean boolean25 = pricingRequest21.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        boolean boolean17 = pricingRequest14.seasonalSale();
        java.lang.String str18 = pricingRequest14.toString();
        int int19 = pricingRequest14.quantity();
        java.lang.String str20 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str20, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        java.lang.String str24 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType14, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int20 = pricingRequest19.quantity();
        java.lang.String str21 = pricingRequest19.couponCode();
        boolean boolean22 = pricingRequest19.firstOrder();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str24 = pricingRequest19.couponCode();
        int int25 = pricingRequest19.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType28, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        boolean boolean34 = pricingRequest19.equals((java.lang.Object) (-1));
        boolean boolean35 = pricingRequest19.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType48, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType48, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType48, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType48, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType48, false, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest78 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 100, customerType48, false, "", false, (int) ' ');
        boolean boolean79 = pricingRequest19.equals((java.lang.Object) pricingRequest78);
        int int80 = pricingRequest19.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str24, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType26, false, "hi!", false, (int) ' ');
        boolean boolean32 = pricingRequest31.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType26, false, "", false, (int) ' ');
        double double32 = pricingRequest31.basePrice();
        java.lang.String str33 = pricingRequest31.couponCode();
        double double34 = pricingRequest31.basePrice();
        int int35 = pricingRequest31.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double36 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 97.0d + "'", double34 == 97.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.loyaltyPoints();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType8, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType8, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType8, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        int int29 = pricingRequest28.loyaltyPoints();
        java.lang.String str30 = pricingRequest28.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        java.lang.String str24 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType32, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType32, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType32, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType32, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        boolean boolean54 = pricingRequest52.equals((java.lang.Object) 100.0f);
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = pricingRequest52.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double56 = pricingEngine0.calculateFinalPrice(pricingRequest52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType27, false, "hi!", true, (int) (byte) 0);
        boolean boolean33 = pricingRequest32.seasonalSale();
        int int34 = pricingRequest32.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest32.customerType();
        java.lang.String str36 = pricingRequest32.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType39, false, "", false, (int) ' ');
        boolean boolean45 = pricingRequest32.equals((java.lang.Object) false);
        boolean boolean46 = pricingRequest21.equals((java.lang.Object) pricingRequest32);
        java.lang.Class<?> wildcardClass47 = pricingRequest32.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(customerType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType27, false, "hi!", true, (int) (byte) 0);
        boolean boolean33 = pricingRequest32.seasonalSale();
        int int34 = pricingRequest32.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest32.customerType();
        java.lang.String str36 = pricingRequest32.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType39, false, "", false, (int) ' ');
        boolean boolean45 = pricingRequest32.equals((java.lang.Object) false);
        boolean boolean46 = pricingRequest21.equals((java.lang.Object) pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType50, false, "", false, (int) ' ');
        double double56 = pricingRequest55.basePrice();
        int int57 = pricingRequest55.quantity();
        double double58 = pricingRequest55.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest55.customerType();
        boolean boolean60 = pricingRequest55.firstOrder();
        boolean boolean61 = pricingRequest55.seasonalSale();
        boolean boolean62 = pricingRequest21.equals((java.lang.Object) boolean61);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(customerType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 97.0d + "'", double58 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType27, false, "hi!", true, (int) (byte) 0);
        boolean boolean33 = pricingRequest32.seasonalSale();
        int int34 = pricingRequest32.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest32.customerType();
        java.lang.String str36 = pricingRequest32.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType39, false, "", false, (int) ' ');
        boolean boolean45 = pricingRequest32.equals((java.lang.Object) false);
        boolean boolean46 = pricingRequest21.equals((java.lang.Object) pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest21.customerType();
        int int49 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(customerType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType27, false, "hi!", true, (int) (byte) 0);
        boolean boolean33 = pricingRequest32.seasonalSale();
        int int34 = pricingRequest32.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest32.customerType();
        java.lang.String str36 = pricingRequest32.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType39, false, "", false, (int) ' ');
        boolean boolean45 = pricingRequest32.equals((java.lang.Object) false);
        boolean boolean46 = pricingRequest21.equals((java.lang.Object) pricingRequest32);
        int int47 = pricingRequest32.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(customerType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType6, false, "hi!", true, (int) (byte) 0);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean13 = pricingRequest11.firstOrder();
        java.lang.String str14 = pricingRequest11.toString();
        double double15 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType18, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int24 = pricingRequest23.quantity();
        java.lang.String str25 = pricingRequest23.couponCode();
        boolean boolean26 = pricingRequest23.firstOrder();
        boolean boolean27 = pricingRequest11.equals((java.lang.Object) pricingRequest23);
        java.lang.String str28 = pricingRequest23.couponCode();
        int int29 = pricingRequest23.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(97.0d, (int) 'a', customerType30, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 100, customerType30, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=1]", true, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str25, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str28, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType11, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType23, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType23, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType23, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass39 = customerType23.getClass();
        boolean boolean40 = pricingRequest16.equals((java.lang.Object) customerType23);
        boolean boolean41 = pricingRequest16.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest16.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType13, false, "hi!", true, (int) (byte) 0);
        boolean boolean19 = pricingRequest18.seasonalSale();
        boolean boolean20 = pricingRequest18.firstOrder();
        java.lang.String str21 = pricingRequest18.toString();
        int int22 = pricingRequest18.quantity();
        int int23 = pricingRequest18.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest18.customerType();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        int int26 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        int int35 = pricingRequest31.loyaltyPoints();
        java.lang.String str36 = pricingRequest31.couponCode();
        boolean boolean38 = pricingRequest31.equals((java.lang.Object) '4');
        double double39 = pricingRequest31.basePrice();
        boolean boolean40 = pricingRequest21.equals((java.lang.Object) pricingRequest31);
        double double41 = pricingRequest21.basePrice();
        java.lang.String str42 = pricingRequest21.couponCode();
        int int43 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str42, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType3, false, "", false, (int) ' ');
        double double9 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (-1));
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (int) '#');
        int int29 = pricingRequest28.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        java.lang.String str23 = pricingRequest21.couponCode();
        java.lang.String str24 = pricingRequest21.couponCode();
        java.lang.String str25 = pricingRequest21.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType5, false, "", false, (int) ' ');
        double double11 = pricingRequest10.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType12, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType24, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType24, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType24, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass40 = customerType24.getClass();
        boolean boolean41 = pricingRequest17.equals((java.lang.Object) customerType24);
        boolean boolean42 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest17.customerType();
        boolean boolean44 = pricingRequest17.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double45 = pricingEngine0.calculateFinalPrice(pricingRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        boolean boolean30 = pricingRequest28.equals((java.lang.Object) 100.0f);
        boolean boolean31 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType15, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType15, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType15, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int31 = pricingRequest30.loyaltyPoints();
        int int32 = pricingRequest30.quantity();
        double double33 = pricingRequest30.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType36, false, "hi!", true, (int) (byte) 0);
        boolean boolean42 = pricingRequest41.seasonalSale();
        int int43 = pricingRequest41.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest41.customerType();
        java.lang.String str45 = pricingRequest41.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType48, false, "", false, (int) ' ');
        boolean boolean54 = pricingRequest41.equals((java.lang.Object) false);
        boolean boolean55 = pricingRequest30.equals((java.lang.Object) pricingRequest41);
        boolean boolean56 = pricingRequest7.equals((java.lang.Object) boolean55);
        java.lang.Class<?> wildcardClass57 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(customerType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        java.lang.String str18 = pricingRequest14.couponCode();
        int int19 = pricingRequest14.quantity();
        boolean boolean20 = pricingRequest14.seasonalSale();
        java.lang.String str21 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str17, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str18, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str21, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType15, false, "hi!", true, (int) (byte) 0);
        boolean boolean21 = pricingRequest20.seasonalSale();
        boolean boolean22 = pricingRequest20.firstOrder();
        java.lang.String str23 = pricingRequest20.toString();
        java.lang.String str24 = pricingRequest20.toString();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType28, false, "", false, (int) ' ');
        int int34 = pricingRequest33.quantity();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType38, false, "", false, (int) ' ');
        double double44 = pricingRequest43.basePrice();
        java.lang.String str45 = pricingRequest43.couponCode();
        double double46 = pricingRequest43.basePrice();
        boolean boolean47 = pricingRequest43.firstOrder();
        boolean boolean48 = pricingRequest7.equals((java.lang.Object) pricingRequest43);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str23, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType14, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int20 = pricingRequest19.quantity();
        java.lang.String str21 = pricingRequest19.couponCode();
        boolean boolean22 = pricingRequest19.firstOrder();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        boolean boolean24 = pricingRequest19.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.couponCode();
        int int10 = pricingRequest7.loyaltyPoints();
        int int11 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType27, false, "", false, (int) ' ');
        double double33 = pricingRequest32.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest32.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType34, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType46, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType46, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType46, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass62 = customerType46.getClass();
        boolean boolean63 = pricingRequest39.equals((java.lang.Object) customerType46);
        boolean boolean64 = pricingRequest39.seasonalSale();
        java.lang.String str65 = pricingRequest39.couponCode();
        java.lang.Class<?> wildcardClass66 = pricingRequest39.getClass();
        boolean boolean67 = pricingRequest21.equals((java.lang.Object) pricingRequest39);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str65, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) '4');
        double double15 = pricingRequest7.basePrice();
        java.lang.String str16 = pricingRequest7.toString();
        boolean boolean17 = pricingRequest7.seasonalSale();
        int int18 = pricingRequest7.loyaltyPoints();
        double double19 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType8, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 0, customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 10);
        boolean boolean29 = pricingRequest28.firstOrder();
        int int30 = pricingRequest28.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 10, customerType2, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) '4');
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType14, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType14, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType14, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        double double31 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        java.lang.String str8 = pricingRequest7.toString();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType18, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType18, false, "", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (-1), customerType18, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 1);
        boolean boolean39 = pricingRequest7.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str8, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) 97.0d);
        int int15 = pricingRequest7.quantity();
        boolean boolean16 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        java.lang.String str18 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(customerType13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType15, false, "hi!", true, (int) (byte) 0);
        boolean boolean21 = pricingRequest20.seasonalSale();
        boolean boolean22 = pricingRequest20.firstOrder();
        java.lang.String str23 = pricingRequest20.toString();
        int int24 = pricingRequest20.quantity();
        int int25 = pricingRequest20.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType28, false, "hi!", true, (int) (byte) 0);
        boolean boolean34 = pricingRequest33.seasonalSale();
        boolean boolean35 = pricingRequest33.firstOrder();
        java.lang.String str36 = pricingRequest33.toString();
        java.lang.String str37 = pricingRequest33.toString();
        boolean boolean38 = pricingRequest20.equals((java.lang.Object) pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType41, false, "hi!", true, (int) (byte) 0);
        boolean boolean47 = pricingRequest46.seasonalSale();
        boolean boolean48 = pricingRequest46.firstOrder();
        java.lang.String str49 = pricingRequest46.toString();
        java.lang.String str50 = pricingRequest46.toString();
        java.lang.String str51 = pricingRequest46.couponCode();
        int int52 = pricingRequest46.quantity();
        boolean boolean53 = pricingRequest33.equals((java.lang.Object) int52);
        boolean boolean54 = pricingRequest7.equals((java.lang.Object) boolean53);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str23, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str36, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str37, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str49, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str50, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType6, false, "", false, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType13, false, "", false, (int) ' ');
        double double19 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType20, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType32, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType32, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType32, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass48 = customerType32.getClass();
        boolean boolean49 = pricingRequest25.equals((java.lang.Object) customerType32);
        boolean boolean50 = pricingRequest25.seasonalSale();
        java.lang.String str51 = pricingRequest25.couponCode();
        int int52 = pricingRequest25.quantity();
        boolean boolean53 = pricingRequest7.equals((java.lang.Object) pricingRequest25);
        boolean boolean54 = pricingRequest25.firstOrder();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str51, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType16, false, "", false, (int) ' ');
        double double22 = pricingRequest21.basePrice();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest21.customerType();
        boolean boolean26 = pricingRequest21.seasonalSale();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) '4');
        double double15 = pricingRequest7.basePrice();
        java.lang.String str16 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType21, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType21, false, "", true, (int) '4');
        java.lang.String str32 = pricingRequest31.couponCode();
        boolean boolean33 = pricingRequest31.seasonalSale();
        boolean boolean34 = pricingRequest7.equals((java.lang.Object) boolean33);
        java.lang.Class<?> wildcardClass35 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType6, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType6, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType6, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 0);
        java.lang.String str22 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str22, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType9, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType9, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType9, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType9, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest29.customerType();
        int int31 = pricingRequest29.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = pricingEngine0.calculateFinalPrice(pricingRequest29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType4, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) -1, customerType4, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) '4');
        int int15 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType10, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType10, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (byte) 10, customerType10, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 10);
        java.lang.String str36 = pricingRequest35.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=10]" + "'", str36, "PricingRequest[basePrice=1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=10]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType10, false, "hi!", false, (int) (byte) 0);
        java.lang.Class<?> wildcardClass36 = customerType10.getClass();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType27, false, "hi!", true, (int) (byte) 0);
        boolean boolean33 = pricingRequest32.seasonalSale();
        boolean boolean34 = pricingRequest32.firstOrder();
        java.lang.String str35 = pricingRequest32.toString();
        double double36 = pricingRequest32.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType39, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int45 = pricingRequest44.quantity();
        java.lang.String str46 = pricingRequest44.couponCode();
        boolean boolean47 = pricingRequest44.firstOrder();
        boolean boolean48 = pricingRequest32.equals((java.lang.Object) pricingRequest44);
        java.lang.String str49 = pricingRequest44.couponCode();
        int int50 = pricingRequest44.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest44.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType51, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) 1);
        boolean boolean57 = pricingRequest21.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str35, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str46, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str49, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        java.lang.String str8 = pricingRequest7.toString();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType12, false, "hi!", true, (int) (byte) 0);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest17.customerType();
        int int21 = pricingRequest17.loyaltyPoints();
        java.lang.String str22 = pricingRequest17.toString();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) str22);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str8, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str22, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType15, false, "hi!", true, (int) (byte) 0);
        boolean boolean21 = pricingRequest20.seasonalSale();
        boolean boolean22 = pricingRequest20.firstOrder();
        java.lang.String str23 = pricingRequest20.toString();
        int int24 = pricingRequest20.quantity();
        int int25 = pricingRequest20.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType28, false, "hi!", true, (int) (byte) 0);
        boolean boolean34 = pricingRequest33.seasonalSale();
        boolean boolean35 = pricingRequest33.firstOrder();
        java.lang.String str36 = pricingRequest33.toString();
        java.lang.String str37 = pricingRequest33.toString();
        boolean boolean38 = pricingRequest20.equals((java.lang.Object) pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType41, false, "", false, (int) ' ');
        int int47 = pricingRequest46.quantity();
        boolean boolean48 = pricingRequest20.equals((java.lang.Object) pricingRequest46);
        boolean boolean49 = pricingRequest7.equals((java.lang.Object) boolean48);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str23, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str36, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str37, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) -1, customerType4, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 32);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        int int12 = pricingRequest8.loyaltyPoints();
        java.lang.String str13 = pricingRequest8.couponCode();
        boolean boolean15 = pricingRequest8.equals((java.lang.Object) '4');
        double double16 = pricingRequest8.basePrice();
        java.lang.String str17 = pricingRequest8.toString();
        boolean boolean18 = pricingRequest8.seasonalSale();
        int int19 = pricingRequest8.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType10, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType10, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType10, false, "", false, 10);
        boolean boolean26 = pricingRequest25.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(97.0d, (int) (byte) 1, customerType27, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, 52, customerType27, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        java.lang.String str17 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 100, customerType18, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType30, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType30, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType30, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double46 = pricingRequest45.basePrice();
        int int47 = pricingRequest45.quantity();
        int int48 = pricingRequest45.loyaltyPoints();
        java.lang.String str49 = pricingRequest45.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str49, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType26, false, "", false, (int) ' ');
        double double32 = pricingRequest31.basePrice();
        java.lang.String str33 = pricingRequest31.couponCode();
        boolean boolean34 = pricingRequest31.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest31.customerType();
        int int36 = pricingRequest31.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.couponCode();
        double double16 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        double double15 = pricingRequest7.basePrice();
        int int16 = pricingRequest7.loyaltyPoints();
        java.lang.String str17 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType24, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType24, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType24, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean40 = pricingRequest39.seasonalSale();
        boolean boolean41 = pricingRequest39.seasonalSale();
        boolean boolean42 = pricingRequest7.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType8, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType8, false, "", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (-1), customerType8, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 1);
        java.lang.String str29 = pricingRequest28.toString();
        double double30 = pricingRequest28.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=1]" + "'", str29, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (-1));
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.seasonalSale();
        int int15 = pricingRequest7.quantity();
        java.lang.String str16 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType6, false, "", false, 10);
        double double22 = pricingRequest21.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        double double24 = pricingRequest22.basePrice();
        int int25 = pricingRequest22.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType11, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        int int17 = pricingRequest16.loyaltyPoints();
        java.lang.String str18 = pricingRequest16.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.toString();
        int int12 = pricingRequest7.loyaltyPoints();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str11, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType4, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) -1, customerType4, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        boolean boolean16 = pricingRequest14.seasonalSale();
        java.lang.String str17 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingRequest21.basePrice();
        int int24 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 0, customerType8, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 10, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 100);
        int int22 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        double double15 = pricingRequest7.basePrice();
        boolean boolean16 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        boolean boolean16 = pricingRequest14.firstOrder();
        double double17 = pricingRequest14.basePrice();
        java.lang.String str18 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType2, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType6, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        int int22 = pricingRequest21.quantity();
        int int23 = pricingRequest21.loyaltyPoints();
        java.lang.Class<?> wildcardClass24 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) 'a', customerType2, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        boolean boolean8 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType15, false, "hi!", true, (int) (byte) 0);
        boolean boolean21 = pricingRequest20.seasonalSale();
        boolean boolean22 = pricingRequest20.firstOrder();
        java.lang.String str23 = pricingRequest20.toString();
        java.lang.String str24 = pricingRequest20.toString();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest20);
        double double26 = pricingRequest20.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str23, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        boolean boolean14 = pricingRequest7.seasonalSale();
        int int15 = pricingRequest7.quantity();
        java.lang.String str16 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType7, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType7, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType7, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double23 = pricingRequest22.basePrice();
        int int24 = pricingRequest22.quantity();
        int int25 = pricingRequest22.loyaltyPoints();
        int int26 = pricingRequest22.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = pricingEngine0.calculateFinalPrice(pricingRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType14, false, "hi!", true, (int) (byte) 0);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean21 = pricingRequest19.firstOrder();
        java.lang.String str22 = pricingRequest19.toString();
        double double23 = pricingRequest19.basePrice();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str25 = pricingRequest19.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str22, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        java.lang.String str23 = pricingRequest21.couponCode();
        java.lang.String str24 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, 10);
        java.lang.String str22 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=0.0, quantity=97, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]" + "'", str22, "PricingRequest[basePrice=0.0, quantity=97, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType26, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest31.customerType();
        java.lang.String str33 = pricingRequest31.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        java.lang.Object obj35 = null;
        boolean boolean36 = pricingRequest31.equals(obj35);
        java.lang.String str37 = pricingRequest31.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType44, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType44, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType44, false, "", false, (int) (byte) 0);
        boolean boolean61 = pricingRequest59.equals((java.lang.Object) "");
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = pricingRequest59.customerType();
        boolean boolean63 = pricingRequest31.equals((java.lang.Object) pricingRequest59);
        // The following exception was thrown during execution in test generation
        try {
            double double64 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertNull(customerType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str33, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + customerType62 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType62.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        boolean boolean17 = pricingRequest14.equals((java.lang.Object) 10);
        int int18 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        int int23 = pricingRequest21.quantity();
        int int24 = pricingRequest21.loyaltyPoints();
        java.lang.String str25 = pricingRequest21.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest21.customerType();
        double double27 = pricingRequest21.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType16, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType16, false, "", true, (int) '4');
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        double double13 = pricingRequest7.basePrice();
        boolean boolean14 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType6, false, "", false, 10);
        java.lang.String str22 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]" + "'", str22, "PricingRequest[basePrice=-1.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType17, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType17, false, "", true, (int) '4');
        java.lang.String str28 = pricingRequest27.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest27.customerType();
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) customerType29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType18, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType18, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        java.lang.Class<?> wildcardClass34 = customerType18.getClass();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) customerType18);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType46, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType46, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType46, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType46, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest71 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) '#', customerType46, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) ' ');
        java.lang.Class<?> wildcardClass72 = customerType46.getClass();
        boolean boolean73 = pricingRequest7.equals((java.lang.Object) customerType46);
        java.lang.String str74 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str74, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertNull(customerType14);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 10, customerType4, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 100, customerType4, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) '4');
        double double15 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.loyaltyPoints();
        boolean boolean13 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType5, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType5, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int16 = pricingRequest15.loyaltyPoints();
        boolean boolean17 = pricingRequest15.firstOrder();
        java.lang.String str18 = pricingRequest15.toString();
        java.lang.String str19 = pricingRequest15.couponCode();
        boolean boolean20 = pricingRequest15.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = pricingEngine0.calculateFinalPrice(pricingRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str19, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) (byte) 100, customerType6, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest21.customerType();
        int int23 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        int int35 = pricingRequest31.loyaltyPoints();
        java.lang.String str36 = pricingRequest31.couponCode();
        boolean boolean38 = pricingRequest31.equals((java.lang.Object) '4');
        double double39 = pricingRequest31.basePrice();
        boolean boolean40 = pricingRequest21.equals((java.lang.Object) pricingRequest31);
        double double41 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        int int35 = pricingRequest31.loyaltyPoints();
        java.lang.String str36 = pricingRequest31.couponCode();
        boolean boolean38 = pricingRequest31.equals((java.lang.Object) '4');
        double double39 = pricingRequest31.basePrice();
        boolean boolean40 = pricingRequest21.equals((java.lang.Object) pricingRequest31);
        java.lang.String str41 = pricingRequest21.toString();
        java.lang.Class<?> wildcardClass42 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str41, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.firstOrder();
        int int24 = pricingRequest21.quantity();
        int int25 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType28, false, "", false, (int) ' ');
        double double34 = pricingRequest33.basePrice();
        boolean boolean35 = pricingRequest33.seasonalSale();
        boolean boolean36 = pricingRequest21.equals((java.lang.Object) pricingRequest33);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 97.0d + "'", double34 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        boolean boolean17 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType4, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType4, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (short) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType3, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest8.customerType();
        java.lang.String str10 = pricingRequest8.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest8.equals(obj12);
        java.lang.String str14 = pricingRequest8.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType21, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType21, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType21, false, "", false, (int) (byte) 0);
        boolean boolean38 = pricingRequest36.equals((java.lang.Object) "");
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest36.customerType();
        boolean boolean40 = pricingRequest8.equals((java.lang.Object) pricingRequest36);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType13, false, "hi!", true, (int) (byte) 0);
        boolean boolean19 = pricingRequest18.seasonalSale();
        boolean boolean20 = pricingRequest18.firstOrder();
        java.lang.String str21 = pricingRequest18.toString();
        int int22 = pricingRequest18.quantity();
        int int23 = pricingRequest18.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest18.customerType();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        java.lang.Class<?> wildcardClass26 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        java.lang.String str18 = pricingRequest14.couponCode();
        int int19 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str17, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str18, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) '4');
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType28, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType28, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (int) '#');
        double double39 = pricingEngine0.calculateFinalPrice(pricingRequest38);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType46, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType46, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType46, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double62 = pricingRequest61.basePrice();
        int int63 = pricingRequest61.quantity();
        int int64 = pricingRequest61.loyaltyPoints();
        java.lang.String str65 = pricingRequest61.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = pricingRequest61.customerType();
        java.lang.String str67 = pricingRequest61.toString();
        boolean boolean68 = pricingRequest61.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double69 = pricingEngine0.calculateFinalPrice(pricingRequest61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 77.99d + "'", double39 == 77.99d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str67, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) -1, customerType6, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 10);
        boolean boolean22 = pricingRequest21.seasonalSale();
        java.lang.String str23 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=10]" + "'", str23, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=10]");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        java.lang.Class<?> wildcardClass24 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType6, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType6, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType6, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }
}

