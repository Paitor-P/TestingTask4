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
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType8, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType8, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (byte) 0, customerType8, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=35]", true, 1);
        boolean boolean29 = pricingRequest28.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        java.lang.String str27 = pricingRequest7.toString();
        double double28 = pricingRequest7.basePrice();
        boolean boolean29 = pricingRequest7.firstOrder();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (short) 1, customerType4, true, "", false, 0);
        double double15 = pricingRequest14.basePrice();
        boolean boolean16 = pricingRequest14.firstOrder();
        java.lang.String str17 = pricingRequest14.couponCode();
        java.lang.String str18 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.quantity();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.toString();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType17, true, "", true, (int) (short) 1);
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) true);
        int int29 = pricingRequest7.quantity();
        double double30 = pricingRequest7.basePrice();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType15, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (-1), customerType15, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]", false, (int) '#');
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType29, true, "", true, (int) (short) -1);
        boolean boolean35 = pricingRequest34.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType38, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest43.customerType();
        boolean boolean45 = pricingRequest34.equals((java.lang.Object) customerType44);
        java.lang.String str46 = pricingRequest34.couponCode();
        boolean boolean47 = pricingRequest34.seasonalSale();
        boolean boolean48 = pricingRequest34.seasonalSale();
        boolean boolean49 = pricingRequest34.seasonalSale();
        boolean boolean50 = pricingRequest7.equals((java.lang.Object) boolean49);
        java.lang.Class<?> wildcardClass51 = pricingRequest7.getClass();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(customerType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType28, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (short) 1, customerType28, true, "", false, 0);
        double double39 = pricingRequest38.basePrice();
        boolean boolean40 = pricingRequest38.firstOrder();
        int int41 = pricingRequest38.loyaltyPoints();
        boolean boolean42 = pricingRequest7.equals((java.lang.Object) int41);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType4, true, "hi!", true, (int) (byte) 0);
        java.lang.String str15 = pricingRequest14.couponCode();
        java.lang.String str16 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 10, customerType2, false, "PricingRequest[basePrice=10.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=52]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        java.lang.String str27 = pricingRequest7.toString();
        double double28 = pricingRequest7.basePrice();
        int int29 = pricingRequest7.quantity();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType14, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        boolean boolean21 = pricingRequest19.seasonalSale();
        boolean boolean23 = pricingRequest19.equals((java.lang.Object) 0.0f);
        java.lang.String str24 = pricingRequest19.toString();
        boolean boolean25 = pricingRequest19.seasonalSale();
        int int26 = pricingRequest19.quantity();
        double double27 = pricingRequest19.basePrice();
        int int28 = pricingRequest19.quantity();
        int int29 = pricingRequest19.loyaltyPoints();
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) int29);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        double double14 = pricingRequest7.basePrice();
        double double15 = pricingRequest7.basePrice();
        int int16 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 100, customerType63, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 1);
        double double69 = pricingRequest68.basePrice();
        java.lang.String str70 = pricingRequest68.couponCode();
        boolean boolean71 = pricingRequest68.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double72 = pricingEngine0.calculateFinalPrice(pricingRequest68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str70, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        double double14 = pricingRequest7.basePrice();
        double double15 = pricingRequest7.basePrice();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.Object obj12 = null;
        boolean boolean13 = pricingRequest7.equals(obj12);
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType8, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (short) 1, customerType8, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", false, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType31, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean37 = pricingRequest36.seasonalSale();
        boolean boolean38 = pricingRequest28.equals((java.lang.Object) boolean37);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType41, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest46.customerType();
        boolean boolean48 = pricingRequest46.seasonalSale();
        boolean boolean50 = pricingRequest46.equals((java.lang.Object) 0.0f);
        java.lang.String str51 = pricingRequest46.toString();
        boolean boolean52 = pricingRequest46.seasonalSale();
        int int53 = pricingRequest46.quantity();
        java.lang.String str54 = pricingRequest46.couponCode();
        int int55 = pricingRequest46.loyaltyPoints();
        boolean boolean56 = pricingRequest28.equals((java.lang.Object) int55);
        java.lang.Class<?> wildcardClass57 = pricingRequest28.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(customerType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str51, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) (byte) 10);
        int int14 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType4, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) '4', customerType11, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=10]", false, (int) (short) 0);
        int int17 = pricingRequest16.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType38, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType38, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType38, false, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (-1), customerType38, false, "hi!", true, (int) (byte) 100);
        java.lang.String str59 = pricingRequest58.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType62, false, "", true, (int) (byte) 1);
        boolean boolean68 = pricingRequest67.firstOrder();
        boolean boolean69 = pricingRequest58.equals((java.lang.Object) boolean68);
        java.lang.String str70 = pricingRequest58.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double71 = pricingEngine0.calculateFinalPrice(pricingRequest58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6312.99d + "'", double10 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6312.99d + "'", double20 == 6312.99d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7.99d + "'", double29 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str59, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType62 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType62.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str70, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (short) 1, customerType8, true, "", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 100, customerType8, true, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType8, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 1);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str29, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str40, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        int int22 = pricingRequest7.loyaltyPoints();
        double double23 = pricingRequest7.basePrice();
        boolean boolean24 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType4, true, "", true, (int) (short) 1);
        java.lang.String str15 = pricingRequest14.couponCode();
        double double16 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        boolean boolean42 = pricingRequest7.seasonalSale();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType2, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType10, true, "", true, (int) (short) -1);
        boolean boolean16 = pricingRequest15.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType19, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest24.customerType();
        boolean boolean26 = pricingRequest15.equals((java.lang.Object) customerType25);
        java.lang.String str27 = pricingRequest15.couponCode();
        boolean boolean28 = pricingRequest15.seasonalSale();
        boolean boolean29 = pricingRequest15.seasonalSale();
        boolean boolean30 = pricingRequest15.seasonalSale();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) pricingRequest15);
        java.lang.String str32 = pricingRequest15.toString();
        boolean boolean33 = pricingRequest15.seasonalSale();
        boolean boolean34 = pricingRequest15.seasonalSale();
        java.lang.String str35 = pricingRequest15.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(customerType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType2, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType10, true, "", true, (int) (short) -1);
        boolean boolean16 = pricingRequest15.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType19, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest24.customerType();
        boolean boolean26 = pricingRequest15.equals((java.lang.Object) customerType25);
        java.lang.String str27 = pricingRequest15.couponCode();
        boolean boolean28 = pricingRequest15.seasonalSale();
        boolean boolean29 = pricingRequest15.seasonalSale();
        boolean boolean30 = pricingRequest15.seasonalSale();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) pricingRequest15);
        java.lang.String str32 = pricingRequest15.toString();
        java.lang.Class<?> wildcardClass33 = pricingRequest15.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(customerType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        boolean boolean50 = pricingRequest7.seasonalSale();
        boolean boolean51 = pricingRequest7.firstOrder();
        double double52 = pricingRequest7.basePrice();
        java.lang.String str53 = pricingRequest7.toString();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str53, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        boolean boolean51 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest7.customerType();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(customerType52);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType17, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType17, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        java.lang.String str33 = pricingRequest32.toString();
        boolean boolean34 = pricingRequest7.equals((java.lang.Object) pricingRequest32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 1, customerType4, false, "hi!", true, 0);
        java.lang.String str15 = pricingRequest14.couponCode();
        double double16 = pricingRequest14.basePrice();
        int int17 = pricingRequest14.quantity();
        int int18 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 10, customerType2, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine9 = new com.viktor.lab4.PricingEngine();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) pricingEngine9);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType13, true, "", true, (int) (short) -1);
        boolean boolean19 = pricingRequest18.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType22, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest27.customerType();
        boolean boolean29 = pricingRequest27.seasonalSale();
        boolean boolean31 = pricingRequest27.equals((java.lang.Object) 0.0f);
        java.lang.String str32 = pricingRequest27.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest27.customerType();
        int int34 = pricingRequest27.loyaltyPoints();
        boolean boolean35 = pricingRequest18.equals((java.lang.Object) int34);
        int int36 = pricingRequest18.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest18.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double38 = pricingEngine9.calculateFinalPrice(pricingRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(customerType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNull(customerType37);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        boolean boolean25 = pricingRequest19.firstOrder();
        java.lang.String str26 = pricingRequest19.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest19.customerType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType27);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 0, customerType2, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType6, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType6, false, "hi!", true, (int) (short) -1);
        java.lang.String str22 = pricingRequest21.toString();
        java.lang.String str23 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType8, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 10, customerType8, false, "hi!", true, (int) (short) -1);
        boolean boolean24 = pricingRequest23.firstOrder();
        boolean boolean25 = pricingRequest23.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType26, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType34, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest39.customerType();
        double double41 = pricingRequest39.basePrice();
        java.lang.Class<?> wildcardClass42 = pricingRequest39.getClass();
        boolean boolean43 = pricingRequest31.equals((java.lang.Object) wildcardClass42);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNull(customerType40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 10, customerType10, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType10, false, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (-1), customerType10, false, "hi!", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType10, true, "", true, (int) (byte) 0);
        boolean boolean36 = pricingRequest35.firstOrder();
        int int37 = pricingRequest35.loyaltyPoints();
        java.lang.Class<?> wildcardClass38 = pricingRequest35.getClass();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 100, customerType2, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType14, true, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        boolean boolean21 = pricingRequest19.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest19.customerType();
        boolean boolean23 = pricingRequest19.seasonalSale();
        double double24 = pricingRequest19.basePrice();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) -1, customerType30, false, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) 'a', customerType30, true, "hi!", true, (int) (byte) 0);
        java.lang.String str41 = pricingRequest40.toString();
        java.lang.String str42 = pricingRequest40.couponCode();
        double double43 = pricingRequest40.basePrice();
        boolean boolean44 = pricingRequest19.equals((java.lang.Object) pricingRequest40);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(customerType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(customerType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str41, "PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType2, true, "", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = customerType26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType4, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) -1, customerType10, false, "PricingRequest[basePrice=97.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=52], firstOrder=false, loyaltyPoints=35]", true, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType6, false, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 0, customerType6, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=97, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]", false, 0);
        java.lang.Class<?> wildcardClass22 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

