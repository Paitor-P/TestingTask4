package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType2, true, "", true, (-1));
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType11, true, "", true, (-1));
        double double17 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        int int19 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType23, true, "", true, (-1));
        boolean boolean29 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest28.customerType();
        double double31 = pricingRequest28.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        double double33 = pricingRequest28.basePrice();
        boolean boolean34 = pricingRequest16.equals((java.lang.Object) pricingRequest28);
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) boolean34);
        boolean boolean36 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest7.customerType();
        boolean boolean38 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType4, true, "", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (byte) 100, customerType4, false, "", false, (-1));
        boolean boolean15 = pricingRequest14.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType18, true, "", true, (-1));
        boolean boolean24 = pricingRequest23.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        boolean boolean26 = pricingRequest14.equals((java.lang.Object) customerType25);
        boolean boolean27 = pricingRequest14.seasonalSale();
        java.lang.String str28 = pricingRequest14.couponCode();
        java.lang.String str29 = pricingRequest14.couponCode();
        double double30 = pricingRequest14.basePrice();
        int int31 = pricingRequest14.quantity();
        java.lang.String str32 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType2, true, "", true, (-1));
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType11, true, "", true, (-1));
        double double17 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        int int19 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType23, true, "", true, (-1));
        boolean boolean29 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest28.customerType();
        double double31 = pricingRequest28.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        double double33 = pricingRequest28.basePrice();
        boolean boolean34 = pricingRequest16.equals((java.lang.Object) pricingRequest28);
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) boolean34);
        int int36 = pricingRequest7.loyaltyPoints();
        boolean boolean37 = pricingRequest7.firstOrder();
        boolean boolean38 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType2, true, "", true, (-1));
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType11, true, "", true, (-1));
        double double17 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        int int19 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType23, true, "", true, (-1));
        boolean boolean29 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest28.customerType();
        double double31 = pricingRequest28.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        double double33 = pricingRequest28.basePrice();
        boolean boolean34 = pricingRequest16.equals((java.lang.Object) pricingRequest28);
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) boolean34);
        int int36 = pricingRequest7.loyaltyPoints();
        int int37 = pricingRequest7.quantity();
        java.lang.String str38 = pricingRequest7.toString();
        double double39 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType2, true, "", true, (-1));
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType12, true, "", true, (-1));
        double double18 = pricingRequest17.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest17.customerType();
        int int20 = pricingRequest17.loyaltyPoints();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        java.lang.String str22 = pricingRequest7.couponCode();
        int int23 = pricingRequest7.loyaltyPoints();
        java.lang.String str24 = pricingRequest7.toString();
        boolean boolean25 = pricingRequest7.firstOrder();
        int int26 = pricingRequest7.quantity();
        int int27 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType4, true, "", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (byte) 100, customerType4, false, "", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        java.lang.String str16 = pricingRequest14.couponCode();
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = pricingRequest14.equals(obj17);
        java.lang.String str19 = pricingRequest14.couponCode();
        int int20 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest14.customerType();
        int int22 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType27, true, "", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (byte) 100, customerType27, false, "", false, (-1));
        boolean boolean38 = pricingRequest37.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType41, true, "", true, (-1));
        boolean boolean47 = pricingRequest46.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest46.customerType();
        boolean boolean49 = pricingRequest37.equals((java.lang.Object) customerType48);
        boolean boolean50 = pricingRequest37.seasonalSale();
        java.lang.String str51 = pricingRequest37.couponCode();
        java.lang.String str52 = pricingRequest37.couponCode();
        int int53 = pricingRequest37.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest37.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = pricingRequest37.customerType();
        boolean boolean56 = pricingRequest14.equals((java.lang.Object) customerType55);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }
}

