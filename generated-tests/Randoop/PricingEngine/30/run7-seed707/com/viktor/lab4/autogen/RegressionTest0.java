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
        com.viktor.lab4.PricingEngine.CustomerType customerType0 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        java.lang.Class<?> wildcardClass1 = customerType0.getClass();
        org.junit.Assert.assertTrue("'" + customerType0 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType0.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass9 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean10 = pricingRequest8.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        java.lang.String str13 = pricingRequest8.toString();
        boolean boolean14 = pricingRequest8.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.viktor.lab4.PricingEngine.CustomerType customerType0 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        java.lang.Class<?> wildcardClass1 = customerType0.getClass();
        org.junit.Assert.assertTrue("'" + customerType0 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType0.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        java.lang.String str14 = pricingRequest7.toString();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType3, false, "", true, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.quantity();
        boolean boolean13 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        boolean boolean14 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) false);
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        java.lang.String str9 = pricingRequest8.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        boolean boolean11 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        java.lang.String str16 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 7.99d);
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        boolean boolean25 = pricingRequest17.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        java.lang.String str9 = pricingRequest8.couponCode();
        double double10 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        double double14 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.Class<?> wildcardClass16 = customerType15.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        int int30 = pricingRequest28.quantity();
        int int31 = pricingRequest28.quantity();
        java.lang.String str32 = pricingRequest28.couponCode();
        boolean boolean33 = pricingRequest28.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double34 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 7.99d);
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.quantity();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 0, customerType2, true, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        java.lang.String str9 = pricingRequest8.couponCode();
        java.lang.String str10 = pricingRequest8.toString();
        boolean boolean11 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        int int31 = pricingRequest30.quantity();
        int int32 = pricingRequest30.quantity();
        java.lang.String str33 = pricingRequest30.toString();
        int int34 = pricingRequest30.loyaltyPoints();
        java.lang.String str35 = pricingRequest30.toString();
        boolean boolean36 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType37, false, "", true, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double43 = pricingEngine0.calculateFinalPrice(pricingRequest42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean10 = pricingRequest8.firstOrder();
        boolean boolean11 = pricingRequest8.firstOrder();
        boolean boolean12 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType15, false, "", true, (int) (byte) 100);
        int int21 = pricingRequest20.loyaltyPoints();
        double double22 = pricingRequest20.basePrice();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingRequest20.basePrice();
        boolean boolean26 = pricingRequest8.equals((java.lang.Object) double25);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.loyaltyPoints();
        boolean boolean16 = pricingRequest7.seasonalSale();
        java.lang.Object obj17 = null;
        boolean boolean18 = pricingRequest7.equals(obj17);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType23, false, "", true, (int) (byte) 100);
        int int29 = pricingRequest28.loyaltyPoints();
        double double30 = pricingRequest28.basePrice();
        boolean boolean31 = pricingRequest28.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        int int30 = pricingRequest28.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double31 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        double double20 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.quantity();
        int int13 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType11, false, "", true, (int) (short) -1);
        int int17 = pricingRequest16.quantity();
        int int18 = pricingRequest16.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        java.lang.String str29 = pricingRequest28.couponCode();
        java.lang.String str30 = pricingRequest28.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest28.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType34, true, "hi!", true, (int) (short) -1);
        boolean boolean40 = pricingRequest39.seasonalSale();
        int int41 = pricingRequest39.quantity();
        double double42 = pricingRequest39.basePrice();
        boolean boolean43 = pricingRequest39.seasonalSale();
        boolean boolean44 = pricingRequest39.seasonalSale();
        boolean boolean45 = pricingRequest28.equals((java.lang.Object) pricingRequest39);
        // The following exception was thrown during execution in test generation
        try {
            double double46 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 35.0d + "'", double42 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.Object obj13 = null;
        boolean boolean14 = pricingRequest7.equals(obj13);
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        java.lang.String str9 = pricingRequest8.couponCode();
        java.lang.String str10 = pricingRequest8.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        int int21 = pricingRequest19.quantity();
        double double22 = pricingRequest19.basePrice();
        boolean boolean23 = pricingRequest19.seasonalSale();
        boolean boolean24 = pricingRequest19.seasonalSale();
        boolean boolean25 = pricingRequest8.equals((java.lang.Object) pricingRequest19);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = pricingEngine0.calculateFinalPrice(pricingRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType27, true, "hi!", true, (int) (short) -1);
        boolean boolean33 = pricingRequest32.seasonalSale();
        boolean boolean34 = pricingRequest32.firstOrder();
        boolean boolean35 = pricingRequest32.firstOrder();
        int int36 = pricingRequest32.quantity();
        java.lang.String str37 = pricingRequest32.toString();
        boolean boolean38 = pricingRequest7.equals((java.lang.Object) str37);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str37, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType15, false, "hi!", true, 1);
        int int26 = pricingRequest25.loyaltyPoints();
        int int27 = pricingRequest25.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = pricingRequest18.getClass();
        boolean boolean20 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        java.lang.String str21 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        int int30 = pricingRequest28.quantity();
        double double31 = pricingRequest28.basePrice();
        boolean boolean32 = pricingRequest28.seasonalSale();
        boolean boolean33 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest28.customerType();
        int int35 = pricingRequest28.loyaltyPoints();
        java.lang.String str36 = pricingRequest28.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass14 = customerType13.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType13, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        boolean boolean21 = pricingRequest20.seasonalSale();
        int int22 = pricingRequest20.quantity();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.seasonalSale();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) boolean24);
        java.lang.Class<?> wildcardClass26 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean22 = pricingRequest19.equals((java.lang.Object) 100.0d);
        boolean boolean23 = pricingRequest19.seasonalSale();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        int int25 = pricingRequest19.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        java.lang.String str13 = pricingRequest8.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) (short) 0, customerType15, true, "hi!", false, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest8.equals((java.lang.Object) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        boolean boolean19 = pricingRequest18.seasonalSale();
        boolean boolean21 = pricingRequest18.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest18.customerType();
        java.lang.String str23 = pricingRequest18.toString();
        boolean boolean24 = pricingRequest8.equals((java.lang.Object) pricingRequest18);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = pricingEngine0.calculateFinalPrice(pricingRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType2, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        double double8 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean31 = pricingRequest28.equals((java.lang.Object) 100.0d);
        boolean boolean32 = pricingRequest28.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        boolean boolean17 = pricingRequest16.seasonalSale();
        boolean boolean18 = pricingRequest16.firstOrder();
        double double19 = pricingRequest16.basePrice();
        java.lang.Class<?> wildcardClass20 = pricingRequest16.getClass();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        java.lang.String str29 = pricingRequest28.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest28.customerType();
        boolean boolean31 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        java.lang.Object obj33 = null;
        boolean boolean34 = pricingRequest28.equals(obj33);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest7.customerType();
        java.lang.String str21 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean30 = pricingRequest28.firstOrder();
        boolean boolean31 = pricingRequest28.firstOrder();
        int int32 = pricingRequest28.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType35, true, "hi!", true, (int) (short) -1);
        boolean boolean41 = pricingRequest40.seasonalSale();
        boolean boolean43 = pricingRequest40.equals((java.lang.Object) 100.0d);
        boolean boolean44 = pricingRequest40.seasonalSale();
        boolean boolean45 = pricingRequest28.equals((java.lang.Object) pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType48, true, "hi!", true, (int) (short) -1);
        boolean boolean55 = pricingRequest53.equals((java.lang.Object) 10);
        boolean boolean56 = pricingRequest28.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        java.lang.String str12 = pricingRequest9.toString();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.toString();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) 'a', customerType16, true, "", false, (int) 'a');
        int int22 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = pricingRequest7.equals(obj9);
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        int int13 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean23 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType26, true, "hi!", true, (int) (short) -1);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        double double34 = pricingRequest31.basePrice();
        boolean boolean35 = pricingRequest31.seasonalSale();
        boolean boolean36 = pricingRequest31.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest31.customerType();
        boolean boolean38 = pricingRequest21.equals((java.lang.Object) pricingRequest31);
        boolean boolean39 = pricingRequest31.firstOrder();
        java.lang.String str40 = pricingRequest31.toString();
        boolean boolean41 = pricingRequest7.equals((java.lang.Object) pricingRequest31);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 35.0d + "'", double34 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str40, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        java.lang.String str13 = pricingRequest8.couponCode();
        int int14 = pricingRequest8.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        double double14 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 10, customerType15, true, "hi!", true, (int) '4');
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        int int19 = pricingRequest18.loyaltyPoints();
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = pricingRequest18.equals(obj20);
        int int22 = pricingRequest18.loyaltyPoints();
        boolean boolean23 = pricingRequest18.firstOrder();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass16 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.seasonalSale();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        java.lang.String str26 = pricingRequest21.toString();
        boolean boolean28 = pricingRequest21.equals((java.lang.Object) (-1));
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType15, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest25.customerType();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) customerType26);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        double double14 = pricingRequest7.basePrice();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest7.customerType();
        double double21 = pricingRequest7.basePrice();
        double double22 = pricingRequest7.basePrice();
        boolean boolean23 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType25, true, "hi!", true, 100);
        int int36 = pricingRequest35.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = pricingEngine0.calculateFinalPrice(pricingRequest35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType13, true, "hi!", true, (int) (byte) 10);
        double double19 = pricingRequest18.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, (int) '#', customerType15, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, 0);
        java.lang.String str26 = pricingRequest25.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean10 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        boolean boolean19 = pricingRequest18.seasonalSale();
        int int20 = pricingRequest18.quantity();
        double double21 = pricingRequest18.basePrice();
        boolean boolean22 = pricingRequest18.seasonalSale();
        boolean boolean23 = pricingRequest18.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest18.customerType();
        boolean boolean25 = pricingRequest8.equals((java.lang.Object) pricingRequest18);
        boolean boolean26 = pricingRequest18.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest18.customerType();
        java.lang.String str28 = pricingRequest18.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = pricingEngine0.calculateFinalPrice(pricingRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = pricingRequest18.getClass();
        boolean boolean20 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        java.lang.String str21 = pricingRequest18.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean30 = pricingRequest28.firstOrder();
        int int31 = pricingRequest28.loyaltyPoints();
        java.lang.String str32 = pricingRequest28.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = pricingRequest7.equals(obj9);
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.String str15 = pricingRequest7.couponCode();
        boolean boolean16 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType11, false, "", true, (int) (short) -1);
        int int17 = pricingRequest16.loyaltyPoints();
        java.lang.String str18 = pricingRequest16.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        int int9 = pricingRequest8.quantity();
        int int10 = pricingRequest8.quantity();
        int int11 = pricingRequest8.quantity();
        int int12 = pricingRequest8.loyaltyPoints();
        int int13 = pricingRequest8.quantity();
        boolean boolean14 = pricingRequest8.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        int int16 = pricingRequest7.quantity();
        java.lang.String str17 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.seasonalSale();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.Object obj10 = null;
        boolean boolean11 = pricingRequest7.equals(obj10);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = pricingRequest7.equals(obj9);
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        java.lang.String str14 = pricingRequest7.toString();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        boolean boolean13 = pricingRequest9.seasonalSale();
        boolean boolean14 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 0, customerType15, false, "", true, (int) '#');
        int int21 = pricingRequest20.quantity();
        double double22 = pricingRequest20.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType17, true, "hi!", true, (int) (short) -1);
        boolean boolean23 = pricingRequest22.seasonalSale();
        boolean boolean25 = pricingRequest22.equals((java.lang.Object) 100.0d);
        boolean boolean26 = pricingRequest22.seasonalSale();
        boolean boolean27 = pricingRequest22.firstOrder();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        boolean boolean16 = pricingRequest14.firstOrder();
        java.lang.Class<?> wildcardClass17 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        int int14 = pricingRequest13.quantity();
        int int15 = pricingRequest13.quantity();
        int int16 = pricingRequest13.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType17, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) '4', customerType17, false, "", false, 1);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        double double25 = pricingRequest17.basePrice();
        boolean boolean26 = pricingRequest17.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.firstOrder();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean30 = pricingRequest28.firstOrder();
        boolean boolean31 = pricingRequest28.firstOrder();
        int int32 = pricingRequest28.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType35, true, "hi!", true, (int) (short) -1);
        boolean boolean41 = pricingRequest40.seasonalSale();
        boolean boolean43 = pricingRequest40.equals((java.lang.Object) 100.0d);
        boolean boolean44 = pricingRequest40.seasonalSale();
        boolean boolean45 = pricingRequest28.equals((java.lang.Object) pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest40.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double47 = pricingEngine0.calculateFinalPrice(pricingRequest40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) ' ', customerType2, false, "hi!", false, (int) '4');
        boolean boolean8 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        boolean boolean25 = pricingRequest17.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest17.customerType();
        double double27 = pricingRequest17.basePrice();
        boolean boolean28 = pricingRequest17.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean22 = pricingRequest19.equals((java.lang.Object) 100.0d);
        boolean boolean23 = pricingRequest19.seasonalSale();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        int int25 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        java.lang.String str14 = pricingRequest9.toString();
        java.lang.String str15 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 10, customerType16, false, "hi!", true, (int) 'a');
        java.lang.Class<?> wildcardClass22 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.equals((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest7.customerType();
        double double21 = pricingRequest7.basePrice();
        java.lang.String str22 = pricingRequest7.toString();
        boolean boolean23 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType13, false, "hi!", false, (int) '#');
        double double19 = pricingRequest18.basePrice();
        boolean boolean20 = pricingRequest18.seasonalSale();
        boolean boolean21 = pricingRequest18.firstOrder();
        boolean boolean22 = pricingRequest18.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean22 = pricingRequest19.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest19.customerType();
        double double24 = pricingRequest19.basePrice();
        int int25 = pricingRequest19.loyaltyPoints();
        boolean boolean27 = pricingRequest19.equals((java.lang.Object) false);
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str29 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) 'a', customerType2, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]" + "'", str9, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest7.customerType();
        boolean boolean26 = pricingRequest7.firstOrder();
        int int27 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) 1, customerType2, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (int) '4');
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType43, true, "hi!", true, (int) (short) -1);
        boolean boolean49 = pricingRequest48.seasonalSale();
        boolean boolean50 = pricingRequest48.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType53, true, "hi!", true, (int) (short) -1);
        boolean boolean59 = pricingRequest58.seasonalSale();
        int int60 = pricingRequest58.quantity();
        double double61 = pricingRequest58.basePrice();
        boolean boolean62 = pricingRequest58.seasonalSale();
        boolean boolean63 = pricingRequest58.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest58.customerType();
        boolean boolean65 = pricingRequest48.equals((java.lang.Object) pricingRequest58);
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = pricingRequest48.customerType();
        boolean boolean67 = pricingRequest48.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double68 = pricingEngine0.calculateFinalPrice(pricingRequest48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 35.0d + "'", double61 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean22 = pricingRequest19.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest19.customerType();
        double double24 = pricingRequest19.basePrice();
        int int25 = pricingRequest19.loyaltyPoints();
        boolean boolean27 = pricingRequest19.equals((java.lang.Object) false);
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        boolean boolean29 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '4', customerType15, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType28, false, "", true, (int) (byte) 100);
        int int34 = pricingRequest33.loyaltyPoints();
        double double35 = pricingRequest33.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest33.customerType();
        boolean boolean37 = pricingRequest25.equals((java.lang.Object) pricingRequest33);
        int int38 = pricingRequest33.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (short) 10, customerType15, false, "", false, (-1));
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.couponCode();
        boolean boolean17 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        boolean boolean25 = pricingRequest17.firstOrder();
        java.lang.Class<?> wildcardClass26 = pricingRequest17.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean11 = pricingRequest9.firstOrder();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, 1, customerType13, false, "hi!", false, (int) (byte) 100);
        java.lang.String str19 = pricingRequest18.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        boolean boolean25 = pricingRequest17.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest17.customerType();
        double double27 = pricingRequest17.basePrice();
        java.lang.Class<?> wildcardClass28 = pricingRequest17.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        java.lang.String str10 = pricingRequest9.couponCode();
        double double11 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) '4', customerType12, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = customerType12.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean11 = pricingRequest9.firstOrder();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, 1, customerType13, false, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest7.customerType();
        int int21 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        int int16 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.seasonalSale();
        double double15 = pricingRequest7.basePrice();
        double double16 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = pricingRequest18.getClass();
        boolean boolean20 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        java.lang.Class<?> wildcardClass21 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        boolean boolean14 = pricingRequest13.seasonalSale();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 10, customerType17, true, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        boolean boolean11 = pricingRequest8.seasonalSale();
        int int12 = pricingRequest8.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        int int15 = pricingRequest14.loyaltyPoints();
        java.lang.String str16 = pricingRequest14.couponCode();
        boolean boolean17 = pricingRequest14.firstOrder();
        int int18 = pricingRequest14.loyaltyPoints();
        boolean boolean19 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean11 = pricingRequest9.firstOrder();
        int int12 = pricingRequest9.loyaltyPoints();
        java.lang.String str13 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        java.lang.Object obj15 = null;
        boolean boolean16 = pricingRequest9.equals(obj15);
        java.lang.String str17 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 97, customerType18, true, "hi!", false, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        int int15 = pricingRequest7.quantity();
        boolean boolean16 = pricingRequest7.firstOrder();
        int int17 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 1L);
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        int int29 = pricingRequest28.quantity();
        int int30 = pricingRequest28.quantity();
        int int31 = pricingRequest28.quantity();
        int int32 = pricingRequest28.quantity();
        java.lang.String str33 = pricingRequest28.couponCode();
        boolean boolean34 = pricingRequest28.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double42 = pricingEngine0.calculateFinalPrice(pricingRequest41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        int int30 = pricingRequest28.quantity();
        double double31 = pricingRequest28.basePrice();
        boolean boolean32 = pricingRequest28.firstOrder();
        java.lang.String str33 = pricingRequest28.toString();
        java.lang.String str34 = pricingRequest28.couponCode();
        boolean boolean35 = pricingRequest28.firstOrder();
        boolean boolean36 = pricingRequest28.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.toString();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.couponCode();
        int int16 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType21, true, "hi!", true, (int) (short) -1);
        int int27 = pricingRequest26.quantity();
        int int28 = pricingRequest26.quantity();
        int int29 = pricingRequest26.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType30, false, "hi!", false, (int) '#');
        double double36 = pricingRequest35.basePrice();
        boolean boolean37 = pricingRequest35.seasonalSale();
        boolean boolean38 = pricingRequest35.firstOrder();
        boolean boolean39 = pricingRequest7.equals((java.lang.Object) pricingRequest35);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        java.lang.String str15 = pricingRequest7.couponCode();
        double double16 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType43, true, "hi!", true, (int) (short) -1);
        java.lang.String str49 = pricingRequest48.couponCode();
        java.lang.String str50 = pricingRequest48.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType55, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType55, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = pricingRequest65.customerType();
        boolean boolean67 = pricingRequest65.firstOrder();
        int int68 = pricingRequest65.loyaltyPoints();
        boolean boolean69 = pricingRequest48.equals((java.lang.Object) int68);
        // The following exception was thrown during execution in test generation
        try {
            double double70 = pricingEngine0.calculateFinalPrice(pricingRequest48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str50, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        int int9 = pricingRequest8.quantity();
        int int10 = pricingRequest8.quantity();
        int int11 = pricingRequest8.quantity();
        int int12 = pricingRequest8.quantity();
        int int13 = pricingRequest8.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        boolean boolean14 = pricingRequest13.seasonalSale();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest27.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) -1, customerType28, false, "hi!", false, (int) (byte) -1);
        java.lang.String str34 = pricingRequest33.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType13, false, "hi!", false, (int) '#');
        int int19 = pricingRequest18.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        boolean boolean19 = pricingRequest18.seasonalSale();
        int int20 = pricingRequest18.quantity();
        double double21 = pricingRequest18.basePrice();
        boolean boolean22 = pricingRequest18.seasonalSale();
        boolean boolean23 = pricingRequest18.seasonalSale();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        int int25 = pricingRequest7.quantity();
        java.lang.String str26 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.seasonalSale();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.seasonalSale();
        boolean boolean26 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 0, customerType27, false, "", true, (int) '#');
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType47, true, "hi!", true, (int) (short) -1);
        boolean boolean53 = pricingRequest52.seasonalSale();
        boolean boolean55 = pricingRequest52.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest52.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType56, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '4', customerType56, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest74 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType69, false, "", true, (int) (byte) 100);
        int int75 = pricingRequest74.loyaltyPoints();
        double double76 = pricingRequest74.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType77 = pricingRequest74.customerType();
        boolean boolean78 = pricingRequest66.equals((java.lang.Object) pricingRequest74);
        boolean boolean79 = pricingRequest74.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double80 = pricingEngine0.calculateFinalPrice(pricingRequest74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType77 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType77.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.toString();
        java.lang.String str17 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType20, true, "hi!", true, (int) (short) -1);
        boolean boolean26 = pricingRequest25.seasonalSale();
        int int27 = pricingRequest25.quantity();
        int int28 = pricingRequest25.quantity();
        java.lang.String str29 = pricingRequest25.couponCode();
        boolean boolean30 = pricingRequest25.firstOrder();
        boolean boolean31 = pricingRequest14.equals((java.lang.Object) pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType38, true, "hi!", true, (int) (short) -1);
        int int44 = pricingRequest43.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = pricingRequest43.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType45, false, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 10, customerType45, false, "", true, 1);
        boolean boolean56 = pricingRequest25.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType59, true, "hi!", true, (int) (short) -1);
        int int65 = pricingRequest64.quantity();
        int int66 = pricingRequest64.quantity();
        int int67 = pricingRequest64.quantity();
        int int68 = pricingRequest64.loyaltyPoints();
        int int69 = pricingRequest64.quantity();
        int int70 = pricingRequest64.quantity();
        int int71 = pricingRequest64.quantity();
        boolean boolean72 = pricingRequest25.equals((java.lang.Object) int71);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '4', customerType15, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType28, false, "", true, (int) (byte) 100);
        int int34 = pricingRequest33.loyaltyPoints();
        double double35 = pricingRequest33.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest33.customerType();
        boolean boolean37 = pricingRequest25.equals((java.lang.Object) pricingRequest33);
        java.lang.String str38 = pricingRequest33.toString();
        double double39 = pricingRequest33.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType43, true, "hi!", true, (int) (short) -1);
        int int49 = pricingRequest48.quantity();
        int int50 = pricingRequest48.quantity();
        java.lang.String str51 = pricingRequest48.toString();
        int int52 = pricingRequest48.loyaltyPoints();
        java.lang.String str53 = pricingRequest48.toString();
        java.lang.String str54 = pricingRequest48.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double55 = pricingEngine0.calculateFinalPrice(pricingRequest48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str51, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str53, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str54, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        int int15 = pricingRequest14.loyaltyPoints();
        java.lang.String str16 = pricingRequest14.couponCode();
        int int17 = pricingRequest14.loyaltyPoints();
        java.lang.String str18 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str18, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType43, true, "hi!", true, (int) (short) -1);
        boolean boolean49 = pricingRequest48.seasonalSale();
        int int50 = pricingRequest48.quantity();
        double double51 = pricingRequest48.basePrice();
        boolean boolean52 = pricingRequest48.firstOrder();
        java.lang.String str53 = pricingRequest48.toString();
        int int54 = pricingRequest48.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double55 = pricingEngine0.calculateFinalPrice(pricingRequest48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 35.0d + "'", double51 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str53, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.loyaltyPoints();
        double double11 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean11 = pricingRequest9.firstOrder();
        boolean boolean12 = pricingRequest9.firstOrder();
        int int13 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean24 = pricingRequest21.equals((java.lang.Object) 100.0d);
        boolean boolean25 = pricingRequest21.seasonalSale();
        boolean boolean26 = pricingRequest9.equals((java.lang.Object) pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) -1, customerType27, true, "", false, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 1, customerType13, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        java.lang.String str29 = pricingRequest28.couponCode();
        double double30 = pricingRequest28.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest28.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        boolean boolean13 = pricingRequest9.seasonalSale();
        boolean boolean14 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 0, customerType15, false, "", true, (int) '#');
        int int21 = pricingRequest20.quantity();
        int int22 = pricingRequest20.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        int int29 = pricingRequest28.quantity();
        int int30 = pricingRequest28.quantity();
        java.lang.String str31 = pricingRequest28.toString();
        int int32 = pricingRequest28.loyaltyPoints();
        java.lang.String str33 = pricingRequest28.toString();
        boolean boolean34 = pricingRequest28.firstOrder();
        java.lang.String str35 = pricingRequest28.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double36 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str31, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 1L);
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        int int10 = pricingRequest7.quantity();
        double double11 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        boolean boolean14 = pricingRequest13.seasonalSale();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType17, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str12 = pricingRequest7.couponCode();
        double double13 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType18, true, "hi!", true, (int) (short) -1);
        boolean boolean24 = pricingRequest23.seasonalSale();
        boolean boolean26 = pricingRequest23.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest23.customerType();
        java.lang.String str28 = pricingRequest23.toString();
        java.lang.String str29 = pricingRequest23.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 10, customerType30, false, "hi!", true, (int) 'a');
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) true);
        double double37 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str28, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 35.0d + "'", double37 == 35.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType43, true, "hi!", true, (int) (short) -1);
        java.lang.String str49 = pricingRequest48.couponCode();
        java.lang.String str50 = pricingRequest48.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest48.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType54, true, "hi!", true, (int) (short) -1);
        boolean boolean60 = pricingRequest59.seasonalSale();
        int int61 = pricingRequest59.quantity();
        double double62 = pricingRequest59.basePrice();
        boolean boolean63 = pricingRequest59.seasonalSale();
        boolean boolean64 = pricingRequest59.seasonalSale();
        boolean boolean65 = pricingRequest48.equals((java.lang.Object) pricingRequest59);
        double double66 = pricingRequest59.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double67 = pricingEngine0.calculateFinalPrice(pricingRequest59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str50, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 35.0d + "'", double62 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 35.0d + "'", double66 == 35.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (byte) -1, customerType11, false, "", false, 97);
        boolean boolean17 = pricingRequest16.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        java.lang.String str21 = pricingRequest20.couponCode();
        java.lang.String str22 = pricingRequest20.toString();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest20);
        java.lang.String str24 = pricingRequest20.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        double double11 = pricingRequest7.basePrice();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        boolean boolean11 = pricingRequest8.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        boolean boolean14 = pricingRequest13.seasonalSale();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest27.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) -1, customerType28, false, "hi!", false, (int) (byte) -1);
        java.lang.Class<?> wildcardClass34 = pricingRequest33.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        int int20 = pricingRequest19.quantity();
        int int21 = pricingRequest19.quantity();
        java.lang.String str22 = pricingRequest19.toString();
        int int23 = pricingRequest19.loyaltyPoints();
        java.lang.String str24 = pricingRequest19.toString();
        boolean boolean25 = pricingRequest19.firstOrder();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) boolean25);
        int int27 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.String str10 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType6, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, (int) (short) 1, customerType17, true, "", false, (int) (short) -1);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean31 = pricingRequest28.equals((java.lang.Object) 100.0d);
        boolean boolean32 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType35, true, "hi!", true, (int) (short) -1);
        int int41 = pricingRequest40.quantity();
        int int42 = pricingRequest40.quantity();
        java.lang.String str43 = pricingRequest40.toString();
        int int44 = pricingRequest40.loyaltyPoints();
        java.lang.String str45 = pricingRequest40.toString();
        boolean boolean46 = pricingRequest40.firstOrder();
        boolean boolean47 = pricingRequest28.equals((java.lang.Object) boolean46);
        boolean boolean48 = pricingRequest28.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double49 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str43, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str45, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        java.lang.String str12 = pricingRequest9.toString();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.toString();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType16, false, "", true, (int) (short) -1);
        java.lang.String str22 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean30 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType33, true, "hi!", true, (int) (short) -1);
        boolean boolean39 = pricingRequest38.seasonalSale();
        int int40 = pricingRequest38.quantity();
        double double41 = pricingRequest38.basePrice();
        boolean boolean42 = pricingRequest38.seasonalSale();
        boolean boolean43 = pricingRequest38.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest38.customerType();
        boolean boolean45 = pricingRequest28.equals((java.lang.Object) pricingRequest38);
        boolean boolean46 = pricingRequest38.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest38.customerType();
        double double48 = pricingRequest38.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double49 = pricingEngine0.calculateFinalPrice(pricingRequest38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 35.0d + "'", double41 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 35.0d + "'", double48 == 35.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        boolean boolean21 = pricingRequest20.seasonalSale();
        boolean boolean23 = pricingRequest20.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest20.customerType();
        java.lang.String str25 = pricingRequest20.toString();
        double double26 = pricingRequest20.basePrice();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) double26);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType15, false, "hi!", false, (int) '#');
        int int26 = pricingRequest25.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        double double14 = pricingRequest9.basePrice();
        int int15 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (byte) 100, customerType16, false, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        boolean boolean31 = pricingRequest30.seasonalSale();
        boolean boolean32 = pricingRequest30.firstOrder();
        double double33 = pricingRequest30.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType34, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType18, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType18, true, "hi!", true, 100);
        int int29 = pricingRequest28.loyaltyPoints();
        int int30 = pricingRequest28.loyaltyPoints();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) int30);
        java.lang.String str32 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        boolean boolean13 = pricingRequest9.seasonalSale();
        boolean boolean14 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 1, customerType15, false, "hi!", false, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean11 = pricingRequest9.firstOrder();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType13, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = pricingRequest18.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType47, true, "hi!", true, (int) (short) -1);
        boolean boolean53 = pricingRequest52.seasonalSale();
        boolean boolean55 = pricingRequest52.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest52.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType56, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, (int) '#', customerType56, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, 0);
        boolean boolean67 = pricingRequest66.seasonalSale();
        double double68 = pricingEngine0.calculateFinalPrice(pricingRequest66);
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1336.59d + "'", double68 == 1336.59d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 1L);
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        boolean boolean16 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        int int19 = pricingRequest18.quantity();
        int int20 = pricingRequest18.quantity();
        java.lang.String str21 = pricingRequest18.toString();
        int int22 = pricingRequest18.loyaltyPoints();
        java.lang.String str23 = pricingRequest18.toString();
        boolean boolean24 = pricingRequest18.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest18.customerType();
        int int26 = pricingRequest18.quantity();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) int26);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str21, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        boolean boolean16 = pricingRequest7.firstOrder();
        boolean boolean17 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        int int10 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean31 = pricingRequest28.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        java.lang.String str33 = pricingRequest28.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double34 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        double double25 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        int int13 = pricingRequest9.quantity();
        java.lang.String str14 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 10, customerType16, true, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.couponCode();
        double double16 = pricingRequest7.basePrice();
        double double17 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.couponCode();
        int int16 = pricingRequest7.quantity();
        java.lang.String str17 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        boolean boolean15 = pricingRequest7.seasonalSale();
        int int16 = pricingRequest7.quantity();
        boolean boolean17 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (byte) 10, customerType15, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, 0);
        java.lang.String str26 = pricingRequest25.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        int int20 = pricingRequest19.quantity();
        int int21 = pricingRequest19.quantity();
        int int22 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 0, customerType23, false, "hi!", false, (int) 'a');
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        boolean boolean14 = pricingRequest13.seasonalSale();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, (int) ' ', customerType17, false, "", true, 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest32.customerType();
        java.lang.String str34 = pricingRequest32.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        boolean boolean33 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType34, false, "", true, (int) (byte) 10);
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType45, true, "hi!", true, (int) (short) -1);
        boolean boolean51 = pricingRequest50.seasonalSale();
        int int52 = pricingRequest50.quantity();
        double double53 = pricingRequest50.basePrice();
        boolean boolean54 = pricingRequest50.seasonalSale();
        boolean boolean55 = pricingRequest50.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest50.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 0, customerType56, false, "", true, (int) '#');
        int int62 = pricingRequest61.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType65, true, "hi!", true, (int) (short) -1);
        boolean boolean71 = pricingRequest70.seasonalSale();
        boolean boolean73 = pricingRequest70.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = pricingRequest70.customerType();
        boolean boolean75 = pricingRequest70.seasonalSale();
        boolean boolean76 = pricingRequest61.equals((java.lang.Object) pricingRequest70);
        // The following exception was thrown during execution in test generation
        try {
            double double77 = pricingEngine0.calculateFinalPrice(pricingRequest61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.29d + "'", double40 == 15.29d);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 35.0d + "'", double53 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        java.lang.String str14 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType17, true, "hi!", true, (int) (short) -1);
        boolean boolean23 = pricingRequest22.seasonalSale();
        boolean boolean24 = pricingRequest22.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType27, true, "hi!", true, (int) (short) -1);
        int int33 = pricingRequest32.quantity();
        int int34 = pricingRequest32.quantity();
        int int35 = pricingRequest32.quantity();
        double double36 = pricingRequest32.basePrice();
        boolean boolean37 = pricingRequest22.equals((java.lang.Object) pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType42, true, "hi!", true, (int) (short) -1);
        int int48 = pricingRequest47.quantity();
        int int49 = pricingRequest47.quantity();
        int int50 = pricingRequest47.quantity();
        int int51 = pricingRequest47.loyaltyPoints();
        int int52 = pricingRequest47.quantity();
        int int53 = pricingRequest47.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest47.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 1, customerType54, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        boolean boolean60 = pricingRequest22.equals((java.lang.Object) pricingRequest59);
        boolean boolean61 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 35.0d + "'", double36 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        int int19 = pricingRequest17.quantity();
        double double20 = pricingRequest17.basePrice();
        boolean boolean21 = pricingRequest17.seasonalSale();
        boolean boolean22 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest17.customerType();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest7.customerType();
        java.lang.String str26 = pricingRequest7.toString();
        int int27 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        int int30 = pricingRequest28.quantity();
        double double31 = pricingRequest28.basePrice();
        boolean boolean32 = pricingRequest28.firstOrder();
        java.lang.String str33 = pricingRequest28.toString();
        int int34 = pricingRequest28.loyaltyPoints();
        boolean boolean35 = pricingRequest28.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double36 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean13 = pricingRequest7.seasonalSale();
        java.lang.String str14 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        double double14 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.couponCode();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        java.lang.String str12 = pricingRequest9.toString();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.toString();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType16, false, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType26, true, "hi!", true, (int) (short) -1);
        int int32 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest31.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType33, false, "", true, (int) (short) -1);
        int int39 = pricingRequest38.loyaltyPoints();
        int int40 = pricingRequest38.quantity();
        boolean boolean41 = pricingRequest21.equals((java.lang.Object) pricingRequest38);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest7.customerType();
        double double21 = pricingRequest7.basePrice();
        double double22 = pricingRequest7.basePrice();
        boolean boolean23 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        boolean boolean14 = pricingRequest13.seasonalSale();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, (int) ' ', customerType17, false, "", true, 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest32.customerType();
        boolean boolean34 = pricingRequest32.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean22 = pricingRequest19.equals((java.lang.Object) 100.0d);
        boolean boolean23 = pricingRequest19.seasonalSale();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str25 = pricingRequest19.toString();
        java.lang.String str26 = pricingRequest19.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType11, false, "", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        int int18 = pricingRequest16.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        java.lang.String str14 = pricingRequest11.toString();
        int int15 = pricingRequest11.loyaltyPoints();
        java.lang.String str16 = pricingRequest11.toString();
        boolean boolean17 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) 'a', customerType18, true, "", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType18, false, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        java.lang.String str9 = pricingRequest8.couponCode();
        int int10 = pricingRequest8.loyaltyPoints();
        java.lang.String str11 = pricingRequest8.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        double double14 = pricingRequest7.basePrice();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        boolean boolean21 = pricingRequest20.seasonalSale();
        int int22 = pricingRequest20.quantity();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.seasonalSale();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) boolean24);
        boolean boolean26 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass27 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType14, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest24.customerType();
        boolean boolean26 = pricingRequest24.firstOrder();
        int int27 = pricingRequest24.loyaltyPoints();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) int27);
        java.lang.String str29 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass30 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        int int30 = pricingRequest28.quantity();
        double double31 = pricingRequest28.basePrice();
        boolean boolean32 = pricingRequest28.firstOrder();
        java.lang.String str33 = pricingRequest28.toString();
        int int34 = pricingRequest28.loyaltyPoints();
        java.lang.String str35 = pricingRequest28.couponCode();
        int int36 = pricingRequest28.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass10 = customerType9.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        boolean boolean21 = pricingRequest20.seasonalSale();
        int int22 = pricingRequest20.quantity();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.seasonalSale();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) boolean24);
        boolean boolean26 = pricingRequest7.firstOrder();
        int int27 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        boolean boolean10 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 1L);
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.toString();
        boolean boolean17 = pricingRequest14.seasonalSale();
        boolean boolean18 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        java.lang.String str12 = pricingRequest9.toString();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.toString();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType16, false, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType24, true, "hi!", true, (int) (short) -1);
        java.lang.String str30 = pricingRequest29.couponCode();
        int int31 = pricingRequest29.loyaltyPoints();
        java.lang.String str32 = pricingRequest29.couponCode();
        boolean boolean33 = pricingRequest21.equals((java.lang.Object) str32);
        java.lang.String str34 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str34, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        int int12 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        java.lang.String str29 = pricingRequest28.couponCode();
        java.lang.String str30 = pricingRequest28.toString();
        boolean boolean31 = pricingRequest28.seasonalSale();
        boolean boolean33 = pricingRequest28.equals((java.lang.Object) 7.99d);
        java.lang.String str34 = pricingRequest28.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType11, false, "", true, (int) (short) -1);
        int int17 = pricingRequest16.loyaltyPoints();
        int int18 = pricingRequest16.quantity();
        double double19 = pricingRequest16.basePrice();
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = pricingRequest16.equals(obj20);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        int int13 = pricingRequest9.loyaltyPoints();
        int int14 = pricingRequest9.quantity();
        int int15 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', 100, customerType16, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (-1));
        java.lang.String str22 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str22, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        double double14 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        int int14 = pricingRequest13.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType15, false, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) '4', customerType15, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 10, customerType15, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        double double14 = pricingRequest7.basePrice();
        java.lang.String str15 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType23, false, "", true, (int) (byte) 100);
        int int29 = pricingRequest28.loyaltyPoints();
        double double30 = pricingRequest28.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest28.customerType();
        int int32 = pricingRequest28.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = pricingEngine0.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType13, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.String str14 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType5, true, "hi!", true, (int) (short) -1);
        int int11 = pricingRequest10.quantity();
        int int12 = pricingRequest10.quantity();
        int int13 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType14, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean30 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType33, true, "hi!", true, (int) (short) -1);
        boolean boolean39 = pricingRequest38.seasonalSale();
        int int40 = pricingRequest38.quantity();
        double double41 = pricingRequest38.basePrice();
        boolean boolean42 = pricingRequest38.seasonalSale();
        boolean boolean43 = pricingRequest38.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest38.customerType();
        boolean boolean45 = pricingRequest28.equals((java.lang.Object) pricingRequest38);
        boolean boolean46 = pricingRequest38.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest38.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double48 = pricingEngine0.calculateFinalPrice(pricingRequest38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 35.0d + "'", double41 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        int int16 = pricingRequest14.quantity();
        java.lang.String str17 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType13, true, "hi!", true, (int) (short) -1);
        boolean boolean19 = pricingRequest18.seasonalSale();
        int int20 = pricingRequest18.quantity();
        double double21 = pricingRequest18.basePrice();
        boolean boolean22 = pricingRequest18.seasonalSale();
        boolean boolean23 = pricingRequest18.seasonalSale();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType27, true, "hi!", true, (int) (short) -1);
        boolean boolean33 = pricingRequest32.seasonalSale();
        boolean boolean34 = pricingRequest32.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType37, true, "hi!", true, (int) (short) -1);
        boolean boolean43 = pricingRequest42.seasonalSale();
        int int44 = pricingRequest42.quantity();
        double double45 = pricingRequest42.basePrice();
        boolean boolean46 = pricingRequest42.seasonalSale();
        boolean boolean47 = pricingRequest42.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest42.customerType();
        boolean boolean49 = pricingRequest32.equals((java.lang.Object) pricingRequest42);
        boolean boolean50 = pricingRequest42.firstOrder();
        java.lang.String str51 = pricingRequest42.toString();
        boolean boolean52 = pricingRequest18.equals((java.lang.Object) pricingRequest42);
        boolean boolean53 = pricingRequest18.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 35.0d + "'", double45 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str51, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }
}

