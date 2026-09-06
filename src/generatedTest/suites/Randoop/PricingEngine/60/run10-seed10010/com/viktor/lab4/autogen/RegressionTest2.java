package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType6, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (short) 0, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        boolean boolean22 = pricingRequest21.firstOrder();
        double double23 = pricingRequest21.basePrice();
        boolean boolean24 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 32.0d + "'", double23 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 100L);
        boolean boolean13 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 0, customerType2, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType10, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType10, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType10, false, "hi!", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) ' ', customerType10, true, "", false, 1);
        boolean boolean36 = pricingRequest35.firstOrder();
        boolean boolean37 = pricingRequest35.seasonalSale();
        java.lang.String str38 = pricingRequest35.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=0.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=1]" + "'", str38, "PricingRequest[basePrice=0.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=1]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        double double12 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.firstOrder();
        int int14 = pricingRequest7.loyaltyPoints();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine9 = new com.viktor.lab4.PricingEngine();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) pricingEngine9);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType21, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType21, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) '#', customerType21, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType21, true, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType21, false, "", false, 97);
        double double47 = pricingEngine9.calculateFinalPrice(pricingRequest46);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType50, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest55.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest55.customerType();
        double double58 = pricingRequest55.basePrice();
        int int59 = pricingRequest55.quantity();
        double double60 = pricingRequest55.basePrice();
        java.lang.String str61 = pricingRequest55.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType64, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest69.customerType();
        boolean boolean71 = pricingRequest69.seasonalSale();
        boolean boolean72 = pricingRequest69.seasonalSale();
        boolean boolean73 = pricingRequest69.firstOrder();
        java.lang.String str74 = pricingRequest69.toString();
        boolean boolean75 = pricingRequest55.equals((java.lang.Object) pricingRequest69);
        // The following exception was thrown during execution in test generation
        try {
            double double76 = pricingEngine9.calculateFinalPrice(pricingRequest55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 7.99d + "'", double47 == 7.99d);
        org.junit.Assert.assertNull(customerType56);
        org.junit.Assert.assertNull(customerType57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str61, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str74, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 100, customerType17, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 1);
        double double23 = pricingRequest22.basePrice();
        int int24 = pricingRequest22.loyaltyPoints();
        java.lang.String str25 = pricingRequest22.toString();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        boolean boolean27 = pricingRequest22.firstOrder();
        java.lang.String str28 = pricingRequest22.couponCode();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=1]" + "'", str25, "PricingRequest[basePrice=10.0, quantity=100, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str28, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType12, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType12, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) '#', customerType12, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType12, true, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType12, false, "", false, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) '#', customerType12, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=100], firstOrder=true, loyaltyPoints=52]", true, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType17, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType17, false, "hi!", true, (int) (short) -1);
        boolean boolean33 = pricingRequest32.firstOrder();
        double double34 = pricingRequest32.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType37, true, "", true, (int) (short) -1);
        boolean boolean44 = pricingRequest42.equals((java.lang.Object) false);
        int int45 = pricingRequest42.quantity();
        java.lang.String str46 = pricingRequest42.toString();
        boolean boolean47 = pricingRequest32.equals((java.lang.Object) str46);
        double double48 = pricingRequest32.basePrice();
        boolean boolean49 = pricingRequest7.equals((java.lang.Object) pricingRequest32);
        java.lang.String str50 = pricingRequest32.couponCode();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str46, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        int int14 = pricingRequest7.quantity();
        java.lang.String str15 = pricingRequest7.couponCode();
        int int16 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType19, true, "", true, (int) (short) -1);
        boolean boolean25 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType28, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        boolean boolean35 = pricingRequest24.equals((java.lang.Object) customerType34);
        double double36 = pricingRequest24.basePrice();
        boolean boolean37 = pricingRequest24.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest24.customerType();
        int int39 = pricingRequest24.loyaltyPoints();
        double double40 = pricingRequest24.basePrice();
        boolean boolean41 = pricingRequest7.equals((java.lang.Object) double40);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType45, true, "", true, (int) (short) -1);
        boolean boolean52 = pricingRequest50.equals((java.lang.Object) false);
        java.lang.String str53 = pricingRequest50.toString();
        java.lang.String str54 = pricingRequest50.couponCode();
        java.lang.Object obj55 = null;
        boolean boolean56 = pricingRequest50.equals(obj55);
        boolean boolean57 = pricingRequest50.seasonalSale();
        boolean boolean58 = pricingRequest50.firstOrder();
        boolean boolean59 = pricingRequest7.equals((java.lang.Object) pricingRequest50);
        boolean boolean60 = pricingRequest7.firstOrder();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(customerType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(customerType42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str53, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 100, customerType2, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        boolean boolean18 = pricingRequest16.seasonalSale();
        boolean boolean19 = pricingRequest16.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest16.customerType();
        boolean boolean21 = pricingRequest16.seasonalSale();
        double double22 = pricingRequest16.basePrice();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) double22);
        int int24 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        boolean boolean14 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType19, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType19, true, "", true, (int) (short) 1);
        java.lang.String str30 = pricingRequest29.couponCode();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) pricingRequest29);
        int int32 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType3, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int9 = pricingRequest8.quantity();
        double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType13, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int19 = pricingRequest18.quantity();
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest18);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType23, false, "", true, (int) (byte) 1);
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        boolean boolean30 = pricingRequest28.seasonalSale();
        int int31 = pricingRequest28.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6312.99d + "'", double20 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7.99d + "'", double29 == 7.99d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType4, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 0, customerType11, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 0);
        double double17 = pricingRequest16.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType10, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType10, false, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (-1), customerType10, false, "hi!", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '4', customerType10, true, "hi!", false, (int) (short) -1);
        java.lang.String str36 = pricingRequest35.toString();
        boolean boolean37 = pricingRequest35.seasonalSale();
        double double38 = pricingRequest35.basePrice();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str36, "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType29, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType29, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType29, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (short) 1, customerType29, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) 10, customerType29, false, "", false, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType59, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 10, customerType59, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 97);
        boolean boolean70 = pricingRequest54.equals((java.lang.Object) false);
        boolean boolean71 = pricingRequest54.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) 1, customerType72, false, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest82 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 0, customerType72, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest87 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (short) 100, customerType72, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=32.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", false, (int) (byte) -1);
        boolean boolean88 = pricingRequest7.equals((java.lang.Object) customerType72);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        boolean boolean18 = pricingRequest7.equals((java.lang.Object) customerType17);
        java.lang.String str19 = pricingRequest7.couponCode();
        boolean boolean20 = pricingRequest7.seasonalSale();
        double double21 = pricingRequest7.basePrice();
        int int22 = pricingRequest7.loyaltyPoints();
        int int23 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType3, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int9 = pricingRequest8.quantity();
        double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType17, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType17, false, "", false, 10);
        boolean boolean33 = pricingRequest32.firstOrder();
        double double34 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType37, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest42.customerType();
        boolean boolean44 = pricingRequest42.seasonalSale();
        boolean boolean46 = pricingRequest42.equals((java.lang.Object) 0.0f);
        java.lang.String str47 = pricingRequest42.toString();
        boolean boolean48 = pricingRequest42.seasonalSale();
        int int49 = pricingRequest42.quantity();
        double double50 = pricingRequest42.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType53, true, "", true, (int) (short) -1);
        boolean boolean60 = pricingRequest58.equals((java.lang.Object) false);
        java.lang.String str61 = pricingRequest58.toString();
        double double62 = pricingRequest58.basePrice();
        boolean boolean63 = pricingRequest58.seasonalSale();
        int int64 = pricingRequest58.loyaltyPoints();
        boolean boolean65 = pricingRequest42.equals((java.lang.Object) pricingRequest58);
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = pricingRequest42.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double67 = pricingEngine0.calculateFinalPrice(pricingRequest42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 8.87d + "'", double34 == 8.87d);
        org.junit.Assert.assertNull(customerType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str61, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(customerType66);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType15, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        int int22 = pricingRequest20.loyaltyPoints();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) int22);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        boolean boolean25 = pricingRequest7.firstOrder();
        double double26 = pricingRequest7.basePrice();
        java.lang.String str27 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (-1), customerType4, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 10);
        java.lang.String str15 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        boolean boolean17 = pricingRequest14.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]" + "'", str15, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType20, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) '4', customerType20, false, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest30.customerType();
        int int32 = pricingRequest30.quantity();
        double double33 = pricingRequest30.basePrice();
        boolean boolean34 = pricingRequest30.firstOrder();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) pricingRequest30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType11, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 1, customerType11, false, "hi!", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType11, false, "", false, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, 0, customerType27, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) '#', customerType27, true, "PricingRequest[basePrice=10.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=52]", false, (int) (short) 0);
        double double38 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType41, true, "", true, (int) (short) -1);
        boolean boolean48 = pricingRequest46.equals((java.lang.Object) false);
        double double49 = pricingRequest46.basePrice();
        int int50 = pricingRequest46.quantity();
        double double51 = pricingRequest46.basePrice();
        boolean boolean52 = pricingRequest46.firstOrder();
        int int53 = pricingRequest46.loyaltyPoints();
        double double54 = pricingRequest46.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double55 = pricingEngine0.calculateFinalPrice(pricingRequest46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 270.49d + "'", double38 == 270.49d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType4, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) '4', customerType4, false, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (-1));
        boolean boolean15 = pricingRequest14.firstOrder();
        int int16 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType4, true, "hi!", true, (int) (byte) 0);
        java.lang.String str15 = pricingRequest14.toString();
        boolean boolean16 = pricingRequest14.firstOrder();
        double double17 = pricingRequest14.basePrice();
        java.lang.String str18 = pricingRequest14.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 10, customerType23, false, "PricingRequest[basePrice=10.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=52]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest28.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) 'a', customerType29, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]", false, 35);
        boolean boolean35 = pricingRequest14.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.quantity();
        boolean boolean15 = pricingRequest7.seasonalSale();
        int int16 = pricingRequest7.quantity();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType13, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        boolean boolean20 = pricingRequest18.seasonalSale();
        boolean boolean22 = pricingRequest18.equals((java.lang.Object) 0.0f);
        java.lang.String str23 = pricingRequest18.couponCode();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType33, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType33, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType33, false, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (-1), customerType33, false, "hi!", true, (int) (byte) 100);
        java.lang.String str54 = pricingRequest53.toString();
        boolean boolean55 = pricingRequest53.firstOrder();
        boolean boolean56 = pricingRequest18.equals((java.lang.Object) boolean55);
        java.lang.String str57 = pricingRequest18.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest18.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str54, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str57, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType58);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        double double9 = pricingRequest7.basePrice();
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType8, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (short) 0, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (byte) 100, customerType24, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) ' ');
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType18, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType18, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (short) 0, customerType18, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = customerType18.getClass();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) wildcardClass34);
        java.lang.String str36 = pricingRequest7.toString();
        java.lang.String str37 = pricingRequest7.couponCode();
        double double38 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str36, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType14, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        boolean boolean21 = pricingRequest19.seasonalSale();
        boolean boolean23 = pricingRequest19.equals((java.lang.Object) 0.0f);
        int int24 = pricingRequest19.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest19.customerType();
        boolean boolean26 = pricingRequest19.seasonalSale();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        boolean boolean28 = pricingRequest19.firstOrder();
        int int29 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest19.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(customerType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNull(customerType30);
        org.junit.Assert.assertNull(customerType31);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType6, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 1, customerType6, false, "hi!", true, 0);
        double double17 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 0, customerType18, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 10);
        java.lang.String str24 = pricingRequest23.couponCode();
        int int25 = pricingRequest23.loyaltyPoints();
        boolean boolean26 = pricingRequest23.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType14, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType14, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) '#', customerType14, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType14, true, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType14, false, "", false, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 10, customerType14, false, "", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 10, customerType14, true, "PricingRequest[basePrice=97.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", false, 97);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType8, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (short) 0, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 100, customerType24, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean30 = pricingRequest29.seasonalSale();
        boolean boolean31 = pricingRequest29.firstOrder();
        java.lang.String str32 = pricingRequest29.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType2, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        double double13 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType16, true, "", true, (int) (short) -1);
        boolean boolean23 = pricingRequest21.equals((java.lang.Object) false);
        int int24 = pricingRequest21.quantity();
        java.lang.String str25 = pricingRequest21.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType28, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        int int36 = pricingRequest33.loyaltyPoints();
        int int37 = pricingRequest33.quantity();
        boolean boolean38 = pricingRequest21.equals((java.lang.Object) pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest21.customerType();
        boolean boolean40 = pricingRequest21.firstOrder();
        int int41 = pricingRequest21.loyaltyPoints();
        int int42 = pricingRequest21.quantity();
        boolean boolean43 = pricingRequest7.equals((java.lang.Object) int42);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertNull(customerType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(customerType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType14, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        int int22 = pricingRequest19.loyaltyPoints();
        int int23 = pricingRequest19.quantity();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str25 = pricingRequest19.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType15, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        int int22 = pricingRequest20.loyaltyPoints();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) int22);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        boolean boolean25 = pricingRequest7.firstOrder();
        double double26 = pricingRequest7.basePrice();
        int int27 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType4, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 97, customerType10, false, "hi!", false, 100);
        int int16 = pricingRequest15.quantity();
        int int17 = pricingRequest15.quantity();
        boolean boolean18 = pricingRequest15.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 10, customerType2, false, "PricingRequest[basePrice=10.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=52]", true, (int) (short) 100);
        boolean boolean8 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.firstOrder();
        int int15 = pricingRequest7.quantity();
        java.lang.String str16 = pricingRequest7.toString();
        int int17 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType12, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 1, customerType12, false, "hi!", true, 0);
        double double23 = pricingRequest22.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType24, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType24, false, "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(97.0d, (int) (byte) 0, customerType24, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, 35, customerType24, true, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType4, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(8.87d, (int) (byte) 0, customerType4, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 1);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType14, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        int int22 = pricingRequest19.loyaltyPoints();
        int int23 = pricingRequest19.quantity();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        double double25 = pricingRequest7.basePrice();
        int int26 = pricingRequest7.quantity();
        java.lang.String str27 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType8, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType8, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType8, false, "hi!", false, (int) (short) 0);
        int int29 = pricingRequest28.quantity();
        boolean boolean30 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType33, true, "", true, (int) (short) -1);
        boolean boolean40 = pricingRequest38.equals((java.lang.Object) false);
        java.lang.String str41 = pricingRequest38.toString();
        int int42 = pricingRequest38.loyaltyPoints();
        java.lang.String str43 = pricingRequest38.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType46, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest51.customerType();
        boolean boolean53 = pricingRequest51.seasonalSale();
        double double54 = pricingRequest51.basePrice();
        boolean boolean55 = pricingRequest51.seasonalSale();
        boolean boolean56 = pricingRequest38.equals((java.lang.Object) pricingRequest51);
        boolean boolean57 = pricingRequest28.equals((java.lang.Object) boolean56);
        int int58 = pricingRequest28.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str41, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str43, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType15, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        boolean boolean22 = pricingRequest20.seasonalSale();
        boolean boolean24 = pricingRequest20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest20);
        int int26 = pricingRequest7.loyaltyPoints();
        java.lang.String str27 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType14, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        java.lang.String str20 = pricingRequest19.couponCode();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        int int22 = pricingRequest7.quantity();
        int int23 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        int int25 = pricingRequest7.quantity();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType3, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int9 = pricingRequest8.quantity();
        double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType13, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        java.lang.String str19 = pricingRequest18.toString();
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest18);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType23, true, "", true, (int) (short) -1);
        boolean boolean30 = pricingRequest28.equals((java.lang.Object) false);
        java.lang.String str31 = pricingRequest28.toString();
        java.lang.String str32 = pricingRequest28.couponCode();
        java.lang.Object obj33 = null;
        boolean boolean34 = pricingRequest28.equals(obj33);
        boolean boolean35 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType40, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType40, true, "", true, (int) (short) 1);
        java.lang.String str51 = pricingRequest50.couponCode();
        boolean boolean52 = pricingRequest28.equals((java.lang.Object) pricingRequest50);
        java.lang.String str53 = pricingRequest50.toString();
        double double54 = pricingEngine0.calculateFinalPrice(pricingRequest50);
        boolean boolean55 = pricingRequest50.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.99d + "'", double20 == 7.99d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str31, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=10.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]" + "'", str53, "PricingRequest[basePrice=10.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 72.99d + "'", double54 == 72.99d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 100, customerType2, true, "PricingRequest[basePrice=97.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (-1), customerType10, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double16 = pricingRequest15.basePrice();
        int int17 = pricingRequest15.loyaltyPoints();
        java.lang.Class<?> wildcardClass18 = pricingRequest15.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        boolean boolean18 = pricingRequest7.equals((java.lang.Object) customerType17);
        java.lang.String str19 = pricingRequest7.couponCode();
        boolean boolean20 = pricingRequest7.seasonalSale();
        double double21 = pricingRequest7.basePrice();
        java.lang.String str22 = pricingRequest7.couponCode();
        boolean boolean23 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.String str15 = pricingRequest7.toString();
        int int16 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType2, false, "", true, (int) (byte) 1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType11, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        java.lang.String str19 = pricingRequest16.couponCode();
        java.lang.String str20 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        double double22 = pricingRequest16.basePrice();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest16);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str18, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType4, true, "hi!", true, (int) (byte) 0);
        java.lang.String str15 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType18, true, "", true, (int) (short) -1);
        boolean boolean25 = pricingRequest23.equals((java.lang.Object) false);
        java.lang.String str26 = pricingRequest23.toString();
        double double27 = pricingRequest23.basePrice();
        int int28 = pricingRequest23.loyaltyPoints();
        java.lang.String str29 = pricingRequest23.couponCode();
        int int30 = pricingRequest23.loyaltyPoints();
        java.lang.String str31 = pricingRequest23.couponCode();
        int int32 = pricingRequest23.loyaltyPoints();
        boolean boolean33 = pricingRequest14.equals((java.lang.Object) int32);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType36, true, "", true, (int) (short) -1);
        boolean boolean43 = pricingRequest41.equals((java.lang.Object) false);
        java.lang.String str44 = pricingRequest41.toString();
        boolean boolean45 = pricingRequest14.equals((java.lang.Object) pricingRequest41);
        boolean boolean46 = pricingRequest41.firstOrder();
        boolean boolean47 = pricingRequest41.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest41.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str44, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(customerType48);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        java.lang.String str18 = pricingRequest16.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest16.customerType();
        boolean boolean20 = pricingRequest7.equals((java.lang.Object) customerType19);
        boolean boolean21 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        int int14 = pricingRequest7.quantity();
        java.lang.String str15 = pricingRequest7.couponCode();
        int int16 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType19, true, "", true, (int) (short) -1);
        boolean boolean25 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType28, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        boolean boolean35 = pricingRequest24.equals((java.lang.Object) customerType34);
        double double36 = pricingRequest24.basePrice();
        boolean boolean37 = pricingRequest24.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest24.customerType();
        int int39 = pricingRequest24.loyaltyPoints();
        double double40 = pricingRequest24.basePrice();
        boolean boolean41 = pricingRequest7.equals((java.lang.Object) double40);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType45, true, "", true, (int) (short) -1);
        boolean boolean52 = pricingRequest50.equals((java.lang.Object) false);
        java.lang.String str53 = pricingRequest50.toString();
        java.lang.String str54 = pricingRequest50.couponCode();
        java.lang.Object obj55 = null;
        boolean boolean56 = pricingRequest50.equals(obj55);
        boolean boolean57 = pricingRequest50.seasonalSale();
        boolean boolean58 = pricingRequest50.firstOrder();
        boolean boolean59 = pricingRequest7.equals((java.lang.Object) pricingRequest50);
        double double60 = pricingRequest50.basePrice();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(customerType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(customerType42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str53, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.quantity();
        double double13 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNull(customerType14);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType10, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType10, false, "hi!", true, (int) (short) -1);
        boolean boolean26 = pricingRequest25.firstOrder();
        boolean boolean27 = pricingRequest25.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType28, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType28, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]", false, 0);
        java.lang.Class<?> wildcardClass39 = pricingRequest38.getClass();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.quantity();
        double double15 = pricingRequest7.basePrice();
        int int16 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType8, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType8, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType8, false, "hi!", false, (int) (short) 0);
        int int29 = pricingRequest28.quantity();
        boolean boolean30 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest28.customerType();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int23 = pricingRequest22.quantity();
        boolean boolean24 = pricingRequest22.firstOrder();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(customerType26);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType14, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType14, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType14, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType14, false, "hi!", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) ' ', customerType14, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (byte) 0, customerType14, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=35]", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (short) 0, customerType14, true, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        boolean boolean50 = pricingRequest49.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType8, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType8, false, "hi!", true, (int) (short) -1);
        boolean boolean24 = pricingRequest23.firstOrder();
        boolean boolean25 = pricingRequest23.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) ' ', customerType26, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]", false, 35);
        java.lang.String str32 = pricingRequest31.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]" + "'", str32, "PricingRequest[basePrice=100.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType15, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        boolean boolean22 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest20.customerType();
        boolean boolean24 = pricingRequest20.seasonalSale();
        int int25 = pricingRequest20.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType28, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        boolean boolean35 = pricingRequest33.seasonalSale();
        boolean boolean37 = pricingRequest33.equals((java.lang.Object) 0.0f);
        boolean boolean38 = pricingRequest20.equals((java.lang.Object) pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType41, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest46.customerType();
        int int48 = pricingRequest46.quantity();
        boolean boolean49 = pricingRequest46.seasonalSale();
        boolean boolean50 = pricingRequest33.equals((java.lang.Object) pricingRequest46);
        boolean boolean51 = pricingRequest7.equals((java.lang.Object) pricingRequest33);
        int int52 = pricingRequest7.loyaltyPoints();
        double double53 = pricingRequest7.basePrice();
        double double54 = pricingRequest7.basePrice();
        double double55 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType60, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (-1), customerType60, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]", false, (int) '#');
        boolean boolean71 = pricingRequest7.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(customerType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(customerType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType4, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) '4', customerType4, false, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        boolean boolean16 = pricingRequest14.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType23, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) '4', customerType23, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 0, customerType23, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 100);
        boolean boolean39 = pricingRequest14.equals((java.lang.Object) true);
        java.lang.String str40 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str40, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.couponCode();
        double double14 = pricingRequest7.basePrice();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType28, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType28, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType28, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 0, customerType28, true, "hi!", true, (int) (short) 0);
        int int49 = pricingRequest48.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest48.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest48.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) (short) 1, customerType51, false, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', 0, customerType51, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 52);
        boolean boolean62 = pricingRequest7.equals((java.lang.Object) customerType51);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType65, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = pricingRequest70.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = pricingRequest70.customerType();
        double double73 = pricingRequest70.basePrice();
        int int74 = pricingRequest70.quantity();
        double double75 = pricingRequest70.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType78 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest83 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType78, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType84 = pricingRequest83.customerType();
        int int85 = pricingRequest83.loyaltyPoints();
        boolean boolean86 = pricingRequest70.equals((java.lang.Object) int85);
        com.viktor.lab4.PricingEngine.CustomerType customerType87 = pricingRequest70.customerType();
        boolean boolean88 = pricingRequest70.firstOrder();
        boolean boolean89 = pricingRequest7.equals((java.lang.Object) boolean88);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(customerType71);
        org.junit.Assert.assertNull(customerType72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertNull(customerType84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(customerType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) '#', customerType2, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType12, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType12, true, "hi!", true, (int) (byte) 0);
        int int23 = pricingRequest22.quantity();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        boolean boolean25 = pricingRequest22.firstOrder();
        java.lang.String str26 = pricingRequest22.couponCode();
        int int27 = pricingRequest22.quantity();
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType4, true, "", true, (int) (short) -1);
        boolean boolean11 = pricingRequest9.equals((java.lang.Object) false);
        java.lang.String str12 = pricingRequest9.toString();
        double double13 = pricingRequest9.basePrice();
        int int14 = pricingRequest9.loyaltyPoints();
        java.lang.String str15 = pricingRequest9.couponCode();
        double double16 = pricingRequest9.basePrice();
        boolean boolean17 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType30, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType30, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType30, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 0, customerType30, true, "hi!", true, (int) (short) 0);
        int int51 = pricingRequest50.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest50.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest50.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) (short) 1, customerType53, false, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', 0, customerType53, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 52);
        boolean boolean64 = pricingRequest9.equals((java.lang.Object) customerType53);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType53, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=100], firstOrder=true, loyaltyPoints=52]", false, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 1, customerType4, false, "hi!", true, 0);
        double double15 = pricingRequest14.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        double double17 = pricingRequest14.basePrice();
        int int18 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType21, true, "", true, (int) (short) -1);
        boolean boolean28 = pricingRequest26.equals((java.lang.Object) false);
        java.lang.String str29 = pricingRequest26.toString();
        int int30 = pricingRequest26.loyaltyPoints();
        java.lang.String str31 = pricingRequest26.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType34, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest39.customerType();
        boolean boolean41 = pricingRequest39.seasonalSale();
        double double42 = pricingRequest39.basePrice();
        boolean boolean43 = pricingRequest39.seasonalSale();
        boolean boolean44 = pricingRequest26.equals((java.lang.Object) pricingRequest39);
        boolean boolean45 = pricingRequest14.equals((java.lang.Object) pricingRequest26);
        java.lang.String str46 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str31, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.String str15 = pricingRequest7.couponCode();
        boolean boolean16 = pricingRequest7.seasonalSale();
        java.lang.String str17 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.seasonalSale();
        double double15 = pricingRequest7.basePrice();
        int int16 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        double double18 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType10, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (short) 0, customerType10, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, 32, customerType10, true, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType10, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=1]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(customerType13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 0, customerType2, true, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=0, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=35]" + "'", str9, "PricingRequest[basePrice=-1.0, quantity=0, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType17, true, "hi!", true, (int) (byte) 0);
        java.lang.String str28 = pricingRequest27.toString();
        int int29 = pricingRequest27.quantity();
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) pricingRequest27);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType14, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        boolean boolean21 = pricingRequest19.seasonalSale();
        boolean boolean23 = pricingRequest19.equals((java.lang.Object) 0.0f);
        int int24 = pricingRequest19.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest19.customerType();
        boolean boolean26 = pricingRequest19.seasonalSale();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        int int28 = pricingRequest19.loyaltyPoints();
        java.lang.String str29 = pricingRequest19.toString();
        int int30 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest19.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(customerType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertNull(customerType31);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType15, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        int int22 = pricingRequest20.loyaltyPoints();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) int22);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        double double25 = pricingRequest7.basePrice();
        boolean boolean26 = pricingRequest7.seasonalSale();
        int int27 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNull(customerType28);
        org.junit.Assert.assertNull(customerType29);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType3, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int9 = pricingRequest8.quantity();
        double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType13, true, "", true, (int) (short) -1);
        boolean boolean20 = pricingRequest18.equals((java.lang.Object) false);
        java.lang.String str21 = pricingRequest18.toString();
        java.lang.String str22 = pricingRequest18.couponCode();
        java.lang.Object obj23 = null;
        boolean boolean24 = pricingRequest18.equals(obj23);
        boolean boolean25 = pricingRequest18.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType30, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType30, true, "", true, (int) (short) 1);
        java.lang.String str41 = pricingRequest40.couponCode();
        boolean boolean42 = pricingRequest18.equals((java.lang.Object) pricingRequest40);
        double double43 = pricingEngine0.calculateFinalPrice(pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType48, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType48, true, "hi!", true, (int) (byte) 0);
        java.lang.String str59 = pricingRequest58.couponCode();
        double double60 = pricingEngine0.calculateFinalPrice(pricingRequest58);
        boolean boolean61 = pricingRequest58.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 72.99d + "'", double43 == 72.99d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 71.04d + "'", double60 == 71.04d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType14, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        boolean boolean21 = pricingRequest19.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest19.customerType();
        boolean boolean23 = pricingRequest19.seasonalSale();
        int int24 = pricingRequest19.loyaltyPoints();
        double double25 = pricingRequest19.basePrice();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType29, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest34.customerType();
        boolean boolean36 = pricingRequest34.firstOrder();
        boolean boolean37 = pricingRequest7.equals((java.lang.Object) pricingRequest34);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(customerType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(customerType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType17, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType17, false, "hi!", true, (int) (short) -1);
        boolean boolean33 = pricingRequest32.firstOrder();
        double double34 = pricingRequest32.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType37, true, "", true, (int) (short) -1);
        boolean boolean44 = pricingRequest42.equals((java.lang.Object) false);
        int int45 = pricingRequest42.quantity();
        java.lang.String str46 = pricingRequest42.toString();
        boolean boolean47 = pricingRequest32.equals((java.lang.Object) str46);
        double double48 = pricingRequest32.basePrice();
        boolean boolean49 = pricingRequest7.equals((java.lang.Object) pricingRequest32);
        boolean boolean50 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType55, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType55, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 1);
        double double66 = pricingRequest65.basePrice();
        double double67 = pricingRequest65.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType70, true, "", true, (int) (short) -1);
        boolean boolean77 = pricingRequest75.equals((java.lang.Object) false);
        int int78 = pricingRequest75.quantity();
        java.lang.String str79 = pricingRequest75.toString();
        java.lang.String str80 = pricingRequest75.toString();
        java.lang.String str81 = pricingRequest75.couponCode();
        boolean boolean82 = pricingRequest65.equals((java.lang.Object) pricingRequest75);
        boolean boolean83 = pricingRequest7.equals((java.lang.Object) pricingRequest65);
        int int84 = pricingRequest65.quantity();
        java.lang.String str85 = pricingRequest65.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str46, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str79, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str80, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "PricingRequest[basePrice=10.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=1]" + "'", str85, "PricingRequest[basePrice=10.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=1]");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType4, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) -1, customerType4, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 0);
        java.lang.Object obj15 = null;
        boolean boolean16 = pricingRequest14.equals(obj15);
        java.lang.String str17 = pricingRequest14.toString();
        java.lang.Class<?> wildcardClass18 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str17, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        int int14 = pricingRequest7.quantity();
        java.lang.String str15 = pricingRequest7.couponCode();
        int int16 = pricingRequest7.loyaltyPoints();
        int int17 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(customerType18);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType8, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType8, false, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (-1), customerType8, false, "hi!", true, (int) (byte) 100);
        java.lang.String str29 = pricingRequest28.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType32, false, "", true, (int) (byte) 1);
        boolean boolean38 = pricingRequest37.firstOrder();
        boolean boolean39 = pricingRequest28.equals((java.lang.Object) boolean38);
        java.lang.String str40 = pricingRequest28.toString();
        double double41 = pricingRequest28.basePrice();
        double double42 = pricingRequest28.basePrice();
        int int43 = pricingRequest28.quantity();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str29, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str40, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType6, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType6, false, "hi!", true, (int) (short) -1);
        int int22 = pricingRequest21.quantity();
        java.lang.Object obj23 = null;
        boolean boolean24 = pricingRequest21.equals(obj23);
        boolean boolean25 = pricingRequest21.seasonalSale();
        boolean boolean26 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        boolean boolean18 = pricingRequest7.equals((java.lang.Object) customerType17);
        double double19 = pricingRequest7.basePrice();
        boolean boolean20 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType24, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int30 = pricingRequest29.quantity();
        boolean boolean31 = pricingRequest29.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType39, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType39, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType39, false, "hi!", true, (int) (short) -1);
        boolean boolean55 = pricingRequest54.firstOrder();
        double double56 = pricingRequest54.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType59, true, "", true, (int) (short) -1);
        boolean boolean66 = pricingRequest64.equals((java.lang.Object) false);
        int int67 = pricingRequest64.quantity();
        java.lang.String str68 = pricingRequest64.toString();
        boolean boolean69 = pricingRequest54.equals((java.lang.Object) str68);
        double double70 = pricingRequest54.basePrice();
        boolean boolean71 = pricingRequest29.equals((java.lang.Object) pricingRequest54);
        boolean boolean72 = pricingRequest7.equals((java.lang.Object) pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(customerType32);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str68, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(customerType73);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        double double16 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType8, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (short) 0, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) 1, customerType25, true, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (-1));
        java.lang.String str31 = pricingRequest30.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str31, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.toString();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.toString();
        double double14 = pricingRequest7.basePrice();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.String str15 = pricingRequest7.couponCode();
        java.lang.String str16 = pricingRequest7.couponCode();
        double double17 = pricingRequest7.basePrice();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType15, true, "", true, (int) (short) -1);
        boolean boolean22 = pricingRequest20.equals((java.lang.Object) false);
        int int23 = pricingRequest20.quantity();
        java.lang.String str24 = pricingRequest20.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType27, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest32.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest32.customerType();
        int int35 = pricingRequest32.loyaltyPoints();
        int int36 = pricingRequest32.quantity();
        boolean boolean37 = pricingRequest20.equals((java.lang.Object) pricingRequest32);
        double double38 = pricingRequest20.basePrice();
        boolean boolean39 = pricingRequest7.equals((java.lang.Object) pricingRequest20);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertNull(customerType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType14, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        java.lang.String str20 = pricingRequest19.couponCode();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        int int22 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass23 = pricingRequest7.getClass();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType3, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int9 = pricingRequest8.quantity();
        double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean11 = pricingRequest8.firstOrder();
        java.lang.String str12 = pricingRequest8.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=97.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=100]" + "'", str12, "PricingRequest[basePrice=97.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType6, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        int int22 = pricingRequest21.quantity();
        boolean boolean23 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (-1), customerType12, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType12, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType25, true, "", true, (int) (short) -1);
        boolean boolean32 = pricingRequest30.equals((java.lang.Object) false);
        java.lang.String str33 = pricingRequest30.toString();
        double double34 = pricingRequest30.basePrice();
        java.lang.String str35 = pricingRequest30.toString();
        int int36 = pricingRequest30.quantity();
        boolean boolean37 = pricingRequest30.seasonalSale();
        int int38 = pricingRequest30.loyaltyPoints();
        java.lang.String str39 = pricingRequest30.toString();
        boolean boolean40 = pricingRequest22.equals((java.lang.Object) str39);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str39, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType8, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType8, false, "hi!", true, (int) (short) -1);
        boolean boolean24 = pricingRequest23.firstOrder();
        boolean boolean25 = pricingRequest23.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType26, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType38, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType38, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType38, false, "hi!", true, (int) (short) -1);
        boolean boolean54 = pricingRequest53.firstOrder();
        boolean boolean55 = pricingRequest53.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest53.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest53.customerType();
        boolean boolean58 = pricingRequest31.equals((java.lang.Object) pricingRequest53);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType14, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType14, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType14, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (short) 1, customerType14, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) 10, customerType14, false, "", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) ' ', customerType14, true, "hi!", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (short) 1, customerType14, true, "PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]", true, 0);
        boolean boolean50 = pricingRequest49.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType8, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 97, customerType14, false, "hi!", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 32, customerType14, true, "PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 10, customerType14, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) '#');
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType6, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType6, false, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.firstOrder();
        double double23 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType26, true, "", true, (int) (short) -1);
        boolean boolean33 = pricingRequest31.equals((java.lang.Object) false);
        int int34 = pricingRequest31.quantity();
        java.lang.String str35 = pricingRequest31.toString();
        boolean boolean36 = pricingRequest21.equals((java.lang.Object) str35);
        double double37 = pricingRequest21.basePrice();
        boolean boolean38 = pricingRequest21.seasonalSale();
        int int39 = pricingRequest21.loyaltyPoints();
        java.lang.String str40 = pricingRequest21.couponCode();
        java.lang.String str41 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType3, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int9 = pricingRequest8.quantity();
        double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType17, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType17, false, "", false, 10);
        boolean boolean33 = pricingRequest32.firstOrder();
        double double34 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        boolean boolean35 = pricingRequest32.firstOrder();
        int int36 = pricingRequest32.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 8.87d + "'", double34 == 8.87d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine9 = new com.viktor.lab4.PricingEngine();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) pricingEngine9);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType21, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType21, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType21, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 0, customerType21, true, "hi!", true, (int) (short) 0);
        int int42 = pricingRequest41.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest41.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest41.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '4', customerType44, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, 97);
        java.lang.String str50 = pricingRequest49.toString();
        double double51 = pricingEngine9.calculateFinalPrice(pricingRequest49);
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 100, customerType54, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 1);
        double double60 = pricingRequest59.basePrice();
        int int61 = pricingRequest59.loyaltyPoints();
        double double62 = pricingRequest59.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double63 = pricingEngine9.calculateFinalPrice(pricingRequest59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=97]" + "'", str50, "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 3286.59d + "'", double51 == 3286.59d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType8, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (short) 1, customerType8, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType31, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean37 = pricingRequest36.seasonalSale();
        boolean boolean38 = pricingRequest28.equals((java.lang.Object) boolean37);
        java.lang.String str39 = pricingRequest28.toString();
        double double40 = pricingRequest28.basePrice();
        java.lang.String str41 = pricingRequest28.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest28.customerType();
        java.lang.Class<?> wildcardClass43 = customerType42.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]" + "'", str39, "PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 97.0d + "'", double40 == 97.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]" + "'", str41, "PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) '#', customerType4, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType14, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType14, true, "hi!", true, (int) (byte) 0);
        int int25 = pricingRequest24.quantity();
        boolean boolean26 = pricingRequest9.equals((java.lang.Object) pricingRequest24);
        boolean boolean27 = pricingRequest24.firstOrder();
        java.lang.String str28 = pricingRequest24.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (short) 10, customerType29, true, "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=97]", false, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.String str15 = pricingRequest7.toString();
        boolean boolean16 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (-1), customerType14, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType14, false, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) '4', customerType14, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]", false, (int) '4');
        boolean boolean30 = pricingRequest29.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType16, true, "", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType25, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest30.customerType();
        boolean boolean32 = pricingRequest21.equals((java.lang.Object) customerType31);
        double double33 = pricingRequest21.basePrice();
        boolean boolean34 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest21.customerType();
        java.lang.String str36 = pricingRequest21.couponCode();
        java.lang.Class<?> wildcardClass37 = pricingRequest21.getClass();
        boolean boolean38 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(customerType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(customerType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType8, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType8, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 0, customerType8, true, "hi!", true, (int) (short) 0);
        int int29 = pricingRequest28.quantity();
        int int30 = pricingRequest28.quantity();
        boolean boolean32 = pricingRequest28.equals((java.lang.Object) 35);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean13 = pricingRequest7.firstOrder();
        double double14 = pricingRequest7.basePrice();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType17, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType17, false, "", false, 10);
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) 1);
        int int34 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        double double14 = pricingRequest7.basePrice();
        java.lang.String str15 = pricingRequest7.couponCode();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        boolean boolean18 = pricingRequest7.equals((java.lang.Object) customerType17);
        double double19 = pricingRequest7.basePrice();
        boolean boolean20 = pricingRequest7.seasonalSale();
        java.lang.String str21 = pricingRequest7.toString();
        int int22 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine9 = new com.viktor.lab4.PricingEngine();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) pricingEngine9);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType13, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        double double20 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType23, true, "", true, (int) (short) -1);
        boolean boolean30 = pricingRequest28.equals((java.lang.Object) false);
        int int31 = pricingRequest28.quantity();
        java.lang.String str32 = pricingRequest28.toString();
        java.lang.String str33 = pricingRequest28.toString();
        boolean boolean34 = pricingRequest18.equals((java.lang.Object) pricingRequest28);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = pricingEngine9.calculateFinalPrice(pricingRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(customerType19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType3, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int9 = pricingRequest8.quantity();
        double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType15, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType15, true, "hi!", true, (int) (byte) 0);
        java.lang.String str26 = pricingRequest25.toString();
        java.lang.String str27 = pricingRequest25.couponCode();
        double double28 = pricingEngine0.calculateFinalPrice(pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType33, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType33, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 1);
        double double44 = pricingRequest43.basePrice();
        double double45 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType50, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType50, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 1);
        double double61 = pricingRequest60.basePrice();
        double double62 = pricingRequest60.basePrice();
        java.lang.String str63 = pricingRequest60.couponCode();
        int int64 = pricingRequest60.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = pricingRequest60.customerType();
        double double66 = pricingEngine0.calculateFinalPrice(pricingRequest60);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 71.04d + "'", double28 == 71.04d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 15.99d + "'", double45 == 15.99d);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str63, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 15.99d + "'", double66 == 15.99d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType16, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType16, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType16, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (short) 1, customerType16, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) 10, customerType16, false, "", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType16, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest(72.99d, 0, customerType16, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]", true, (int) '4');
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.toString();
        double double9 = pricingRequest7.basePrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType12, true, "", true, (int) (short) -1);
        boolean boolean19 = pricingRequest17.equals((java.lang.Object) false);
        int int20 = pricingRequest17.quantity();
        java.lang.String str21 = pricingRequest17.toString();
        java.lang.String str22 = pricingRequest17.toString();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        double double25 = pricingRequest7.basePrice();
        java.lang.String str26 = pricingRequest7.couponCode();
        double double27 = pricingRequest7.basePrice();
        int int28 = pricingRequest7.quantity();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType12, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType12, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType12, false, "hi!", true, (int) (short) -1);
        boolean boolean28 = pricingRequest27.firstOrder();
        boolean boolean29 = pricingRequest27.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest27.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType30, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType30, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', 52, customerType30, false, "PricingRequest[basePrice=0.0, quantity=10, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", false, 0);
        java.lang.Class<?> wildcardClass46 = pricingRequest45.getClass();
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        boolean boolean18 = pricingRequest16.seasonalSale();
        boolean boolean20 = pricingRequest16.equals((java.lang.Object) 0.0f);
        java.lang.String str21 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest16.customerType();
        int int23 = pricingRequest16.loyaltyPoints();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) int23);
        int int25 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest7.customerType();
        int int27 = pricingRequest7.loyaltyPoints();
        java.lang.Object obj28 = null;
        boolean boolean29 = pricingRequest7.equals(obj28);
        int int30 = pricingRequest7.quantity();
        double double31 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(customerType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNull(customerType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.firstOrder();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType2, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType6, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        int int22 = pricingRequest21.quantity();
        boolean boolean23 = pricingRequest21.firstOrder();
        int int24 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType14, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType14, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType14, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType14, false, "hi!", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) ' ', customerType14, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (byte) 0, customerType14, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=35]", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, 10, customerType14, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]", true, 0);
        boolean boolean50 = pricingRequest49.seasonalSale();
        int int51 = pricingRequest49.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) 100, customerType2, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType10, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType10, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (short) 1, customerType10, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) '#', customerType10, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest35.customerType();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType3, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        int int9 = pricingRequest8.quantity();
        double double10 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType15, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType15, true, "hi!", true, (int) (byte) 0);
        java.lang.String str26 = pricingRequest25.toString();
        java.lang.String str27 = pricingRequest25.couponCode();
        double double28 = pricingEngine0.calculateFinalPrice(pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType33, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType33, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 1);
        double double44 = pricingRequest43.basePrice();
        double double45 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType52, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType52, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType52, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double68 = pricingEngine0.calculateFinalPrice(pricingRequest67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 71.04d + "'", double28 == 71.04d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 15.99d + "'", double45 == 15.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        boolean boolean18 = pricingRequest7.equals((java.lang.Object) customerType17);
        java.lang.String str19 = pricingRequest7.couponCode();
        boolean boolean20 = pricingRequest7.seasonalSale();
        boolean boolean21 = pricingRequest7.seasonalSale();
        boolean boolean22 = pricingRequest7.seasonalSale();
        int int23 = pricingRequest7.quantity();
        int int24 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass25 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType11, true, "", true, (int) (short) -1);
        boolean boolean18 = pricingRequest16.equals((java.lang.Object) false);
        boolean boolean19 = pricingRequest16.seasonalSale();
        java.lang.String str20 = pricingRequest16.toString();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) str20);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType8, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) -1, customerType8, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) -1, customerType19, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=35]", false, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(97.0d, (int) (short) 1, customerType19, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, 0);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType15, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        int int22 = pricingRequest20.loyaltyPoints();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) int22);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        double double25 = pricingRequest7.basePrice();
        int int26 = pricingRequest7.quantity();
        boolean boolean27 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType36, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType36, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) '#', customerType36, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType36, true, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType63, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 1, customerType63, false, "hi!", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest78 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType63, false, "", false, 100);
        boolean boolean79 = pricingRequest56.equals((java.lang.Object) (byte) 0);
        boolean boolean80 = pricingRequest56.seasonalSale();
        boolean boolean81 = pricingRequest7.equals((java.lang.Object) pricingRequest56);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        int int17 = pricingRequest7.loyaltyPoints();
        int int18 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(customerType15);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType10, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 1, customerType10, false, "hi!", true, 0);
        double double21 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(71.04d, 35, customerType24, true, "PricingRequest[basePrice=97.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) (byte) 1, customerType24, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(3286.59d, (int) (byte) -1, customerType24, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=100], firstOrder=true, loyaltyPoints=52]", true, (int) 'a');
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.firstOrder();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.toString();
        double double15 = pricingRequest7.basePrice();
        boolean boolean16 = pricingRequest7.firstOrder();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}

