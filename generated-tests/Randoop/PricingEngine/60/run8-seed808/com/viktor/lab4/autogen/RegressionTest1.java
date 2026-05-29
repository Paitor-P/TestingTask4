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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (byte) 0, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 0, customerType8, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]", false, 1);
        double double29 = pricingRequest28.basePrice();
        double double30 = pricingRequest28.basePrice();
        java.lang.Class<?> wildcardClass31 = pricingRequest28.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        boolean boolean16 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest9.customerType();
        int int18 = pricingRequest9.loyaltyPoints();
        boolean boolean19 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 0, customerType20, false, "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", false, (int) (byte) -1);
        java.lang.String str26 = pricingRequest25.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]" + "'", str26, "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        double double14 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        java.lang.String str38 = pricingRequest32.toString();
        boolean boolean39 = pricingRequest32.seasonalSale();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        int int41 = pricingRequest32.quantity();
        int int42 = pricingRequest32.quantity();
        int int43 = pricingRequest32.loyaltyPoints();
        java.lang.String str44 = pricingRequest32.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        java.lang.String str38 = pricingRequest32.toString();
        boolean boolean39 = pricingRequest32.seasonalSale();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType43, true, "hi!", true, (int) (short) 0);
        java.lang.String str49 = pricingRequest48.couponCode();
        boolean boolean51 = pricingRequest48.equals((java.lang.Object) 10L);
        double double52 = pricingRequest48.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest48.customerType();
        boolean boolean54 = pricingRequest48.firstOrder();
        boolean boolean55 = pricingRequest48.seasonalSale();
        double double56 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        int int57 = pricingRequest48.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 8.67d + "'", double56 == 8.67d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest21.customerType();
        int int25 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.67d + "'", double23 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        java.lang.String str13 = pricingRequest8.toString();
        int int14 = pricingRequest8.quantity();
        double double15 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest8.customerType();
        boolean boolean17 = pricingRequest8.seasonalSale();
        double double18 = pricingRequest8.basePrice();
        double double19 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType22, true, "hi!", true, (int) (short) 0);
        int int28 = pricingRequest27.loyaltyPoints();
        boolean boolean29 = pricingRequest27.seasonalSale();
        double double30 = pricingRequest27.basePrice();
        boolean boolean31 = pricingRequest27.firstOrder();
        boolean boolean32 = pricingRequest27.seasonalSale();
        int int33 = pricingRequest27.loyaltyPoints();
        double double34 = pricingRequest27.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType39, true, "hi!", true, (int) (short) 0);
        java.lang.String str45 = pricingRequest44.couponCode();
        boolean boolean46 = pricingRequest44.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest44.customerType();
        java.lang.String str48 = pricingRequest44.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest44.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType49, true, "", false, (int) (short) -1);
        boolean boolean55 = pricingRequest27.equals((java.lang.Object) pricingRequest54);
        boolean boolean56 = pricingRequest8.equals((java.lang.Object) pricingRequest54);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str48, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        double double15 = pricingRequest14.basePrice();
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType19, true, "hi!", true, (int) (short) 0);
        int int25 = pricingRequest24.loyaltyPoints();
        boolean boolean26 = pricingRequest24.seasonalSale();
        boolean boolean27 = pricingRequest24.seasonalSale();
        double double28 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        boolean boolean29 = pricingRequest24.firstOrder();
        java.lang.String str30 = pricingRequest24.toString();
        double double31 = pricingRequest24.basePrice();
        boolean boolean32 = pricingRequest14.equals((java.lang.Object) pricingRequest24);
        java.lang.String str33 = pricingRequest14.toString();
        int int34 = pricingRequest14.loyaltyPoints();
        int int35 = pricingRequest14.quantity();
        java.lang.Class<?> wildcardClass36 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 8.67d + "'", double28 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]" + "'", str33, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        int int12 = pricingRequest11.loyaltyPoints();
        boolean boolean13 = pricingRequest11.seasonalSale();
        double double14 = pricingRequest11.basePrice();
        boolean boolean15 = pricingRequest11.firstOrder();
        boolean boolean16 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) ' ', customerType17, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 1);
        int int23 = pricingRequest22.quantity();
        double double24 = pricingRequest22.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (byte) 100, customerType25, true, "PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]", false, (-1));
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest8.customerType();
        java.lang.String str14 = pricingRequest8.toString();
        boolean boolean15 = pricingRequest8.seasonalSale();
        boolean boolean16 = pricingRequest8.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType18, false, "", true, (int) '#');
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.seasonalSale();
        double double40 = pricingRequest37.basePrice();
        boolean boolean41 = pricingRequest37.firstOrder();
        boolean boolean42 = pricingRequest37.seasonalSale();
        int int43 = pricingRequest37.loyaltyPoints();
        double double44 = pricingRequest37.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType49, true, "hi!", true, (int) (short) 0);
        java.lang.String str55 = pricingRequest54.couponCode();
        boolean boolean56 = pricingRequest54.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest54.customerType();
        java.lang.String str58 = pricingRequest54.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType59, true, "", false, (int) (short) -1);
        boolean boolean65 = pricingRequest37.equals((java.lang.Object) pricingRequest64);
        double double66 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest37.customerType();
        double double68 = pricingRequest37.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 737.99d + "'", double29 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str58, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 8.67d + "'", double66 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType6, false, "", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 0, customerType17, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        double double36 = pricingRequest32.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        boolean boolean38 = pricingRequest32.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest32.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 0, customerType39, false, "", false, (int) '#');
        com.viktor.lab4.PricingEngine pricingEngine45 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType48, true, "hi!", true, (int) (short) 0);
        int int54 = pricingRequest53.loyaltyPoints();
        boolean boolean55 = pricingRequest53.seasonalSale();
        double double56 = pricingRequest53.basePrice();
        boolean boolean57 = pricingRequest53.firstOrder();
        double double58 = pricingEngine45.calculateFinalPrice(pricingRequest53);
        boolean boolean59 = pricingRequest44.equals((java.lang.Object) pricingEngine45);
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType64, true, "hi!", true, (int) (short) 0);
        int int70 = pricingRequest69.loyaltyPoints();
        boolean boolean71 = pricingRequest69.seasonalSale();
        double double72 = pricingRequest69.basePrice();
        boolean boolean73 = pricingRequest69.firstOrder();
        boolean boolean74 = pricingRequest69.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = pricingRequest69.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) ' ', customerType75, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 1);
        int int81 = pricingRequest80.loyaltyPoints();
        double double82 = pricingEngine45.calculateFinalPrice(pricingRequest80);
        boolean boolean83 = pricingRequest22.equals((java.lang.Object) double82);
        java.lang.String str84 = pricingRequest22.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 8.67d + "'", double58 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 2025.59d + "'", double82 == 2025.59d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]" + "'", str84, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        boolean boolean12 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, false, "", true, (int) (short) 10);
        double double19 = pricingRequest18.basePrice();
        java.lang.String str20 = pricingRequest18.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        java.lang.String str15 = pricingRequest14.couponCode();
        int int16 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        boolean boolean13 = pricingRequest9.firstOrder();
        boolean boolean14 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) ' ', customerType15, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 1);
        int int21 = pricingRequest20.loyaltyPoints();
        int int22 = pricingRequest20.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        boolean boolean12 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, false, "", true, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = customerType13.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(2025.59d, (int) (short) 10, customerType15, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", true, 100);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType12, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest17.customerType();
        java.lang.String str19 = pricingRequest17.toString();
        boolean boolean20 = pricingRequest17.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine15 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType18, true, "hi!", true, (int) (short) 0);
        int int24 = pricingRequest23.loyaltyPoints();
        boolean boolean25 = pricingRequest23.seasonalSale();
        boolean boolean26 = pricingRequest23.seasonalSale();
        double double27 = pricingEngine15.calculateFinalPrice(pricingRequest23);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType30, true, "hi!", true, (int) (short) 0);
        int int36 = pricingRequest35.loyaltyPoints();
        boolean boolean37 = pricingRequest35.seasonalSale();
        double double38 = pricingRequest35.basePrice();
        boolean boolean39 = pricingRequest35.firstOrder();
        double double40 = pricingEngine15.calculateFinalPrice(pricingRequest35);
        boolean boolean41 = pricingRequest7.equals((java.lang.Object) pricingEngine15);
        java.lang.String str42 = pricingRequest7.toString();
        boolean boolean43 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str42, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType8, true, "hi!", true, (int) (short) 0);
        java.lang.String str14 = pricingRequest13.couponCode();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 10L);
        double double17 = pricingRequest13.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest13.customerType();
        boolean boolean19 = pricingRequest13.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) 'a', customerType20, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 10, customerType20, false, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(97.0d, 100, customerType20, true, "PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType12, false, "", true, (int) (byte) -1);
        int int18 = pricingRequest17.quantity();
        java.lang.String str19 = pricingRequest17.couponCode();
        double double20 = pricingRequest17.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType25, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType25, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        java.lang.Class<?> wildcardClass36 = pricingRequest35.getClass();
        boolean boolean37 = pricingRequest17.equals((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType12, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest17.customerType();
        java.lang.String str19 = pricingRequest17.toString();
        boolean boolean20 = pricingRequest17.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, 100, customerType20, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]", false, 100);
        java.lang.Class<?> wildcardClass26 = pricingRequest25.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 0, customerType4, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 97, customerType4, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", false, 0);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine pricingEngine1 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        boolean boolean13 = pricingRequest9.firstOrder();
        double double14 = pricingEngine1.calculateFinalPrice(pricingRequest9);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        boolean boolean26 = pricingRequest22.firstOrder();
        double double27 = pricingEngine1.calculateFinalPrice(pricingRequest22);
        java.lang.String str28 = pricingRequest22.toString();
        boolean boolean29 = pricingRequest22.seasonalSale();
        int int30 = pricingRequest22.loyaltyPoints();
        double double31 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType34, true, "hi!", true, (int) (short) 0);
        java.lang.String str40 = pricingRequest39.couponCode();
        boolean boolean41 = pricingRequest39.firstOrder();
        java.lang.String str42 = pricingRequest39.toString();
        java.lang.String str43 = pricingRequest39.couponCode();
        double double44 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType47, true, "hi!", true, (int) (short) 0);
        int int53 = pricingRequest52.loyaltyPoints();
        boolean boolean54 = pricingRequest52.seasonalSale();
        double double55 = pricingRequest52.basePrice();
        boolean boolean56 = pricingRequest52.firstOrder();
        boolean boolean57 = pricingRequest52.seasonalSale();
        int int58 = pricingRequest52.loyaltyPoints();
        java.lang.String str59 = pricingRequest52.couponCode();
        double double60 = pricingRequest52.basePrice();
        int int61 = pricingRequest52.loyaltyPoints();
        double double62 = pricingRequest52.basePrice();
        boolean boolean63 = pricingRequest39.equals((java.lang.Object) pricingRequest52);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 8.67d + "'", double31 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str42, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 8.67d + "'", double44 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        double double26 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        java.lang.String str27 = pricingRequest21.toString();
        boolean boolean28 = pricingRequest21.seasonalSale();
        boolean boolean29 = pricingRequest21.firstOrder();
        int int30 = pricingRequest21.loyaltyPoints();
        java.lang.String str31 = pricingRequest21.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType34, true, "hi!", true, (int) (short) 0);
        java.lang.String str40 = pricingRequest39.couponCode();
        boolean boolean42 = pricingRequest39.equals((java.lang.Object) 10L);
        double double43 = pricingRequest39.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest39.customerType();
        boolean boolean45 = pricingRequest39.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest39.customerType();
        boolean boolean47 = pricingRequest21.equals((java.lang.Object) pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType50, true, "hi!", true, (int) (short) 0);
        int int56 = pricingRequest55.loyaltyPoints();
        boolean boolean57 = pricingRequest55.seasonalSale();
        int int58 = pricingRequest55.quantity();
        int int59 = pricingRequest55.loyaltyPoints();
        int int60 = pricingRequest55.loyaltyPoints();
        boolean boolean61 = pricingRequest39.equals((java.lang.Object) int60);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str31, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType14, true, "", false, (int) (byte) 0);
        boolean boolean25 = pricingRequest24.seasonalSale();
        java.lang.Class<?> wildcardClass26 = pricingRequest24.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        boolean boolean12 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, false, "", true, (int) (short) 10);
        int int19 = pricingRequest18.loyaltyPoints();
        boolean boolean20 = pricingRequest18.firstOrder();
        int int21 = pricingRequest18.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType14, true, "", false, (int) (byte) 0);
        boolean boolean25 = pricingRequest24.seasonalSale();
        int int26 = pricingRequest24.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest24.customerType();
        int int28 = pricingRequest24.quantity();
        java.lang.Class<?> wildcardClass29 = pricingRequest24.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        java.lang.String str13 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType14, true, "", false, (int) (short) -1);
        int int20 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 10L);
        double double15 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        boolean boolean17 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType18, true, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType18, false, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine pricingEngine29 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.seasonalSale();
        double double40 = pricingRequest37.basePrice();
        double double41 = pricingEngine29.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType44, true, "hi!", true, (int) (short) 0);
        java.lang.String str50 = pricingRequest49.couponCode();
        boolean boolean51 = pricingRequest49.firstOrder();
        boolean boolean52 = pricingRequest49.firstOrder();
        double double53 = pricingEngine29.calculateFinalPrice(pricingRequest49);
        java.lang.String str54 = pricingRequest49.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType61, true, "hi!", true, (int) (short) 0);
        java.lang.String str67 = pricingRequest66.couponCode();
        boolean boolean68 = pricingRequest66.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest66.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest74 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType69, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType69, true, "", false, (int) (byte) 0);
        java.lang.String str80 = pricingRequest79.couponCode();
        double double81 = pricingRequest79.basePrice();
        boolean boolean82 = pricingRequest49.equals((java.lang.Object) pricingRequest79);
        boolean boolean83 = pricingRequest28.equals((java.lang.Object) pricingRequest79);
        java.lang.String str84 = pricingRequest79.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 8.67d + "'", double41 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8.67d + "'", double53 == 8.67d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str54, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType28, true, "hi!", true, (int) (short) 0);
        int int34 = pricingRequest33.loyaltyPoints();
        boolean boolean35 = pricingRequest33.seasonalSale();
        double double36 = pricingRequest33.basePrice();
        int int37 = pricingRequest33.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest33.customerType();
        java.lang.String str39 = pricingRequest33.toString();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        int int41 = pricingRequest33.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.67d + "'", double25 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str39, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (byte) -1, customerType2, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]", false, (int) (byte) 1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType28, true, "hi!", true, (int) (short) 0);
        double double34 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        boolean boolean35 = pricingRequest33.seasonalSale();
        double double36 = pricingRequest33.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType39, true, "hi!", true, (int) (short) 0);
        java.lang.String str45 = pricingRequest44.couponCode();
        boolean boolean47 = pricingRequest44.equals((java.lang.Object) 10L);
        int int48 = pricingRequest44.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest44.customerType();
        java.lang.String str50 = pricingRequest44.toString();
        boolean boolean51 = pricingRequest44.seasonalSale();
        boolean boolean52 = pricingRequest44.seasonalSale();
        double double53 = pricingRequest44.basePrice();
        int int54 = pricingRequest44.quantity();
        boolean boolean55 = pricingRequest33.equals((java.lang.Object) pricingRequest44);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.67d + "'", double25 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 8.67d + "'", double34 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str50, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType28, true, "hi!", true, (int) (short) 0);
        int int34 = pricingRequest33.loyaltyPoints();
        boolean boolean35 = pricingRequest33.seasonalSale();
        boolean boolean36 = pricingRequest33.seasonalSale();
        java.lang.String str37 = pricingRequest33.couponCode();
        double double38 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType41, true, "hi!", true, (int) (short) 0);
        int int47 = pricingRequest46.loyaltyPoints();
        java.lang.String str48 = pricingRequest46.couponCode();
        java.lang.String str49 = pricingRequest46.couponCode();
        boolean boolean50 = pricingRequest46.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest46.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest46.customerType();
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest46);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType58, true, "hi!", true, (int) (short) 0);
        java.lang.String str64 = pricingRequest63.couponCode();
        boolean boolean66 = pricingRequest63.equals((java.lang.Object) 10L);
        double double67 = pricingRequest63.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest63.customerType();
        boolean boolean69 = pricingRequest63.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest63.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 0, customerType70, false, "", false, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double76 = pricingEngine0.calculateFinalPrice(pricingRequest75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.67d + "'", double25 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 8.67d + "'", double38 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8.67d + "'", double53 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType11, true, "hi!", true, (int) (short) 0);
        java.lang.String str17 = pricingRequest16.couponCode();
        boolean boolean19 = pricingRequest16.equals((java.lang.Object) 10L);
        int int20 = pricingRequest16.loyaltyPoints();
        java.lang.String str21 = pricingRequest16.toString();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) str21);
        boolean boolean23 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        int int14 = pricingRequest8.quantity();
        int int15 = pricingRequest8.quantity();
        java.lang.String str16 = pricingRequest8.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType13, true, "hi!", true, (int) (short) 0);
        int int19 = pricingRequest18.loyaltyPoints();
        boolean boolean20 = pricingRequest18.seasonalSale();
        double double21 = pricingRequest18.basePrice();
        int int22 = pricingRequest18.loyaltyPoints();
        java.lang.Object obj23 = null;
        boolean boolean24 = pricingRequest18.equals(obj23);
        boolean boolean25 = pricingRequest7.equals(obj23);
        double double26 = pricingRequest7.basePrice();
        int int27 = pricingRequest7.quantity();
        int int28 = pricingRequest7.quantity();
        int int29 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest8.customerType();
        java.lang.String str14 = pricingRequest8.couponCode();
        java.lang.String str15 = pricingRequest8.couponCode();
        boolean boolean16 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine17 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType20, true, "hi!", true, (int) (short) 0);
        int int26 = pricingRequest25.loyaltyPoints();
        boolean boolean27 = pricingRequest25.seasonalSale();
        double double28 = pricingRequest25.basePrice();
        double double29 = pricingEngine17.calculateFinalPrice(pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        java.lang.String str38 = pricingRequest37.couponCode();
        boolean boolean39 = pricingRequest37.firstOrder();
        boolean boolean40 = pricingRequest37.firstOrder();
        double double41 = pricingEngine17.calculateFinalPrice(pricingRequest37);
        int int42 = pricingRequest37.loyaltyPoints();
        java.lang.String str43 = pricingRequest37.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest37.customerType();
        boolean boolean45 = pricingRequest8.equals((java.lang.Object) pricingRequest37);
        double double46 = pricingRequest8.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 8.67d + "'", double29 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 8.67d + "'", double41 == 8.67d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str43, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 100, customerType4, false, "", true, (int) '#');
        boolean boolean15 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.String str14 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine15 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType18, true, "hi!", true, (int) (short) 0);
        int int24 = pricingRequest23.loyaltyPoints();
        boolean boolean25 = pricingRequest23.seasonalSale();
        double double26 = pricingRequest23.basePrice();
        double double27 = pricingEngine15.calculateFinalPrice(pricingRequest23);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest23.customerType();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) customerType28);
        java.lang.String str30 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        boolean boolean13 = pricingRequest8.seasonalSale();
        int int14 = pricingRequest8.loyaltyPoints();
        double double15 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType20, true, "hi!", true, (int) (short) 0);
        java.lang.String str26 = pricingRequest25.couponCode();
        boolean boolean27 = pricingRequest25.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest25.customerType();
        java.lang.String str29 = pricingRequest25.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType30, true, "", false, (int) (short) -1);
        boolean boolean36 = pricingRequest8.equals((java.lang.Object) pricingRequest35);
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 0, customerType42, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) '4', customerType42, true, "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]", true, 1);
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest52);
        double double54 = pricingRequest52.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1900.79d + "'", double53 == 1900.79d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 52.0d + "'", double54 == 52.0d);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        java.lang.String str13 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType14, true, "", false, (int) (short) -1);
        int int20 = pricingRequest19.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        int int10 = pricingRequest7.loyaltyPoints();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.viktor.lab4.PricingEngine pricingEngine8 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType11, true, "hi!", true, (int) (short) 0);
        int int17 = pricingRequest16.loyaltyPoints();
        boolean boolean18 = pricingRequest16.seasonalSale();
        double double19 = pricingRequest16.basePrice();
        boolean boolean20 = pricingRequest16.firstOrder();
        double double21 = pricingEngine8.calculateFinalPrice(pricingRequest16);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType26, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType26, false, "", true, (int) '#');
        double double37 = pricingEngine8.calculateFinalPrice(pricingRequest36);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        int int46 = pricingRequest45.loyaltyPoints();
        boolean boolean47 = pricingRequest45.seasonalSale();
        double double48 = pricingRequest45.basePrice();
        boolean boolean49 = pricingRequest45.firstOrder();
        boolean boolean50 = pricingRequest45.seasonalSale();
        int int51 = pricingRequest45.loyaltyPoints();
        double double52 = pricingRequest45.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType57, true, "hi!", true, (int) (short) 0);
        java.lang.String str63 = pricingRequest62.couponCode();
        boolean boolean64 = pricingRequest62.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = pricingRequest62.customerType();
        java.lang.String str66 = pricingRequest62.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest62.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType67, true, "", false, (int) (short) -1);
        boolean boolean73 = pricingRequest45.equals((java.lang.Object) pricingRequest72);
        double double74 = pricingEngine8.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest(737.99d, 1, customerType75, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest85 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 10, customerType75, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest90 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType75, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest95 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, 0, customerType75, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.67d + "'", double21 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 737.99d + "'", double37 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str66, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 8.67d + "'", double74 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType12, false, "", true, (int) (byte) -1);
        int int18 = pricingRequest17.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest17.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest17.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 100, customerType6, false, "", false, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (short) 100, customerType6, false, "", true, (int) 'a');
        boolean boolean22 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        double double15 = pricingRequest7.basePrice();
        int int16 = pricingRequest7.loyaltyPoints();
        double double17 = pricingRequest7.basePrice();
        java.lang.String str18 = pricingRequest7.couponCode();
        double double19 = pricingRequest7.basePrice();
        boolean boolean20 = pricingRequest7.seasonalSale();
        java.lang.String str21 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        int int25 = pricingRequest21.loyaltyPoints();
        int int26 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest21.customerType();
        int int28 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType31, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest36.customerType();
        boolean boolean38 = pricingRequest21.equals((java.lang.Object) pricingRequest36);
        boolean boolean39 = pricingRequest7.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        int int26 = pricingRequest20.loyaltyPoints();
        java.lang.String str27 = pricingRequest20.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.67d + "'", double25 == 8.67d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        double double26 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        int int27 = pricingRequest21.loyaltyPoints();
        double double28 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType31, true, "hi!", true, (int) (short) 0);
        int int37 = pricingRequest36.loyaltyPoints();
        boolean boolean38 = pricingRequest36.seasonalSale();
        double double39 = pricingRequest36.basePrice();
        int int40 = pricingRequest36.loyaltyPoints();
        java.lang.String str41 = pricingRequest36.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest36.customerType();
        boolean boolean43 = pricingRequest36.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine44 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType47, true, "hi!", true, (int) (short) 0);
        int int53 = pricingRequest52.loyaltyPoints();
        boolean boolean54 = pricingRequest52.seasonalSale();
        boolean boolean55 = pricingRequest52.seasonalSale();
        double double56 = pricingEngine44.calculateFinalPrice(pricingRequest52);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType59, true, "hi!", true, (int) (short) 0);
        int int65 = pricingRequest64.loyaltyPoints();
        boolean boolean66 = pricingRequest64.seasonalSale();
        double double67 = pricingRequest64.basePrice();
        boolean boolean68 = pricingRequest64.firstOrder();
        double double69 = pricingEngine44.calculateFinalPrice(pricingRequest64);
        boolean boolean70 = pricingRequest36.equals((java.lang.Object) pricingEngine44);
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = pricingRequest36.customerType();
        boolean boolean72 = pricingRequest21.equals((java.lang.Object) customerType71);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 8.67d + "'", double56 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 8.67d + "'", double69 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        double double15 = pricingRequest14.basePrice();
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType19, true, "hi!", true, (int) (short) 0);
        int int25 = pricingRequest24.loyaltyPoints();
        boolean boolean26 = pricingRequest24.seasonalSale();
        boolean boolean27 = pricingRequest24.seasonalSale();
        double double28 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        boolean boolean29 = pricingRequest24.firstOrder();
        java.lang.String str30 = pricingRequest24.toString();
        double double31 = pricingRequest24.basePrice();
        boolean boolean32 = pricingRequest14.equals((java.lang.Object) pricingRequest24);
        java.lang.String str33 = pricingRequest14.couponCode();
        java.lang.String str34 = pricingRequest14.couponCode();
        int int35 = pricingRequest14.quantity();
        double double36 = pricingRequest14.basePrice();
        boolean boolean37 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 8.67d + "'", double28 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str33, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str34, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 100, customerType4, false, "", false, (int) (byte) 1);
        double double15 = pricingRequest14.basePrice();
        boolean boolean16 = pricingRequest14.seasonalSale();
        boolean boolean17 = pricingRequest14.seasonalSale();
        boolean boolean18 = pricingRequest14.seasonalSale();
        java.lang.String str19 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=1]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=1]");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        int int13 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        java.lang.String str15 = pricingRequest9.toString();
        java.lang.String str16 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine17 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType20, true, "hi!", true, (int) (short) 0);
        int int26 = pricingRequest25.loyaltyPoints();
        boolean boolean27 = pricingRequest25.seasonalSale();
        double double28 = pricingRequest25.basePrice();
        double double29 = pricingEngine17.calculateFinalPrice(pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest25.customerType();
        boolean boolean31 = pricingRequest9.equals((java.lang.Object) customerType30);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (short) 1, customerType30, true, "hi!", false, 10);
        int int37 = pricingRequest36.loyaltyPoints();
        java.lang.String str38 = pricingRequest36.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 8.67d + "'", double29 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.String str14 = pricingRequest7.toString();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine pricingEngine10 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType13, true, "hi!", true, (int) (short) 0);
        int int19 = pricingRequest18.loyaltyPoints();
        boolean boolean20 = pricingRequest18.seasonalSale();
        double double21 = pricingRequest18.basePrice();
        double double22 = pricingEngine10.calculateFinalPrice(pricingRequest18);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType25, true, "hi!", true, (int) (short) 0);
        int int31 = pricingRequest30.loyaltyPoints();
        boolean boolean32 = pricingRequest30.seasonalSale();
        double double33 = pricingRequest30.basePrice();
        int int34 = pricingRequest30.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType37, true, "hi!", true, (int) (short) 0);
        int int43 = pricingRequest42.loyaltyPoints();
        boolean boolean44 = pricingRequest42.seasonalSale();
        double double45 = pricingRequest42.basePrice();
        int int46 = pricingRequest42.loyaltyPoints();
        java.lang.String str47 = pricingRequest42.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest42.customerType();
        int int49 = pricingRequest42.quantity();
        boolean boolean50 = pricingRequest30.equals((java.lang.Object) int49);
        double double51 = pricingEngine10.calculateFinalPrice(pricingRequest30);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 10, customerType52, false, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]", true, 0);
        double double58 = pricingRequest57.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType67, true, "hi!", true, (int) (short) 0);
        java.lang.String str73 = pricingRequest72.couponCode();
        boolean boolean74 = pricingRequest72.firstOrder();
        boolean boolean75 = pricingRequest72.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType76 = pricingRequest72.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest81 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType76, false, "", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest86 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 0, customerType76, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest91 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 0, customerType76, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, 10);
        int int92 = pricingRequest91.loyaltyPoints();
        boolean boolean93 = pricingRequest57.equals((java.lang.Object) pricingRequest91);
        boolean boolean94 = pricingRequest7.equals((java.lang.Object) boolean93);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.67d + "'", double22 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 8.67d + "'", double51 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + customerType76 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType76.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType30, true, "hi!", true, (int) (short) 0);
        java.lang.String str36 = pricingRequest35.couponCode();
        boolean boolean37 = pricingRequest35.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest35.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType38, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType38, true, "", false, (int) (byte) 0);
        boolean boolean49 = pricingRequest48.seasonalSale();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.67d + "'", double23 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 8.72d + "'", double50 == 8.72d);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        double double26 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        java.lang.String str27 = pricingRequest21.toString();
        boolean boolean28 = pricingRequest21.seasonalSale();
        java.lang.String str29 = pricingRequest21.toString();
        java.lang.String str30 = pricingRequest21.toString();
        int int31 = pricingRequest21.quantity();
        boolean boolean32 = pricingRequest21.seasonalSale();
        boolean boolean33 = pricingRequest21.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        boolean boolean24 = pricingRequest21.firstOrder();
        java.lang.String str25 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.67d + "'", double23 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean14 = pricingRequest8.firstOrder();
        boolean boolean15 = pricingRequest8.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType2, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, 32);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (-1), customerType6, true, "", false, (int) (byte) 100);
        double double17 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine pricingEngine18 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType21, true, "hi!", true, (int) (short) 0);
        int int27 = pricingRequest26.loyaltyPoints();
        boolean boolean28 = pricingRequest26.seasonalSale();
        boolean boolean29 = pricingRequest26.seasonalSale();
        double double30 = pricingEngine18.calculateFinalPrice(pricingRequest26);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType33, true, "hi!", true, (int) (short) 0);
        int int39 = pricingRequest38.loyaltyPoints();
        boolean boolean40 = pricingRequest38.seasonalSale();
        double double41 = pricingRequest38.basePrice();
        boolean boolean42 = pricingRequest38.firstOrder();
        double double43 = pricingEngine18.calculateFinalPrice(pricingRequest38);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest38.customerType();
        boolean boolean45 = pricingRequest16.equals((java.lang.Object) customerType44);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 100, customerType44, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType53, true, "hi!", true, (int) (short) 0);
        java.lang.String str59 = pricingRequest58.couponCode();
        boolean boolean61 = pricingRequest58.equals((java.lang.Object) 10L);
        double double62 = pricingRequest58.basePrice();
        boolean boolean63 = pricingRequest58.firstOrder();
        double double64 = pricingRequest58.basePrice();
        int int65 = pricingRequest58.loyaltyPoints();
        boolean boolean66 = pricingRequest50.equals((java.lang.Object) pricingRequest58);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 8.67d + "'", double30 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 8.67d + "'", double43 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        int int13 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        java.lang.String str15 = pricingRequest9.toString();
        java.lang.String str16 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine17 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType20, true, "hi!", true, (int) (short) 0);
        int int26 = pricingRequest25.loyaltyPoints();
        boolean boolean27 = pricingRequest25.seasonalSale();
        double double28 = pricingRequest25.basePrice();
        double double29 = pricingEngine17.calculateFinalPrice(pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest25.customerType();
        boolean boolean31 = pricingRequest9.equals((java.lang.Object) customerType30);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (short) 1, customerType30, true, "hi!", false, 10);
        boolean boolean37 = pricingRequest36.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        int int46 = pricingRequest45.loyaltyPoints();
        boolean boolean47 = pricingRequest45.seasonalSale();
        double double48 = pricingRequest45.basePrice();
        boolean boolean49 = pricingRequest45.firstOrder();
        double double50 = pricingRequest45.basePrice();
        java.lang.String str51 = pricingRequest45.toString();
        java.lang.Class<?> wildcardClass52 = pricingRequest45.getClass();
        boolean boolean53 = pricingRequest36.equals((java.lang.Object) wildcardClass52);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 8.67d + "'", double29 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str51, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        double double13 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 0, customerType16, false, "", false, (int) '#');
        com.viktor.lab4.PricingEngine pricingEngine22 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType25, true, "hi!", true, (int) (short) 0);
        int int31 = pricingRequest30.loyaltyPoints();
        boolean boolean32 = pricingRequest30.seasonalSale();
        double double33 = pricingRequest30.basePrice();
        boolean boolean34 = pricingRequest30.firstOrder();
        double double35 = pricingEngine22.calculateFinalPrice(pricingRequest30);
        boolean boolean36 = pricingRequest21.equals((java.lang.Object) pricingEngine22);
        boolean boolean37 = pricingRequest21.seasonalSale();
        java.lang.String str38 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 8.67d + "'", double35 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType8, true, "hi!", true, (int) (short) 0);
        int int14 = pricingRequest13.loyaltyPoints();
        boolean boolean15 = pricingRequest13.seasonalSale();
        double double16 = pricingRequest13.basePrice();
        int int17 = pricingRequest13.loyaltyPoints();
        java.lang.String str18 = pricingRequest13.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) -1, customerType19, false, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", false, 52);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 0, customerType19, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 1, customerType19, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", true, (int) ' ');
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType14, true, "", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine pricingEngine31 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType34, true, "hi!", true, (int) (short) 0);
        int int40 = pricingRequest39.loyaltyPoints();
        boolean boolean41 = pricingRequest39.seasonalSale();
        boolean boolean42 = pricingRequest39.seasonalSale();
        double double43 = pricingEngine31.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (short) 100, customerType44, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 0);
        int int50 = pricingRequest49.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest49.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 32, (int) 'a', customerType51, false, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 97, customerType51, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]", false, (int) (short) 100);
        boolean boolean62 = pricingRequest24.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 8.67d + "'", double43 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType10, true, "hi!", true, (int) (short) 0);
        java.lang.String str16 = pricingRequest15.couponCode();
        boolean boolean17 = pricingRequest15.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType18, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 1, customerType18, false, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 32, (int) (byte) 100, customerType18, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 0, customerType18, true, "", false, 0);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        int int13 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        java.lang.String str15 = pricingRequest9.toString();
        java.lang.String str16 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine17 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType20, true, "hi!", true, (int) (short) 0);
        int int26 = pricingRequest25.loyaltyPoints();
        boolean boolean27 = pricingRequest25.seasonalSale();
        double double28 = pricingRequest25.basePrice();
        double double29 = pricingEngine17.calculateFinalPrice(pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest25.customerType();
        boolean boolean31 = pricingRequest9.equals((java.lang.Object) customerType30);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (short) 1, customerType30, true, "hi!", false, 10);
        boolean boolean37 = pricingRequest36.seasonalSale();
        boolean boolean38 = pricingRequest36.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 8.67d + "'", double29 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.equals((java.lang.Object) 8.72d);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        double double19 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine pricingEngine20 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType23, true, "hi!", true, (int) (short) 0);
        int int29 = pricingRequest28.loyaltyPoints();
        boolean boolean30 = pricingRequest28.seasonalSale();
        boolean boolean31 = pricingRequest28.seasonalSale();
        double double32 = pricingEngine20.calculateFinalPrice(pricingRequest28);
        boolean boolean33 = pricingRequest28.firstOrder();
        java.lang.String str34 = pricingRequest28.toString();
        double double35 = pricingRequest28.basePrice();
        boolean boolean36 = pricingRequest18.equals((java.lang.Object) pricingRequest28);
        java.lang.String str37 = pricingRequest18.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) -1, customerType38, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]", false, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) 'a', customerType38, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, 32);
        double double49 = pricingRequest48.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 8.67d + "'", double32 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str34, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str37, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine15 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType18, true, "hi!", true, (int) (short) 0);
        int int24 = pricingRequest23.loyaltyPoints();
        boolean boolean25 = pricingRequest23.seasonalSale();
        boolean boolean26 = pricingRequest23.seasonalSale();
        double double27 = pricingEngine15.calculateFinalPrice(pricingRequest23);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType30, true, "hi!", true, (int) (short) 0);
        int int36 = pricingRequest35.loyaltyPoints();
        boolean boolean37 = pricingRequest35.seasonalSale();
        double double38 = pricingRequest35.basePrice();
        boolean boolean39 = pricingRequest35.firstOrder();
        double double40 = pricingEngine15.calculateFinalPrice(pricingRequest35);
        boolean boolean41 = pricingRequest7.equals((java.lang.Object) pricingEngine15);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType44, true, "hi!", true, (int) (short) 0);
        int int50 = pricingRequest49.loyaltyPoints();
        boolean boolean51 = pricingRequest49.seasonalSale();
        int int52 = pricingRequest49.quantity();
        double double53 = pricingEngine15.calculateFinalPrice(pricingRequest49);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType58, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType58, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        boolean boolean69 = pricingRequest68.seasonalSale();
        java.lang.String str70 = pricingRequest68.toString();
        java.lang.String str71 = pricingRequest68.couponCode();
        int int72 = pricingRequest68.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double73 = pricingEngine15.calculateFinalPrice(pricingRequest68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8.67d + "'", double53 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]" + "'", str70, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str71, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        double double13 = pricingRequest10.basePrice();
        boolean boolean14 = pricingRequest10.firstOrder();
        double double15 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        int int16 = pricingRequest10.quantity();
        int int17 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (byte) 100, customerType18, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]", false, (int) (short) 0);
        boolean boolean24 = pricingRequest23.firstOrder();
        boolean boolean25 = pricingRequest23.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.67d + "'", double15 == 8.67d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        boolean boolean13 = pricingRequest7.firstOrder();
        int int14 = pricingRequest7.quantity();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine16 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType19, true, "hi!", true, (int) (short) 0);
        int int25 = pricingRequest24.loyaltyPoints();
        boolean boolean26 = pricingRequest24.seasonalSale();
        double double27 = pricingRequest24.basePrice();
        boolean boolean28 = pricingRequest24.firstOrder();
        double double29 = pricingEngine16.calculateFinalPrice(pricingRequest24);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType34, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType34, false, "", true, (int) '#');
        double double45 = pricingEngine16.calculateFinalPrice(pricingRequest44);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType48, true, "hi!", true, (int) (short) 0);
        int int54 = pricingRequest53.loyaltyPoints();
        boolean boolean55 = pricingRequest53.seasonalSale();
        double double56 = pricingRequest53.basePrice();
        boolean boolean57 = pricingRequest53.firstOrder();
        boolean boolean58 = pricingRequest53.seasonalSale();
        int int59 = pricingRequest53.loyaltyPoints();
        double double60 = pricingRequest53.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType65, true, "hi!", true, (int) (short) 0);
        java.lang.String str71 = pricingRequest70.couponCode();
        boolean boolean72 = pricingRequest70.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest70.customerType();
        java.lang.String str74 = pricingRequest70.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = pricingRequest70.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType75, true, "", false, (int) (short) -1);
        boolean boolean81 = pricingRequest53.equals((java.lang.Object) pricingRequest80);
        double double82 = pricingEngine16.calculateFinalPrice(pricingRequest53);
        boolean boolean83 = pricingRequest7.equals((java.lang.Object) double82);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 8.67d + "'", double29 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 737.99d + "'", double45 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + customerType73 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType73.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str74, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 8.67d + "'", double82 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.toString();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        java.lang.String str25 = pricingRequest20.toString();
        int int26 = pricingRequest20.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        double double46 = pricingRequest45.basePrice();
        java.lang.String str47 = pricingRequest45.toString();
        boolean boolean48 = pricingRequest32.equals((java.lang.Object) pricingRequest45);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType52, true, "hi!", true, (int) (short) 0);
        int int58 = pricingRequest57.loyaltyPoints();
        boolean boolean59 = pricingRequest57.seasonalSale();
        double double60 = pricingRequest57.basePrice();
        double double61 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        java.lang.String str62 = pricingRequest57.toString();
        int int63 = pricingRequest57.quantity();
        double double64 = pricingRequest57.basePrice();
        java.lang.String str65 = pricingRequest57.toString();
        boolean boolean66 = pricingRequest32.equals((java.lang.Object) str65);
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest32.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 8.67d + "'", double61 == 8.67d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str62, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType10, true, "hi!", true, (int) (short) 0);
        java.lang.String str16 = pricingRequest15.couponCode();
        boolean boolean17 = pricingRequest15.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType18, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType18, true, "", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest28.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (-1), customerType29, false, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest(737.99d, (int) (short) 1, customerType35, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, 0);
        java.lang.String str41 = pricingRequest40.couponCode();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str41, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        double double13 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 0, customerType16, false, "", false, (int) '#');
        com.viktor.lab4.PricingEngine pricingEngine22 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType25, true, "hi!", true, (int) (short) 0);
        int int31 = pricingRequest30.loyaltyPoints();
        boolean boolean32 = pricingRequest30.seasonalSale();
        double double33 = pricingRequest30.basePrice();
        boolean boolean34 = pricingRequest30.firstOrder();
        double double35 = pricingEngine22.calculateFinalPrice(pricingRequest30);
        boolean boolean36 = pricingRequest21.equals((java.lang.Object) pricingEngine22);
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType45, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType45, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) '#', customerType45, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (short) 100, customerType45, true, "hi!", true, (int) (byte) 100);
        boolean boolean66 = pricingRequest21.equals((java.lang.Object) "hi!");
        java.lang.String str67 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 8.67d + "'", double35 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=35]" + "'", str67, "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        java.lang.Class<?> wildcardClass1 = pricingEngine0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType18, false, "", true, (int) '#');
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.seasonalSale();
        double double40 = pricingRequest37.basePrice();
        boolean boolean41 = pricingRequest37.firstOrder();
        boolean boolean42 = pricingRequest37.seasonalSale();
        int int43 = pricingRequest37.loyaltyPoints();
        double double44 = pricingRequest37.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType49, true, "hi!", true, (int) (short) 0);
        java.lang.String str55 = pricingRequest54.couponCode();
        boolean boolean56 = pricingRequest54.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest54.customerType();
        java.lang.String str58 = pricingRequest54.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType59, true, "", false, (int) (short) -1);
        boolean boolean65 = pricingRequest37.equals((java.lang.Object) pricingRequest64);
        double double66 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine pricingEngine67 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType70, true, "hi!", true, (int) (short) 0);
        int int76 = pricingRequest75.loyaltyPoints();
        boolean boolean77 = pricingRequest75.seasonalSale();
        double double78 = pricingRequest75.basePrice();
        boolean boolean79 = pricingRequest75.firstOrder();
        double double80 = pricingEngine67.calculateFinalPrice(pricingRequest75);
        com.viktor.lab4.PricingEngine.CustomerType customerType83 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest88 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType83, true, "hi!", true, (int) (short) 0);
        int int89 = pricingRequest88.loyaltyPoints();
        boolean boolean90 = pricingRequest88.seasonalSale();
        double double91 = pricingRequest88.basePrice();
        boolean boolean92 = pricingRequest88.firstOrder();
        double double93 = pricingEngine67.calculateFinalPrice(pricingRequest88);
        java.lang.String str94 = pricingRequest88.toString();
        double double95 = pricingEngine0.calculateFinalPrice(pricingRequest88);
        java.lang.Class<?> wildcardClass96 = pricingRequest88.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 737.99d + "'", double29 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str58, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 8.67d + "'", double66 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 8.67d + "'", double80 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType83 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType83.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 8.67d + "'", double93 == 8.67d);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str94, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 8.67d + "'", double95 == 8.67d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.viktor.lab4.PricingEngine pricingEngine4 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType7, true, "hi!", true, (int) (short) 0);
        int int13 = pricingRequest12.loyaltyPoints();
        boolean boolean14 = pricingRequest12.seasonalSale();
        boolean boolean15 = pricingRequest12.seasonalSale();
        double double16 = pricingEngine4.calculateFinalPrice(pricingRequest12);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest12.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (short) 100, customerType17, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 0);
        int int23 = pricingRequest22.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (short) 100, customerType24, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, 10);
        boolean boolean30 = pricingRequest29.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.67d + "'", double16 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        boolean boolean12 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, false, "", true, (int) (short) 10);
        double double19 = pricingRequest18.basePrice();
        java.lang.String str20 = pricingRequest18.toString();
        java.lang.Class<?> wildcardClass21 = pricingRequest18.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str20, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        double double13 = pricingRequest10.basePrice();
        double double14 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        int int26 = pricingRequest22.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType29, true, "hi!", true, (int) (short) 0);
        int int35 = pricingRequest34.loyaltyPoints();
        boolean boolean36 = pricingRequest34.seasonalSale();
        double double37 = pricingRequest34.basePrice();
        int int38 = pricingRequest34.loyaltyPoints();
        java.lang.String str39 = pricingRequest34.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest34.customerType();
        int int41 = pricingRequest34.quantity();
        boolean boolean42 = pricingRequest22.equals((java.lang.Object) int41);
        double double43 = pricingEngine2.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) (byte) 10, customerType44, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest49.customerType();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 8.67d + "'", double43 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        double double13 = pricingRequest10.basePrice();
        boolean boolean14 = pricingRequest10.firstOrder();
        double double15 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType20, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType20, false, "", true, (int) '#');
        double double31 = pricingEngine2.calculateFinalPrice(pricingRequest30);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType34, true, "hi!", true, (int) (short) 0);
        int int40 = pricingRequest39.loyaltyPoints();
        boolean boolean41 = pricingRequest39.seasonalSale();
        double double42 = pricingRequest39.basePrice();
        boolean boolean43 = pricingRequest39.firstOrder();
        boolean boolean44 = pricingRequest39.seasonalSale();
        int int45 = pricingRequest39.loyaltyPoints();
        double double46 = pricingRequest39.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType51, true, "hi!", true, (int) (short) 0);
        java.lang.String str57 = pricingRequest56.couponCode();
        boolean boolean58 = pricingRequest56.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest56.customerType();
        java.lang.String str60 = pricingRequest56.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = pricingRequest56.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType61, true, "", false, (int) (short) -1);
        boolean boolean67 = pricingRequest39.equals((java.lang.Object) pricingRequest66);
        double double68 = pricingEngine2.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest74 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (-1), customerType69, true, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        boolean boolean75 = pricingRequest74.firstOrder();
        int int76 = pricingRequest74.quantity();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.67d + "'", double15 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 737.99d + "'", double31 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str60, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 8.67d + "'", double68 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType14, true, "", false, (int) (byte) 0);
        boolean boolean25 = pricingRequest24.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest24.customerType();
        boolean boolean27 = pricingRequest24.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        double double13 = pricingRequest10.basePrice();
        double double14 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        int int26 = pricingRequest22.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType29, true, "hi!", true, (int) (short) 0);
        int int35 = pricingRequest34.loyaltyPoints();
        boolean boolean36 = pricingRequest34.seasonalSale();
        double double37 = pricingRequest34.basePrice();
        int int38 = pricingRequest34.loyaltyPoints();
        java.lang.String str39 = pricingRequest34.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest34.customerType();
        int int41 = pricingRequest34.quantity();
        boolean boolean42 = pricingRequest22.equals((java.lang.Object) int41);
        double double43 = pricingEngine2.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest(8.72d, (int) (byte) 1, customerType44, false, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) '#');
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 8.67d + "'", double43 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 100, customerType6, false, "", false, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (short) 100, customerType6, false, "", true, (int) 'a');
        int int22 = pricingRequest21.loyaltyPoints();
        double double23 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        double double13 = pricingRequest8.basePrice();
        java.lang.Class<?> wildcardClass14 = pricingRequest8.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        boolean boolean14 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType15, false, "", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 0, customerType15, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]", false, (int) (byte) 10);
        java.lang.String str26 = pricingRequest25.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]" + "'", str26, "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (byte) 100, customerType12, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (-1), customerType12, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]", true, (int) '4');
        java.lang.String str23 = pricingRequest22.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100], firstOrder=true, loyaltyPoints=52]" + "'", str23, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100], firstOrder=true, loyaltyPoints=52]");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        double double46 = pricingRequest45.basePrice();
        java.lang.String str47 = pricingRequest45.toString();
        boolean boolean48 = pricingRequest32.equals((java.lang.Object) pricingRequest45);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType52, true, "hi!", true, (int) (short) 0);
        int int58 = pricingRequest57.loyaltyPoints();
        boolean boolean59 = pricingRequest57.seasonalSale();
        double double60 = pricingRequest57.basePrice();
        double double61 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        java.lang.String str62 = pricingRequest57.toString();
        int int63 = pricingRequest57.quantity();
        double double64 = pricingRequest57.basePrice();
        java.lang.String str65 = pricingRequest57.toString();
        boolean boolean66 = pricingRequest32.equals((java.lang.Object) str65);
        boolean boolean67 = pricingRequest32.seasonalSale();
        java.lang.String str68 = pricingRequest32.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 8.67d + "'", double61 == 8.67d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str62, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType4, false, "", true, (int) '#');
        int int15 = pricingRequest14.quantity();
        java.lang.String str16 = pricingRequest14.couponCode();
        int int17 = pricingRequest14.quantity();
        int int18 = pricingRequest14.quantity();
        boolean boolean19 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType14, true, "", false, (int) (byte) 0);
        java.lang.String str25 = pricingRequest24.couponCode();
        double double26 = pricingRequest24.basePrice();
        java.lang.String str27 = pricingRequest24.toString();
        boolean boolean28 = pricingRequest24.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 100, customerType4, false, "", false, (int) (byte) 1);
        double double15 = pricingRequest14.basePrice();
        boolean boolean16 = pricingRequest14.seasonalSale();
        double double17 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) '#', customerType8, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (short) 100, customerType8, true, "hi!", true, (int) (byte) 100);
        java.lang.String str29 = pricingRequest28.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType36, true, "hi!", true, (int) (short) 0);
        java.lang.String str42 = pricingRequest41.couponCode();
        boolean boolean43 = pricingRequest41.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest41.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType44, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 1, customerType44, false, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", true, (int) (short) -1);
        boolean boolean55 = pricingRequest28.equals((java.lang.Object) (short) -1);
        java.lang.String str56 = pricingRequest28.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        double double14 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest8.customerType();
        java.lang.String str14 = pricingRequest8.couponCode();
        java.lang.String str15 = pricingRequest8.couponCode();
        boolean boolean16 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine17 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType20, true, "hi!", true, (int) (short) 0);
        int int26 = pricingRequest25.loyaltyPoints();
        boolean boolean27 = pricingRequest25.seasonalSale();
        double double28 = pricingRequest25.basePrice();
        double double29 = pricingEngine17.calculateFinalPrice(pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        java.lang.String str38 = pricingRequest37.couponCode();
        boolean boolean39 = pricingRequest37.firstOrder();
        boolean boolean40 = pricingRequest37.firstOrder();
        double double41 = pricingEngine17.calculateFinalPrice(pricingRequest37);
        int int42 = pricingRequest37.loyaltyPoints();
        java.lang.String str43 = pricingRequest37.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest37.customerType();
        boolean boolean45 = pricingRequest8.equals((java.lang.Object) pricingRequest37);
        int int46 = pricingRequest8.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 8.67d + "'", double29 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 8.67d + "'", double41 == 8.67d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str43, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        double double17 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        int int12 = pricingRequest11.loyaltyPoints();
        boolean boolean13 = pricingRequest11.seasonalSale();
        double double14 = pricingRequest11.basePrice();
        int int15 = pricingRequest11.loyaltyPoints();
        java.lang.Object obj16 = null;
        boolean boolean17 = pricingRequest11.equals(obj16);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType18, true, "hi!", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 97, customerType18, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType39, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType39, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        double double50 = pricingRequest49.basePrice();
        com.viktor.lab4.PricingEngine pricingEngine51 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType54, true, "hi!", true, (int) (short) 0);
        int int60 = pricingRequest59.loyaltyPoints();
        boolean boolean61 = pricingRequest59.seasonalSale();
        boolean boolean62 = pricingRequest59.seasonalSale();
        double double63 = pricingEngine51.calculateFinalPrice(pricingRequest59);
        boolean boolean64 = pricingRequest59.firstOrder();
        java.lang.String str65 = pricingRequest59.toString();
        double double66 = pricingRequest59.basePrice();
        boolean boolean67 = pricingRequest49.equals((java.lang.Object) pricingRequest59);
        java.lang.String str68 = pricingRequest49.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest49.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest74 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) -1, customerType69, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]", false, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) 'a', customerType69, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, 32);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest84 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) (short) 1, customerType69, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (-1));
        boolean boolean85 = pricingRequest28.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 8.67d + "'", double63 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str68, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        int int24 = pricingRequest20.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        int int33 = pricingRequest32.loyaltyPoints();
        boolean boolean34 = pricingRequest32.seasonalSale();
        double double35 = pricingRequest32.basePrice();
        int int36 = pricingRequest32.loyaltyPoints();
        java.lang.String str37 = pricingRequest32.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest32.customerType();
        int int39 = pricingRequest32.quantity();
        boolean boolean40 = pricingRequest20.equals((java.lang.Object) int39);
        double double41 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType46, true, "hi!", true, (int) (short) 0);
        java.lang.String str52 = pricingRequest51.couponCode();
        boolean boolean53 = pricingRequest51.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest51.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType54, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest59.customerType();
        java.lang.String str61 = pricingRequest59.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest71 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType66, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 100, customerType66, false, "", false, (int) (byte) 1);
        int int77 = pricingRequest76.quantity();
        boolean boolean78 = pricingRequest59.equals((java.lang.Object) pricingRequest76);
        boolean boolean79 = pricingRequest76.firstOrder();
        double double80 = pricingEngine0.calculateFinalPrice(pricingRequest76);
        java.lang.String str81 = pricingRequest76.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 8.67d + "'", double41 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str61, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 7.99d + "'", double80 == 7.99d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=1]" + "'", str81, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=1]");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.loyaltyPoints();
        boolean boolean10 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType12, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest17.customerType();
        boolean boolean19 = pricingRequest17.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine20 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType23, true, "hi!", true, (int) (short) 0);
        int int29 = pricingRequest28.loyaltyPoints();
        boolean boolean30 = pricingRequest28.seasonalSale();
        double double31 = pricingRequest28.basePrice();
        double double32 = pricingEngine20.calculateFinalPrice(pricingRequest28);
        double double33 = pricingRequest28.basePrice();
        java.lang.Class<?> wildcardClass34 = pricingRequest28.getClass();
        boolean boolean35 = pricingRequest17.equals((java.lang.Object) pricingRequest28);
        java.lang.String str36 = pricingRequest17.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 8.67d + "'", double32 == 8.67d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str36, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType28, true, "hi!", true, (int) (short) 0);
        double double34 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine pricingEngine35 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType38, true, "hi!", true, (int) (short) 0);
        int int44 = pricingRequest43.loyaltyPoints();
        boolean boolean45 = pricingRequest43.seasonalSale();
        double double46 = pricingRequest43.basePrice();
        boolean boolean47 = pricingRequest43.firstOrder();
        double double48 = pricingEngine35.calculateFinalPrice(pricingRequest43);
        java.lang.String str49 = pricingRequest43.toString();
        double double50 = pricingRequest43.basePrice();
        double double51 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.67d + "'", double25 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 8.67d + "'", double34 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 8.67d + "'", double48 == 8.67d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str49, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 8.67d + "'", double51 == 8.67d);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.String str14 = pricingRequest7.toString();
        boolean boolean15 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType22, true, "hi!", true, (int) (short) 0);
        java.lang.String str28 = pricingRequest27.couponCode();
        boolean boolean29 = pricingRequest27.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest27.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType30, false, "", true, (int) (byte) -1);
        boolean boolean36 = pricingRequest35.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest35.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType37, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]", true, (int) (short) 1);
        boolean boolean43 = pricingRequest7.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType6, false, "", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 0, customerType17, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (int) (short) 0);
        double double23 = pricingRequest22.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        java.lang.String str25 = pricingRequest20.toString();
        int int26 = pricingRequest20.loyaltyPoints();
        java.lang.String str27 = pricingRequest20.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.viktor.lab4.PricingEngine pricingEngine6 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType9, true, "hi!", true, (int) (short) 0);
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.seasonalSale();
        boolean boolean17 = pricingRequest14.seasonalSale();
        double double18 = pricingEngine6.calculateFinalPrice(pricingRequest14);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest14.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (short) 100, customerType19, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 0, customerType19, false, "hi!", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 35, customerType19, false, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]", false, 97);
        java.lang.String str35 = pricingRequest34.toString();
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.67d + "'", double18 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=97]" + "'", str35, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=97]");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        java.lang.String str46 = pricingRequest45.couponCode();
        boolean boolean48 = pricingRequest45.equals((java.lang.Object) 10L);
        double double49 = pricingRequest45.basePrice();
        boolean boolean50 = pricingRequest45.firstOrder();
        double double51 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        int int52 = pricingRequest45.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 8.67d + "'", double51 == 8.67d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.viktor.lab4.PricingEngine pricingEngine8 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType11, true, "hi!", true, (int) (short) 0);
        int int17 = pricingRequest16.loyaltyPoints();
        boolean boolean18 = pricingRequest16.seasonalSale();
        double double19 = pricingRequest16.basePrice();
        boolean boolean20 = pricingRequest16.firstOrder();
        double double21 = pricingEngine8.calculateFinalPrice(pricingRequest16);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType26, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType26, false, "", true, (int) '#');
        double double37 = pricingEngine8.calculateFinalPrice(pricingRequest36);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        int int46 = pricingRequest45.loyaltyPoints();
        boolean boolean47 = pricingRequest45.seasonalSale();
        double double48 = pricingRequest45.basePrice();
        boolean boolean49 = pricingRequest45.firstOrder();
        boolean boolean50 = pricingRequest45.seasonalSale();
        int int51 = pricingRequest45.loyaltyPoints();
        double double52 = pricingRequest45.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType57, true, "hi!", true, (int) (short) 0);
        java.lang.String str63 = pricingRequest62.couponCode();
        boolean boolean64 = pricingRequest62.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = pricingRequest62.customerType();
        java.lang.String str66 = pricingRequest62.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest62.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType67, true, "", false, (int) (short) -1);
        boolean boolean73 = pricingRequest45.equals((java.lang.Object) pricingRequest72);
        double double74 = pricingEngine8.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest(737.99d, 1, customerType75, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest85 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 10, customerType75, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest90 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType75, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest95 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) ' ', customerType75, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType96 = pricingRequest95.customerType();
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.67d + "'", double21 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 737.99d + "'", double37 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str66, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 8.67d + "'", double74 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType96 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType96.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        boolean boolean15 = pricingRequest8.firstOrder();
        java.lang.String str16 = pricingRequest8.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 100, customerType4, false, "", false, (int) (byte) 1);
        boolean boolean15 = pricingRequest14.seasonalSale();
        java.lang.String str16 = pricingRequest14.couponCode();
        boolean boolean17 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType14, true, "", false, (int) (byte) 0);
        boolean boolean25 = pricingRequest24.seasonalSale();
        int int26 = pricingRequest24.loyaltyPoints();
        double double27 = pricingRequest24.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        double double13 = pricingRequest10.basePrice();
        boolean boolean14 = pricingRequest10.firstOrder();
        double double15 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType20, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType20, false, "", true, (int) '#');
        double double31 = pricingEngine2.calculateFinalPrice(pricingRequest30);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType34, true, "hi!", true, (int) (short) 0);
        int int40 = pricingRequest39.loyaltyPoints();
        boolean boolean41 = pricingRequest39.seasonalSale();
        double double42 = pricingRequest39.basePrice();
        boolean boolean43 = pricingRequest39.firstOrder();
        boolean boolean44 = pricingRequest39.seasonalSale();
        int int45 = pricingRequest39.loyaltyPoints();
        double double46 = pricingRequest39.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType51, true, "hi!", true, (int) (short) 0);
        java.lang.String str57 = pricingRequest56.couponCode();
        boolean boolean58 = pricingRequest56.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest56.customerType();
        java.lang.String str60 = pricingRequest56.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = pricingRequest56.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType61, true, "", false, (int) (short) -1);
        boolean boolean67 = pricingRequest39.equals((java.lang.Object) pricingRequest66);
        double double68 = pricingEngine2.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest74 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (-1), customerType69, true, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        java.lang.Class<?> wildcardClass75 = customerType69.getClass();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.67d + "'", double15 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 737.99d + "'", double31 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str60, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 8.67d + "'", double68 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean34 = pricingRequest32.firstOrder();
        int int35 = pricingRequest32.loyaltyPoints();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine pricingEngine37 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        int int46 = pricingRequest45.loyaltyPoints();
        boolean boolean47 = pricingRequest45.seasonalSale();
        boolean boolean48 = pricingRequest45.seasonalSale();
        double double49 = pricingEngine37.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType52, true, "hi!", true, (int) (short) 0);
        int int58 = pricingRequest57.loyaltyPoints();
        boolean boolean59 = pricingRequest57.seasonalSale();
        double double60 = pricingRequest57.basePrice();
        boolean boolean61 = pricingRequest57.firstOrder();
        double double62 = pricingEngine37.calculateFinalPrice(pricingRequest57);
        int int63 = pricingRequest57.quantity();
        double double64 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        java.lang.Class<?> wildcardClass65 = pricingRequest57.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 8.67d + "'", double36 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 8.67d + "'", double49 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 8.67d + "'", double62 == 8.67d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 8.67d + "'", double64 == 8.67d);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 0, customerType4, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (short) 1, customerType4, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]", false, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType28, true, "hi!", true, (int) (short) 0);
        double double34 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        boolean boolean35 = pricingRequest33.seasonalSale();
        double double36 = pricingRequest33.basePrice();
        java.lang.String str37 = pricingRequest33.toString();
        java.lang.String str38 = pricingRequest33.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.67d + "'", double25 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 8.67d + "'", double34 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str37, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        int int24 = pricingRequest20.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        int int33 = pricingRequest32.loyaltyPoints();
        boolean boolean34 = pricingRequest32.seasonalSale();
        double double35 = pricingRequest32.basePrice();
        int int36 = pricingRequest32.loyaltyPoints();
        java.lang.String str37 = pricingRequest32.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest32.customerType();
        int int39 = pricingRequest32.quantity();
        boolean boolean40 = pricingRequest20.equals((java.lang.Object) int39);
        double double41 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double43 = pricingEngine0.calculateFinalPrice(pricingRequest42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 8.67d + "'", double41 == 8.67d);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        java.lang.String str38 = pricingRequest32.toString();
        boolean boolean39 = pricingRequest32.seasonalSale();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType43, true, "hi!", true, (int) (short) 0);
        java.lang.String str49 = pricingRequest48.couponCode();
        boolean boolean51 = pricingRequest48.equals((java.lang.Object) 10L);
        double double52 = pricingRequest48.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest48.customerType();
        boolean boolean54 = pricingRequest48.firstOrder();
        boolean boolean55 = pricingRequest48.seasonalSale();
        double double56 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        java.lang.String str57 = pricingRequest48.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 8.67d + "'", double56 == 8.67d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        double double13 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 0, customerType16, false, "", false, (int) '#');
        com.viktor.lab4.PricingEngine pricingEngine22 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType25, true, "hi!", true, (int) (short) 0);
        int int31 = pricingRequest30.loyaltyPoints();
        boolean boolean32 = pricingRequest30.seasonalSale();
        double double33 = pricingRequest30.basePrice();
        boolean boolean34 = pricingRequest30.firstOrder();
        double double35 = pricingEngine22.calculateFinalPrice(pricingRequest30);
        boolean boolean36 = pricingRequest21.equals((java.lang.Object) pricingEngine22);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType39, true, "hi!", true, (int) (short) 0);
        java.lang.String str45 = pricingRequest44.couponCode();
        boolean boolean46 = pricingRequest44.firstOrder();
        java.lang.String str47 = pricingRequest44.toString();
        double double48 = pricingEngine22.calculateFinalPrice(pricingRequest44);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest44.customerType();
        boolean boolean50 = pricingRequest44.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 8.67d + "'", double35 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 8.67d + "'", double48 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType18, false, "", true, (int) '#');
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.seasonalSale();
        double double40 = pricingRequest37.basePrice();
        boolean boolean41 = pricingRequest37.firstOrder();
        boolean boolean42 = pricingRequest37.seasonalSale();
        int int43 = pricingRequest37.loyaltyPoints();
        double double44 = pricingRequest37.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType49, true, "hi!", true, (int) (short) 0);
        java.lang.String str55 = pricingRequest54.couponCode();
        boolean boolean56 = pricingRequest54.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest54.customerType();
        java.lang.String str58 = pricingRequest54.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType59, true, "", false, (int) (short) -1);
        boolean boolean65 = pricingRequest37.equals((java.lang.Object) pricingRequest64);
        double double66 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        int int67 = pricingRequest37.quantity();
        java.lang.Class<?> wildcardClass68 = pricingRequest37.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 737.99d + "'", double29 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str58, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 8.67d + "'", double66 == 8.67d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        boolean boolean13 = pricingRequest10.seasonalSale();
        double double14 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (short) 100, customerType15, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        java.lang.String str22 = pricingRequest20.toString();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]" + "'", str22, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        boolean boolean20 = pricingRequest19.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) ' ', customerType21, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=100]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType29, true, "hi!", true, (int) (short) 0);
        int int35 = pricingRequest34.loyaltyPoints();
        java.lang.String str36 = pricingRequest34.couponCode();
        int int37 = pricingRequest34.loyaltyPoints();
        double double38 = pricingRequest34.basePrice();
        boolean boolean39 = pricingRequest26.equals((java.lang.Object) pricingRequest34);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        java.lang.String str15 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType18, false, "", true, (int) '#');
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.seasonalSale();
        double double40 = pricingRequest37.basePrice();
        boolean boolean41 = pricingRequest37.firstOrder();
        boolean boolean42 = pricingRequest37.seasonalSale();
        int int43 = pricingRequest37.loyaltyPoints();
        double double44 = pricingRequest37.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType49, true, "hi!", true, (int) (short) 0);
        java.lang.String str55 = pricingRequest54.couponCode();
        boolean boolean56 = pricingRequest54.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest54.customerType();
        java.lang.String str58 = pricingRequest54.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType59, true, "", false, (int) (short) -1);
        boolean boolean65 = pricingRequest37.equals((java.lang.Object) pricingRequest64);
        double double66 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest37.customerType();
        boolean boolean68 = pricingRequest37.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 737.99d + "'", double29 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str58, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 8.67d + "'", double66 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        boolean boolean25 = pricingRequest22.seasonalSale();
        java.lang.String str26 = pricingRequest22.toString();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        boolean boolean28 = pricingRequest22.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        java.lang.String str38 = pricingRequest32.toString();
        boolean boolean39 = pricingRequest32.seasonalSale();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType43, true, "hi!", true, (int) (short) 0);
        java.lang.String str49 = pricingRequest48.couponCode();
        boolean boolean51 = pricingRequest48.equals((java.lang.Object) 10L);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest48.customerType();
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType56, true, "hi!", true, (int) (short) 0);
        int int62 = pricingRequest61.loyaltyPoints();
        boolean boolean63 = pricingRequest61.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest61.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = pricingRequest61.customerType();
        double double66 = pricingEngine0.calculateFinalPrice(pricingRequest61);
        com.viktor.lab4.PricingEngine pricingEngine67 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType70, true, "hi!", true, (int) (short) 0);
        int int76 = pricingRequest75.loyaltyPoints();
        boolean boolean77 = pricingRequest75.seasonalSale();
        double double78 = pricingRequest75.basePrice();
        double double79 = pricingEngine67.calculateFinalPrice(pricingRequest75);
        java.lang.String str80 = pricingRequest75.toString();
        int int81 = pricingRequest75.quantity();
        double double82 = pricingRequest75.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType83 = pricingRequest75.customerType();
        boolean boolean84 = pricingRequest75.seasonalSale();
        java.lang.String str85 = pricingRequest75.couponCode();
        double double86 = pricingEngine0.calculateFinalPrice(pricingRequest75);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8.67d + "'", double53 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 8.67d + "'", double66 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 8.67d + "'", double79 == 8.67d);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str80, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType83 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType83.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 8.67d + "'", double86 == 8.67d);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (short) 1, customerType6, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.viktor.lab4.PricingEngine pricingEngine6 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType9, true, "hi!", true, (int) (short) 0);
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.seasonalSale();
        boolean boolean17 = pricingRequest14.seasonalSale();
        double double18 = pricingEngine6.calculateFinalPrice(pricingRequest14);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType21, true, "hi!", true, (int) (short) 0);
        int int27 = pricingRequest26.loyaltyPoints();
        boolean boolean28 = pricingRequest26.seasonalSale();
        double double29 = pricingRequest26.basePrice();
        boolean boolean30 = pricingRequest26.firstOrder();
        double double31 = pricingEngine6.calculateFinalPrice(pricingRequest26);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(737.99d, 10, customerType32, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest37.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) -1, customerType38, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 52, 1, customerType38, false, "", true, 97);
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType55, true, "hi!", true, (int) (short) 0);
        java.lang.String str61 = pricingRequest60.couponCode();
        boolean boolean62 = pricingRequest60.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest60.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType63, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) (short) 1, customerType63, false, "", false, 35);
        java.lang.String str74 = pricingRequest73.couponCode();
        boolean boolean75 = pricingRequest48.equals((java.lang.Object) pricingRequest73);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.67d + "'", double18 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 8.67d + "'", double31 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (byte) -1, customerType2, false, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", false, (int) (short) 10);
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass9 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        double double19 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine pricingEngine20 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType23, true, "hi!", true, (int) (short) 0);
        int int29 = pricingRequest28.loyaltyPoints();
        boolean boolean30 = pricingRequest28.seasonalSale();
        boolean boolean31 = pricingRequest28.seasonalSale();
        double double32 = pricingEngine20.calculateFinalPrice(pricingRequest28);
        boolean boolean33 = pricingRequest28.firstOrder();
        java.lang.String str34 = pricingRequest28.toString();
        double double35 = pricingRequest28.basePrice();
        boolean boolean36 = pricingRequest18.equals((java.lang.Object) pricingRequest28);
        java.lang.String str37 = pricingRequest18.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) -1, customerType38, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]", false, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 10, customerType38, false, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]", true, (int) '4');
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 8.67d + "'", double32 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str34, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str37, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        int int13 = pricingRequest9.loyaltyPoints();
        int int14 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(2282.99d, 97, customerType15, false, "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", false, 1);
        int int21 = pricingRequest20.quantity();
        boolean boolean22 = pricingRequest20.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        int int13 = pricingRequest8.quantity();
        double double14 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        java.lang.String str23 = pricingRequest22.couponCode();
        boolean boolean24 = pricingRequest8.equals((java.lang.Object) pricingRequest22);
        java.lang.String str25 = pricingRequest8.toString();
        java.lang.String str26 = pricingRequest8.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType8, true, "hi!", true, (int) (short) 0);
        java.lang.String str14 = pricingRequest13.couponCode();
        boolean boolean15 = pricingRequest13.firstOrder();
        boolean boolean16 = pricingRequest13.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType17, false, "", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 0, customerType17, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 0, customerType17, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, 10);
        int int33 = pricingRequest32.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest32.customerType();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType14, true, "hi!", true, (int) (short) 0);
        int int20 = pricingRequest19.loyaltyPoints();
        boolean boolean21 = pricingRequest19.seasonalSale();
        double double22 = pricingRequest19.basePrice();
        int int23 = pricingRequest19.loyaltyPoints();
        java.lang.String str24 = pricingRequest19.couponCode();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        boolean boolean26 = pricingRequest7.seasonalSale();
        boolean boolean27 = pricingRequest7.seasonalSale();
        int int28 = pricingRequest7.quantity();
        java.lang.String str29 = pricingRequest7.toString();
        java.lang.String str30 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        boolean boolean16 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest9.customerType();
        int int18 = pricingRequest9.loyaltyPoints();
        boolean boolean19 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 0, customerType20, false, "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", false, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = customerType20.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 1, customerType14, false, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", true, (int) (short) -1);
        double double25 = pricingRequest24.basePrice();
        int int26 = pricingRequest24.quantity();
        java.lang.String str27 = pricingRequest24.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest24.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]" + "'", str27, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        boolean boolean13 = pricingRequest10.seasonalSale();
        double double14 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        boolean boolean26 = pricingRequest22.firstOrder();
        double double27 = pricingEngine2.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 35, customerType28, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", true, (-1));
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.String str14 = pricingRequest7.toString();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine pricingEngine1 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        boolean boolean13 = pricingRequest9.firstOrder();
        double double14 = pricingEngine1.calculateFinalPrice(pricingRequest9);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        boolean boolean26 = pricingRequest22.firstOrder();
        double double27 = pricingEngine1.calculateFinalPrice(pricingRequest22);
        java.lang.String str28 = pricingRequest22.toString();
        boolean boolean29 = pricingRequest22.seasonalSale();
        int int30 = pricingRequest22.loyaltyPoints();
        double double31 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType38, true, "hi!", true, (int) (short) 0);
        java.lang.String str44 = pricingRequest43.couponCode();
        boolean boolean45 = pricingRequest43.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest43.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType46, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType46, true, "", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest56.customerType();
        int int58 = pricingRequest56.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType61, true, "hi!", true, (int) (short) 0);
        int int67 = pricingRequest66.loyaltyPoints();
        boolean boolean68 = pricingRequest66.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest66.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest66.customerType();
        java.lang.String str71 = pricingRequest66.couponCode();
        boolean boolean72 = pricingRequest66.seasonalSale();
        int int73 = pricingRequest66.quantity();
        boolean boolean74 = pricingRequest56.equals((java.lang.Object) pricingRequest66);
        double double75 = pricingEngine0.calculateFinalPrice(pricingRequest56);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 8.67d + "'", double31 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 8.72d + "'", double75 == 8.72d);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType11, true, "hi!", true, (int) (short) 0);
        java.lang.String str17 = pricingRequest16.couponCode();
        boolean boolean19 = pricingRequest16.equals((java.lang.Object) 10L);
        int int20 = pricingRequest16.loyaltyPoints();
        java.lang.String str21 = pricingRequest16.toString();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) str21);
        java.lang.String str23 = pricingRequest7.couponCode();
        double double24 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        boolean boolean13 = pricingRequest7.firstOrder();
        int int14 = pricingRequest7.quantity();
        boolean boolean15 = pricingRequest7.seasonalSale();
        int int16 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType18, false, "", true, (int) '#');
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine pricingEngine30 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType33, true, "hi!", true, (int) (short) 0);
        int int39 = pricingRequest38.loyaltyPoints();
        boolean boolean40 = pricingRequest38.seasonalSale();
        double double41 = pricingRequest38.basePrice();
        double double42 = pricingEngine30.calculateFinalPrice(pricingRequest38);
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType45, true, "hi!", true, (int) (short) 0);
        java.lang.String str51 = pricingRequest50.couponCode();
        boolean boolean52 = pricingRequest50.firstOrder();
        boolean boolean53 = pricingRequest50.firstOrder();
        double double54 = pricingEngine30.calculateFinalPrice(pricingRequest50);
        java.lang.String str55 = pricingRequest50.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType62, true, "hi!", true, (int) (short) 0);
        java.lang.String str68 = pricingRequest67.couponCode();
        boolean boolean69 = pricingRequest67.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest67.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType70, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType70, true, "", false, (int) (byte) 0);
        java.lang.String str81 = pricingRequest80.couponCode();
        double double82 = pricingRequest80.basePrice();
        boolean boolean83 = pricingRequest50.equals((java.lang.Object) pricingRequest80);
        double double84 = pricingRequest50.basePrice();
        double double85 = pricingRequest50.basePrice();
        int int86 = pricingRequest50.quantity();
        double double87 = pricingEngine0.calculateFinalPrice(pricingRequest50);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 737.99d + "'", double29 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 8.67d + "'", double42 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 8.67d + "'", double54 == 8.67d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str55, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType62 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType62.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 8.67d + "'", double87 == 8.67d);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        int int25 = pricingRequest20.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType28, true, "hi!", true, (int) (short) 0);
        java.lang.String str34 = pricingRequest33.couponCode();
        boolean boolean35 = pricingRequest33.firstOrder();
        java.lang.String str36 = pricingRequest33.toString();
        java.lang.Class<?> wildcardClass37 = pricingRequest33.getClass();
        boolean boolean38 = pricingRequest20.equals((java.lang.Object) pricingRequest33);
        java.lang.String str39 = pricingRequest20.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str36, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str39, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType14, true, "hi!", true, (int) (short) 0);
        int int20 = pricingRequest19.loyaltyPoints();
        boolean boolean21 = pricingRequest19.seasonalSale();
        double double22 = pricingRequest19.basePrice();
        int int23 = pricingRequest19.loyaltyPoints();
        java.lang.String str24 = pricingRequest19.couponCode();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        boolean boolean26 = pricingRequest7.seasonalSale();
        boolean boolean27 = pricingRequest7.seasonalSale();
        int int28 = pricingRequest7.loyaltyPoints();
        java.lang.String str29 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 100, customerType4, false, "", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        java.lang.String str23 = pricingRequest22.couponCode();
        boolean boolean24 = pricingRequest22.firstOrder();
        boolean boolean25 = pricingRequest22.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest22.customerType();
        boolean boolean27 = pricingRequest14.equals((java.lang.Object) pricingRequest22);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        double double15 = pricingRequest7.basePrice();
        java.lang.String str16 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        int int18 = pricingRequest7.loyaltyPoints();
        int int19 = pricingRequest7.quantity();
        int int20 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        double double13 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 0, customerType16, false, "", false, (int) '#');
        com.viktor.lab4.PricingEngine pricingEngine22 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType25, true, "hi!", true, (int) (short) 0);
        int int31 = pricingRequest30.loyaltyPoints();
        boolean boolean32 = pricingRequest30.seasonalSale();
        double double33 = pricingRequest30.basePrice();
        boolean boolean34 = pricingRequest30.firstOrder();
        double double35 = pricingEngine22.calculateFinalPrice(pricingRequest30);
        boolean boolean36 = pricingRequest21.equals((java.lang.Object) pricingEngine22);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType39, true, "hi!", true, (int) (short) 0);
        java.lang.String str45 = pricingRequest44.couponCode();
        boolean boolean46 = pricingRequest44.firstOrder();
        java.lang.String str47 = pricingRequest44.toString();
        double double48 = pricingEngine22.calculateFinalPrice(pricingRequest44);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType51, true, "hi!", true, (int) (short) 0);
        int int57 = pricingRequest56.loyaltyPoints();
        boolean boolean58 = pricingRequest56.seasonalSale();
        double double59 = pricingRequest56.basePrice();
        boolean boolean60 = pricingRequest56.firstOrder();
        boolean boolean61 = pricingRequest56.seasonalSale();
        int int62 = pricingRequest56.loyaltyPoints();
        double double63 = pricingRequest56.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType68, true, "hi!", true, (int) (short) 0);
        java.lang.String str74 = pricingRequest73.couponCode();
        boolean boolean75 = pricingRequest73.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType76 = pricingRequest73.customerType();
        java.lang.String str77 = pricingRequest73.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType78 = pricingRequest73.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest83 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType78, true, "", false, (int) (short) -1);
        boolean boolean84 = pricingRequest56.equals((java.lang.Object) pricingRequest83);
        com.viktor.lab4.PricingEngine.CustomerType customerType85 = pricingRequest83.customerType();
        java.lang.String str86 = pricingRequest83.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double87 = pricingEngine22.calculateFinalPrice(pricingRequest83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 8.67d + "'", double35 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 8.67d + "'", double48 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + customerType76 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType76.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str77, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType78 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType78.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + customerType85 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType85.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]" + "'", str86, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        int int12 = pricingRequest11.loyaltyPoints();
        boolean boolean13 = pricingRequest11.seasonalSale();
        double double14 = pricingRequest11.basePrice();
        int int15 = pricingRequest11.loyaltyPoints();
        java.lang.Object obj16 = null;
        boolean boolean17 = pricingRequest11.equals(obj16);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 1, customerType18, true, "hi!", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 0, customerType24, false, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, 10);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        int int14 = pricingRequest8.quantity();
        java.lang.String str15 = pricingRequest8.couponCode();
        boolean boolean16 = pricingRequest8.firstOrder();
        boolean boolean17 = pricingRequest8.firstOrder();
        java.lang.String str18 = pricingRequest8.couponCode();
        java.lang.String str19 = pricingRequest8.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str19, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 10L);
        double double13 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 0, customerType16, false, "", false, (int) '#');
        com.viktor.lab4.PricingEngine pricingEngine22 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType25, true, "hi!", true, (int) (short) 0);
        int int31 = pricingRequest30.loyaltyPoints();
        boolean boolean32 = pricingRequest30.seasonalSale();
        double double33 = pricingRequest30.basePrice();
        boolean boolean34 = pricingRequest30.firstOrder();
        double double35 = pricingEngine22.calculateFinalPrice(pricingRequest30);
        boolean boolean36 = pricingRequest21.equals((java.lang.Object) pricingEngine22);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double38 = pricingEngine22.calculateFinalPrice(pricingRequest37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 8.67d + "'", double35 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine pricingEngine13 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        double double26 = pricingEngine13.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType29, true, "hi!", true, (int) (short) 0);
        int int35 = pricingRequest34.loyaltyPoints();
        boolean boolean36 = pricingRequest34.seasonalSale();
        double double37 = pricingRequest34.basePrice();
        boolean boolean38 = pricingRequest34.firstOrder();
        double double39 = pricingEngine13.calculateFinalPrice(pricingRequest34);
        java.lang.String str40 = pricingRequest34.toString();
        boolean boolean41 = pricingRequest34.seasonalSale();
        int int42 = pricingRequest34.loyaltyPoints();
        int int43 = pricingRequest34.quantity();
        double double44 = pricingEngine0.calculateFinalPrice(pricingRequest34);
        int int45 = pricingRequest34.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 8.67d + "'", double39 == 8.67d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str40, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 8.67d + "'", double44 == 8.67d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType18, false, "", true, (int) '#');
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine pricingEngine30 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType33, true, "hi!", true, (int) (short) 0);
        int int39 = pricingRequest38.loyaltyPoints();
        boolean boolean40 = pricingRequest38.seasonalSale();
        double double41 = pricingRequest38.basePrice();
        boolean boolean42 = pricingRequest38.firstOrder();
        double double43 = pricingEngine30.calculateFinalPrice(pricingRequest38);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType48, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType48, false, "", true, (int) '#');
        double double59 = pricingEngine30.calculateFinalPrice(pricingRequest58);
        double double60 = pricingEngine0.calculateFinalPrice(pricingRequest58);
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType63, true, "hi!", true, (int) (short) 0);
        java.lang.String str69 = pricingRequest68.couponCode();
        boolean boolean71 = pricingRequest68.equals((java.lang.Object) 10L);
        int int72 = pricingRequest68.quantity();
        double double73 = pricingRequest68.basePrice();
        double double74 = pricingEngine0.calculateFinalPrice(pricingRequest68);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 737.99d + "'", double29 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 8.67d + "'", double43 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 737.99d + "'", double59 == 737.99d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 737.99d + "'", double60 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 8.67d + "'", double74 == 8.67d);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (short) 1, customerType8, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 1, customerType8, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        boolean boolean29 = pricingRequest28.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType8, false, "", true, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, 10, customerType8, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) '#', customerType8, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", false, (int) 'a');
        int int29 = pricingRequest28.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (byte) -1, customerType2, false, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", false, (int) (short) 10);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType11, true, "hi!", true, (int) (short) 0);
        int int17 = pricingRequest16.loyaltyPoints();
        boolean boolean18 = pricingRequest16.seasonalSale();
        double double19 = pricingRequest16.basePrice();
        boolean boolean20 = pricingRequest16.firstOrder();
        boolean boolean21 = pricingRequest16.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest16.customerType();
        int int23 = pricingRequest16.loyaltyPoints();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) int23);
        int int25 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 52, 10, customerType2, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]", false, (int) (short) 0);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        java.lang.String str15 = pricingRequest7.couponCode();
        boolean boolean16 = pricingRequest7.seasonalSale();
        double double17 = pricingRequest7.basePrice();
        java.lang.String str18 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str18, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        double double15 = pricingRequest7.basePrice();
        int int16 = pricingRequest7.loyaltyPoints();
        double double17 = pricingRequest7.basePrice();
        java.lang.String str18 = pricingRequest7.couponCode();
        double double19 = pricingRequest7.basePrice();
        boolean boolean20 = pricingRequest7.seasonalSale();
        boolean boolean21 = pricingRequest7.seasonalSale();
        boolean boolean22 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        java.lang.String str25 = pricingRequest20.couponCode();
        double double26 = pricingRequest20.basePrice();
        int int27 = pricingRequest20.quantity();
        boolean boolean28 = pricingRequest20.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest8.customerType();
        java.lang.String str14 = pricingRequest8.couponCode();
        java.lang.String str15 = pricingRequest8.couponCode();
        boolean boolean16 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType25, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType25, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) '#', customerType25, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) 'a', customerType25, false, "", true, 10);
        java.lang.Class<?> wildcardClass46 = pricingRequest45.getClass();
        boolean boolean47 = pricingRequest8.equals((java.lang.Object) pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType50, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest55.customerType();
        boolean boolean57 = pricingRequest8.equals((java.lang.Object) pricingRequest55);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        boolean boolean13 = pricingRequest9.firstOrder();
        boolean boolean14 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (short) 0, customerType15, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean13 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine pricingEngine14 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        double double26 = pricingEngine14.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType29, true, "hi!", true, (int) (short) 0);
        java.lang.String str35 = pricingRequest34.couponCode();
        boolean boolean36 = pricingRequest34.firstOrder();
        boolean boolean37 = pricingRequest34.firstOrder();
        double double38 = pricingEngine14.calculateFinalPrice(pricingRequest34);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType41, true, "hi!", true, (int) (short) 0);
        java.lang.String str47 = pricingRequest46.couponCode();
        boolean boolean49 = pricingRequest46.equals((java.lang.Object) 10L);
        int int50 = pricingRequest46.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest46.customerType();
        java.lang.String str52 = pricingRequest46.toString();
        boolean boolean53 = pricingRequest46.seasonalSale();
        double double54 = pricingEngine14.calculateFinalPrice(pricingRequest46);
        boolean boolean55 = pricingRequest8.equals((java.lang.Object) double54);
        boolean boolean56 = pricingRequest8.firstOrder();
        double double57 = pricingRequest8.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 8.67d + "'", double38 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str52, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 8.67d + "'", double54 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        double double26 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        int int27 = pricingRequest21.loyaltyPoints();
        int int28 = pricingRequest21.quantity();
        java.lang.String str29 = pricingRequest21.couponCode();
        double double30 = pricingRequest21.basePrice();
        boolean boolean31 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        boolean boolean16 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest9.customerType();
        int int18 = pricingRequest9.loyaltyPoints();
        boolean boolean19 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 0, customerType20, false, "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]", false, (int) (byte) -1);
        java.lang.String str26 = pricingRequest25.toString();
        int int27 = pricingRequest25.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.toString();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        double double24 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean34 = pricingRequest32.firstOrder();
        boolean boolean35 = pricingRequest32.firstOrder();
        double double36 = pricingEngine12.calculateFinalPrice(pricingRequest32);
        boolean boolean37 = pricingRequest7.equals((java.lang.Object) pricingEngine12);
        int int38 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 8.67d + "'", double36 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        double double26 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType29, true, "hi!", true, (int) (short) 0);
        int int35 = pricingRequest34.loyaltyPoints();
        boolean boolean36 = pricingRequest34.seasonalSale();
        double double37 = pricingRequest34.basePrice();
        boolean boolean38 = pricingRequest34.firstOrder();
        boolean boolean39 = pricingRequest34.seasonalSale();
        int int40 = pricingRequest34.loyaltyPoints();
        double double41 = pricingRequest34.basePrice();
        java.lang.String str42 = pricingRequest34.toString();
        double double43 = pricingEngine0.calculateFinalPrice(pricingRequest34);
        com.viktor.lab4.PricingEngine pricingEngine44 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType47, true, "hi!", true, (int) (short) 0);
        int int53 = pricingRequest52.loyaltyPoints();
        boolean boolean54 = pricingRequest52.seasonalSale();
        boolean boolean55 = pricingRequest52.seasonalSale();
        double double56 = pricingEngine44.calculateFinalPrice(pricingRequest52);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType59, true, "hi!", true, (int) (short) 0);
        int int65 = pricingRequest64.loyaltyPoints();
        boolean boolean66 = pricingRequest64.seasonalSale();
        double double67 = pricingRequest64.basePrice();
        boolean boolean68 = pricingRequest64.firstOrder();
        double double69 = pricingEngine44.calculateFinalPrice(pricingRequest64);
        double double70 = pricingEngine0.calculateFinalPrice(pricingRequest64);
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType75, true, "hi!", true, (int) (short) 0);
        int int81 = pricingRequest80.loyaltyPoints();
        boolean boolean82 = pricingRequest80.seasonalSale();
        double double83 = pricingRequest80.basePrice();
        boolean boolean84 = pricingRequest80.firstOrder();
        boolean boolean85 = pricingRequest80.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType86 = pricingRequest80.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest91 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) ' ', customerType86, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 1);
        boolean boolean92 = pricingRequest91.seasonalSale();
        double double93 = pricingEngine0.calculateFinalPrice(pricingRequest91);
        int int94 = pricingRequest91.loyaltyPoints();
        int int95 = pricingRequest91.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType96 = pricingRequest91.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str42, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 8.67d + "'", double43 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 8.67d + "'", double56 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 8.67d + "'", double69 == 8.67d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 8.67d + "'", double70 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + customerType86 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType86.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 2025.59d + "'", double93 == 2025.59d);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + customerType96 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType96.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine15 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType18, true, "hi!", true, (int) (short) 0);
        int int24 = pricingRequest23.loyaltyPoints();
        boolean boolean25 = pricingRequest23.seasonalSale();
        boolean boolean26 = pricingRequest23.seasonalSale();
        double double27 = pricingEngine15.calculateFinalPrice(pricingRequest23);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType30, true, "hi!", true, (int) (short) 0);
        int int36 = pricingRequest35.loyaltyPoints();
        boolean boolean37 = pricingRequest35.seasonalSale();
        double double38 = pricingRequest35.basePrice();
        boolean boolean39 = pricingRequest35.firstOrder();
        double double40 = pricingEngine15.calculateFinalPrice(pricingRequest35);
        boolean boolean41 = pricingRequest7.equals((java.lang.Object) pricingEngine15);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType44, true, "hi!", true, (int) (short) 0);
        int int50 = pricingRequest49.loyaltyPoints();
        boolean boolean51 = pricingRequest49.seasonalSale();
        double double52 = pricingRequest49.basePrice();
        int int53 = pricingRequest49.loyaltyPoints();
        int int54 = pricingRequest49.quantity();
        double double55 = pricingEngine15.calculateFinalPrice(pricingRequest49);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType60, true, "hi!", true, (int) (short) 0);
        int int66 = pricingRequest65.loyaltyPoints();
        java.lang.String str67 = pricingRequest65.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest65.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (-1), customerType68, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = pricingRequest73.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double75 = pricingEngine15.calculateFinalPrice(pricingRequest73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 8.67d + "'", double55 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str67, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType4, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, 32);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 97, customerType4, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]", false, (int) ' ');
        int int15 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        boolean boolean13 = pricingRequest10.seasonalSale();
        double double14 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        boolean boolean26 = pricingRequest22.firstOrder();
        double double27 = pricingEngine2.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(737.99d, 10, customerType28, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType43, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType43, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        double double54 = pricingRequest53.basePrice();
        com.viktor.lab4.PricingEngine pricingEngine55 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType58, true, "hi!", true, (int) (short) 0);
        int int64 = pricingRequest63.loyaltyPoints();
        boolean boolean65 = pricingRequest63.seasonalSale();
        boolean boolean66 = pricingRequest63.seasonalSale();
        double double67 = pricingEngine55.calculateFinalPrice(pricingRequest63);
        boolean boolean68 = pricingRequest63.firstOrder();
        java.lang.String str69 = pricingRequest63.toString();
        double double70 = pricingRequest63.basePrice();
        boolean boolean71 = pricingRequest53.equals((java.lang.Object) pricingRequest63);
        java.lang.String str72 = pricingRequest53.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest53.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest78 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) -1, customerType73, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]", false, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest83 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) 'a', customerType73, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, 32);
        boolean boolean84 = pricingRequest33.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 8.67d + "'", double67 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str69, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str72, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType73 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType73.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean34 = pricingRequest32.firstOrder();
        int int35 = pricingRequest32.loyaltyPoints();
        double double36 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine pricingEngine37 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        int int46 = pricingRequest45.loyaltyPoints();
        boolean boolean47 = pricingRequest45.seasonalSale();
        boolean boolean48 = pricingRequest45.seasonalSale();
        double double49 = pricingEngine37.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType52, true, "hi!", true, (int) (short) 0);
        int int58 = pricingRequest57.loyaltyPoints();
        boolean boolean59 = pricingRequest57.seasonalSale();
        double double60 = pricingRequest57.basePrice();
        boolean boolean61 = pricingRequest57.firstOrder();
        double double62 = pricingEngine37.calculateFinalPrice(pricingRequest57);
        int int63 = pricingRequest57.quantity();
        double double64 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine pricingEngine69 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType72, true, "hi!", true, (int) (short) 0);
        int int78 = pricingRequest77.loyaltyPoints();
        boolean boolean79 = pricingRequest77.seasonalSale();
        boolean boolean80 = pricingRequest77.seasonalSale();
        double double81 = pricingEngine69.calculateFinalPrice(pricingRequest77);
        com.viktor.lab4.PricingEngine.CustomerType customerType82 = pricingRequest77.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest87 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (short) 100, customerType82, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 0);
        int int88 = pricingRequest87.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType89 = pricingRequest87.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest94 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 32, (int) 'a', customerType89, false, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType95 = pricingRequest94.customerType();
        double double96 = pricingEngine0.calculateFinalPrice(pricingRequest94);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 8.67d + "'", double36 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 8.67d + "'", double49 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 8.67d + "'", double62 == 8.67d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 8.67d + "'", double64 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 8.67d + "'", double81 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType82 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType82.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertTrue("'" + customerType89 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType89.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType95 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType95.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 2429.11d + "'", double96 == 2429.11d);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType40, true, "hi!", true, (int) (short) 0);
        java.lang.String str46 = pricingRequest45.couponCode();
        boolean boolean47 = pricingRequest45.firstOrder();
        boolean boolean48 = pricingRequest45.firstOrder();
        java.lang.String str49 = pricingRequest45.couponCode();
        double double50 = pricingEngine0.calculateFinalPrice(pricingRequest45);
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType55, true, "hi!", true, (int) (short) 0);
        java.lang.String str61 = pricingRequest60.couponCode();
        boolean boolean62 = pricingRequest60.firstOrder();
        boolean boolean63 = pricingRequest60.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest60.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType64, false, "", true, (int) (short) 10);
        double double70 = pricingRequest69.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType75, true, "hi!", true, (int) (short) 0);
        java.lang.String str81 = pricingRequest80.couponCode();
        boolean boolean82 = pricingRequest80.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType83 = pricingRequest80.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest88 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType83, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType89 = pricingRequest88.customerType();
        java.lang.String str90 = pricingRequest88.toString();
        boolean boolean91 = pricingRequest69.equals((java.lang.Object) pricingRequest88);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = pricingEngine0.calculateFinalPrice(pricingRequest88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 8.67d + "'", double50 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + customerType83 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType83.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType89 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType89.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str90, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        boolean boolean26 = pricingRequest22.firstOrder();
        boolean boolean27 = pricingRequest22.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) ' ', customerType28, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = customerType28.getClass();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) customerType28);
        boolean boolean36 = pricingRequest7.firstOrder();
        double double37 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType8, true, "hi!", true, (int) (short) 0);
        java.lang.String str14 = pricingRequest13.couponCode();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 10L);
        double double17 = pricingRequest13.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest13.customerType();
        boolean boolean19 = pricingRequest13.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType20, true, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType20, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 52, customerType20, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType38, true, "hi!", true, (int) (short) 0);
        int int44 = pricingRequest43.loyaltyPoints();
        boolean boolean45 = pricingRequest43.seasonalSale();
        double double46 = pricingRequest43.basePrice();
        boolean boolean47 = pricingRequest43.firstOrder();
        boolean boolean48 = pricingRequest43.seasonalSale();
        java.lang.String str49 = pricingRequest43.couponCode();
        java.lang.String str50 = pricingRequest43.toString();
        boolean boolean51 = pricingRequest35.equals((java.lang.Object) pricingRequest43);
        java.lang.String str52 = pricingRequest43.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str50, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType10, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (short) 1, customerType10, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 1, customerType10, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 52, 1, customerType10, false, "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]", false, 0);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.firstOrder();
        java.lang.String str14 = pricingRequest7.couponCode();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.loyaltyPoints();
        double double13 = pricingRequest7.basePrice();
        boolean boolean14 = pricingRequest7.seasonalSale();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType8, true, "hi!", true, (int) (short) 0);
        java.lang.String str14 = pricingRequest13.couponCode();
        boolean boolean15 = pricingRequest13.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType16, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 1, customerType16, false, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 32, (int) (byte) 100, customerType16, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest31.customerType();
        java.lang.Class<?> wildcardClass33 = customerType32.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType26, true, "hi!", true, (int) (short) 0);
        java.lang.String str32 = pricingRequest31.couponCode();
        boolean boolean34 = pricingRequest31.equals((java.lang.Object) 10L);
        int int35 = pricingRequest31.quantity();
        double double36 = pricingRequest31.basePrice();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest31);
        int int38 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType41, true, "hi!", true, (int) (short) 0);
        int int47 = pricingRequest46.loyaltyPoints();
        java.lang.String str48 = pricingRequest46.toString();
        double double49 = pricingRequest46.basePrice();
        boolean boolean50 = pricingRequest46.firstOrder();
        boolean boolean51 = pricingRequest31.equals((java.lang.Object) pricingRequest46);
        double double52 = pricingRequest31.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest31.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.67d + "'", double23 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str48, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType18, false, "", true, (int) '#');
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine pricingEngine30 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType33, true, "hi!", true, (int) (short) 0);
        int int39 = pricingRequest38.loyaltyPoints();
        boolean boolean40 = pricingRequest38.seasonalSale();
        double double41 = pricingRequest38.basePrice();
        boolean boolean42 = pricingRequest38.firstOrder();
        double double43 = pricingEngine30.calculateFinalPrice(pricingRequest38);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType48, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType48, false, "", true, (int) '#');
        double double59 = pricingEngine30.calculateFinalPrice(pricingRequest58);
        double double60 = pricingEngine0.calculateFinalPrice(pricingRequest58);
        com.viktor.lab4.PricingEngine pricingEngine61 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType64, true, "hi!", true, (int) (short) 0);
        int int70 = pricingRequest69.loyaltyPoints();
        boolean boolean71 = pricingRequest69.seasonalSale();
        double double72 = pricingRequest69.basePrice();
        boolean boolean73 = pricingRequest69.firstOrder();
        double double74 = pricingEngine61.calculateFinalPrice(pricingRequest69);
        com.viktor.lab4.PricingEngine.CustomerType customerType77 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest82 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType77, true, "hi!", true, (int) (short) 0);
        double double83 = pricingRequest82.basePrice();
        double double84 = pricingEngine61.calculateFinalPrice(pricingRequest82);
        boolean boolean85 = pricingRequest82.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType86 = pricingRequest82.customerType();
        boolean boolean87 = pricingRequest58.equals((java.lang.Object) pricingRequest82);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 737.99d + "'", double29 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 8.67d + "'", double43 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 737.99d + "'", double59 == 737.99d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 737.99d + "'", double60 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 8.67d + "'", double74 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType77 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType77.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 8.67d + "'", double84 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + customerType86 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType86.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType14, true, "", false, (int) (byte) 0);
        boolean boolean25 = pricingRequest24.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.String str14 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine pricingEngine15 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType18, true, "hi!", true, (int) (short) 0);
        int int24 = pricingRequest23.loyaltyPoints();
        boolean boolean25 = pricingRequest23.seasonalSale();
        double double26 = pricingRequest23.basePrice();
        boolean boolean27 = pricingRequest23.firstOrder();
        double double28 = pricingEngine15.calculateFinalPrice(pricingRequest23);
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType31, true, "hi!", true, (int) (short) 0);
        int int37 = pricingRequest36.loyaltyPoints();
        boolean boolean38 = pricingRequest36.seasonalSale();
        double double39 = pricingRequest36.basePrice();
        boolean boolean40 = pricingRequest36.firstOrder();
        double double41 = pricingEngine15.calculateFinalPrice(pricingRequest36);
        java.lang.String str42 = pricingRequest36.toString();
        boolean boolean43 = pricingRequest36.firstOrder();
        boolean boolean44 = pricingRequest7.equals((java.lang.Object) boolean43);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 8.67d + "'", double28 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 8.67d + "'", double41 == 8.67d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str42, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType26, true, "hi!", true, (int) (short) 0);
        java.lang.String str32 = pricingRequest31.couponCode();
        boolean boolean34 = pricingRequest31.equals((java.lang.Object) 10L);
        int int35 = pricingRequest31.quantity();
        double double36 = pricingRequest31.basePrice();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest31);
        int int38 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType41, true, "hi!", true, (int) (short) 0);
        int int47 = pricingRequest46.loyaltyPoints();
        java.lang.String str48 = pricingRequest46.toString();
        double double49 = pricingRequest46.basePrice();
        boolean boolean50 = pricingRequest46.firstOrder();
        boolean boolean51 = pricingRequest31.equals((java.lang.Object) pricingRequest46);
        int int52 = pricingRequest46.loyaltyPoints();
        boolean boolean53 = pricingRequest46.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.67d + "'", double23 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str48, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        boolean boolean15 = pricingRequest14.seasonalSale();
        boolean boolean16 = pricingRequest14.seasonalSale();
        java.lang.String str17 = pricingRequest14.toString();
        boolean boolean18 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]" + "'", str17, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        java.lang.String str25 = pricingRequest20.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        java.lang.String str38 = pricingRequest37.couponCode();
        boolean boolean39 = pricingRequest37.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest37.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType40, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType40, true, "", false, (int) (byte) 0);
        java.lang.String str51 = pricingRequest50.couponCode();
        double double52 = pricingRequest50.basePrice();
        boolean boolean53 = pricingRequest20.equals((java.lang.Object) pricingRequest50);
        double double54 = pricingRequest20.basePrice();
        boolean boolean55 = pricingRequest20.firstOrder();
        double double56 = pricingRequest20.basePrice();
        double double57 = pricingRequest20.basePrice();
        boolean boolean58 = pricingRequest20.firstOrder();
        java.lang.Class<?> wildcardClass59 = pricingRequest20.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 100, customerType4, false, "", true, (int) '#');
        java.lang.String str15 = pricingRequest14.toString();
        int int16 = pricingRequest14.loyaltyPoints();
        int int17 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]" + "'", str15, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 10L);
        double double15 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        boolean boolean17 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType18, true, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType18, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, (int) (byte) 0);
        double double29 = pricingRequest28.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest28.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType19, true, "hi!", true, (int) (short) 0);
        java.lang.String str25 = pricingRequest24.couponCode();
        boolean boolean26 = pricingRequest24.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest24.customerType();
        java.lang.String str28 = pricingRequest24.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType29, true, "", false, (int) (short) -1);
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) pricingRequest34);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest34.customerType();
        java.lang.String str37 = pricingRequest34.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest34.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]" + "'", str37, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean13 = pricingRequest8.firstOrder();
        java.lang.String str14 = pricingRequest8.toString();
        java.lang.String str15 = pricingRequest8.couponCode();
        java.lang.String str16 = pricingRequest8.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 1, customerType17, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 100);
        java.lang.String str23 = pricingRequest22.toString();
        com.viktor.lab4.PricingEngine pricingEngine24 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        int int33 = pricingRequest32.loyaltyPoints();
        boolean boolean34 = pricingRequest32.seasonalSale();
        double double35 = pricingRequest32.basePrice();
        double double36 = pricingEngine24.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType39, true, "hi!", true, (int) (short) 0);
        java.lang.String str45 = pricingRequest44.couponCode();
        boolean boolean46 = pricingRequest44.firstOrder();
        boolean boolean47 = pricingRequest44.firstOrder();
        double double48 = pricingEngine24.calculateFinalPrice(pricingRequest44);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType51, true, "hi!", true, (int) (short) 0);
        java.lang.String str57 = pricingRequest56.couponCode();
        boolean boolean59 = pricingRequest56.equals((java.lang.Object) 10L);
        int int60 = pricingRequest56.loyaltyPoints();
        double double61 = pricingEngine24.calculateFinalPrice(pricingRequest56);
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType64, true, "hi!", true, (int) (short) 0);
        double double70 = pricingRequest69.basePrice();
        java.lang.String str71 = pricingRequest69.toString();
        boolean boolean72 = pricingRequest56.equals((java.lang.Object) pricingRequest69);
        boolean boolean73 = pricingRequest22.equals((java.lang.Object) boolean72);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]" + "'", str23, "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 8.67d + "'", double36 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 8.67d + "'", double48 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 8.67d + "'", double61 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str71, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (byte) 0, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) ' ', customerType8, true, "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]", true, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest28.customerType();
        int int30 = pricingRequest28.quantity();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.loyaltyPoints();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        java.lang.String str25 = pricingRequest20.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        java.lang.String str38 = pricingRequest37.couponCode();
        boolean boolean39 = pricingRequest37.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest37.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType40, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType40, true, "", false, (int) (byte) 0);
        java.lang.String str51 = pricingRequest50.couponCode();
        double double52 = pricingRequest50.basePrice();
        boolean boolean53 = pricingRequest20.equals((java.lang.Object) pricingRequest50);
        double double54 = pricingRequest20.basePrice();
        java.lang.String str55 = pricingRequest20.couponCode();
        boolean boolean56 = pricingRequest20.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean13 = pricingRequest8.seasonalSale();
        boolean boolean14 = pricingRequest8.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        int int16 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        double double26 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        java.lang.String str27 = pricingRequest21.toString();
        boolean boolean28 = pricingRequest21.seasonalSale();
        int int29 = pricingRequest21.loyaltyPoints();
        java.lang.String str30 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 10L);
        double double15 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        boolean boolean17 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType18, true, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType18, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, (int) (byte) 0);
        double double29 = pricingRequest28.basePrice();
        boolean boolean30 = pricingRequest28.seasonalSale();
        boolean boolean31 = pricingRequest28.seasonalSale();
        boolean boolean32 = pricingRequest28.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest8.customerType();
        java.lang.String str14 = pricingRequest8.couponCode();
        java.lang.String str15 = pricingRequest8.couponCode();
        int int16 = pricingRequest8.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        java.lang.String str38 = pricingRequest32.toString();
        boolean boolean39 = pricingRequest32.seasonalSale();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType43, true, "hi!", true, (int) (short) 0);
        java.lang.String str49 = pricingRequest48.couponCode();
        boolean boolean51 = pricingRequest48.equals((java.lang.Object) 10L);
        double double52 = pricingRequest48.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest48.customerType();
        boolean boolean54 = pricingRequest48.firstOrder();
        boolean boolean55 = pricingRequest48.seasonalSale();
        double double56 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        int int57 = pricingRequest48.loyaltyPoints();
        int int58 = pricingRequest48.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 8.67d + "'", double56 == 8.67d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 100, customerType2, false, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        java.lang.String str38 = pricingRequest32.toString();
        boolean boolean39 = pricingRequest32.seasonalSale();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        int int41 = pricingRequest32.quantity();
        java.lang.String str42 = pricingRequest32.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        double double13 = pricingRequest10.basePrice();
        double double14 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest10.customerType();
        boolean boolean17 = pricingRequest10.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest10.customerType();
        boolean boolean19 = pricingRequest10.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType20, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]", true, (int) (short) -1);
        java.lang.String str26 = pricingRequest25.toString();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        java.lang.String str25 = pricingRequest20.couponCode();
        double double26 = pricingRequest20.basePrice();
        int int27 = pricingRequest20.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType30, true, "hi!", true, (int) (short) 0);
        int int36 = pricingRequest35.loyaltyPoints();
        boolean boolean37 = pricingRequest35.seasonalSale();
        double double38 = pricingRequest35.basePrice();
        boolean boolean39 = pricingRequest35.firstOrder();
        boolean boolean40 = pricingRequest35.seasonalSale();
        int int41 = pricingRequest35.loyaltyPoints();
        java.lang.String str42 = pricingRequest35.couponCode();
        double double43 = pricingRequest35.basePrice();
        int int44 = pricingRequest35.loyaltyPoints();
        double double45 = pricingRequest35.basePrice();
        java.lang.String str46 = pricingRequest35.couponCode();
        java.lang.String str47 = pricingRequest35.toString();
        boolean boolean48 = pricingRequest20.equals((java.lang.Object) str47);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        java.lang.String str25 = pricingRequest20.couponCode();
        double double26 = pricingRequest20.basePrice();
        int int27 = pricingRequest20.quantity();
        boolean boolean28 = pricingRequest20.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        double double13 = pricingRequest10.basePrice();
        boolean boolean14 = pricingRequest10.firstOrder();
        double double15 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        int int16 = pricingRequest10.quantity();
        int int17 = pricingRequest10.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (byte) 100, customerType18, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]", false, (int) (short) 0);
        boolean boolean24 = pricingRequest23.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.67d + "'", double15 == 8.67d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType12, false, "", true, (int) (byte) -1);
        int int18 = pricingRequest17.quantity();
        java.lang.String str19 = pricingRequest17.couponCode();
        java.lang.String str20 = pricingRequest17.toString();
        boolean boolean21 = pricingRequest17.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean13 = pricingRequest8.seasonalSale();
        int int14 = pricingRequest8.quantity();
        int int15 = pricingRequest8.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType4, false, "", true, (int) '#');
        java.lang.String str15 = pricingRequest14.toString();
        int int16 = pricingRequest14.quantity();
        int int17 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType5, true, "hi!", true, (int) (short) 0);
        int int11 = pricingRequest10.loyaltyPoints();
        boolean boolean12 = pricingRequest10.seasonalSale();
        boolean boolean13 = pricingRequest10.seasonalSale();
        double double14 = pricingEngine2.calculateFinalPrice(pricingRequest10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (short) 100, customerType15, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.toString();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        double double15 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine pricingEngine38 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType41, true, "hi!", true, (int) (short) 0);
        int int47 = pricingRequest46.loyaltyPoints();
        boolean boolean48 = pricingRequest46.seasonalSale();
        double double49 = pricingRequest46.basePrice();
        double double50 = pricingEngine38.calculateFinalPrice(pricingRequest46);
        int int51 = pricingRequest46.quantity();
        double double52 = pricingRequest46.basePrice();
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest46);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType60, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType60, false, "", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = pricingRequest70.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 0, customerType71, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType77 = pricingRequest76.customerType();
        int int78 = pricingRequest76.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double79 = pricingEngine0.calculateFinalPrice(pricingRequest76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 8.67d + "'", double50 == 8.67d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8.67d + "'", double53 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType77 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType77.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType18, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType18, false, "", true, (int) '#');
        double double29 = pricingEngine0.calculateFinalPrice(pricingRequest28);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.seasonalSale();
        double double40 = pricingRequest37.basePrice();
        boolean boolean41 = pricingRequest37.firstOrder();
        boolean boolean42 = pricingRequest37.seasonalSale();
        int int43 = pricingRequest37.loyaltyPoints();
        double double44 = pricingRequest37.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType49, true, "hi!", true, (int) (short) 0);
        java.lang.String str55 = pricingRequest54.couponCode();
        boolean boolean56 = pricingRequest54.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest54.customerType();
        java.lang.String str58 = pricingRequest54.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType59, true, "", false, (int) (short) -1);
        boolean boolean65 = pricingRequest37.equals((java.lang.Object) pricingRequest64);
        double double66 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        int int67 = pricingRequest37.loyaltyPoints();
        int int68 = pricingRequest37.loyaltyPoints();
        boolean boolean69 = pricingRequest37.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 737.99d + "'", double29 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str58, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 8.67d + "'", double66 == 8.67d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        int int36 = pricingRequest32.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        java.lang.String str38 = pricingRequest32.toString();
        boolean boolean39 = pricingRequest32.seasonalSale();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType49, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType49, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) '#', customerType49, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (short) 100, customerType49, true, "hi!", true, (int) (byte) 100);
        double double70 = pricingEngine0.calculateFinalPrice(pricingRequest69);
        java.lang.Object obj71 = null;
        boolean boolean72 = pricingRequest69.equals(obj71);
        java.lang.String str73 = pricingRequest69.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str38, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2282.99d + "'", double70 == 2282.99d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PricingRequest[basePrice=35.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str73, "PricingRequest[basePrice=35.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType14, true, "hi!", true, (int) (short) 0);
        int int20 = pricingRequest19.loyaltyPoints();
        boolean boolean21 = pricingRequest19.seasonalSale();
        double double22 = pricingRequest19.basePrice();
        int int23 = pricingRequest19.loyaltyPoints();
        java.lang.String str24 = pricingRequest19.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest19.customerType();
        int int26 = pricingRequest19.quantity();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) int26);
        java.lang.String str28 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass29 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType8, false, "", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 0, customerType19, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(35.0d, (int) (short) 100, customerType19, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, 1);
        java.lang.String str30 = pricingRequest29.toString();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=35.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=1]" + "'", str30, "PricingRequest[basePrice=35.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=1]");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        java.lang.String str10 = pricingRequest9.couponCode();
        boolean boolean11 = pricingRequest9.firstOrder();
        boolean boolean12 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, false, "", true, (int) (short) 10);
        double double19 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType24, true, "hi!", true, (int) (short) 0);
        java.lang.String str30 = pricingRequest29.couponCode();
        boolean boolean31 = pricingRequest29.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType32, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest37.customerType();
        java.lang.String str39 = pricingRequest37.toString();
        boolean boolean40 = pricingRequest18.equals((java.lang.Object) pricingRequest37);
        java.lang.String str41 = pricingRequest37.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType44, true, "hi!", true, (int) (short) 0);
        int int50 = pricingRequest49.loyaltyPoints();
        boolean boolean51 = pricingRequest49.seasonalSale();
        double double52 = pricingRequest49.basePrice();
        boolean boolean53 = pricingRequest49.firstOrder();
        double double54 = pricingRequest49.basePrice();
        java.lang.String str55 = pricingRequest49.toString();
        boolean boolean56 = pricingRequest49.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest49.customerType();
        boolean boolean58 = pricingRequest37.equals((java.lang.Object) customerType57);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str39, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str55, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 0L);
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        int int13 = pricingRequest7.loyaltyPoints();
        boolean boolean14 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine pricingEngine1 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        boolean boolean11 = pricingRequest9.seasonalSale();
        double double12 = pricingRequest9.basePrice();
        boolean boolean13 = pricingRequest9.firstOrder();
        double double14 = pricingEngine1.calculateFinalPrice(pricingRequest9);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType17, true, "hi!", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        boolean boolean24 = pricingRequest22.seasonalSale();
        double double25 = pricingRequest22.basePrice();
        boolean boolean26 = pricingRequest22.firstOrder();
        double double27 = pricingEngine1.calculateFinalPrice(pricingRequest22);
        java.lang.String str28 = pricingRequest22.toString();
        boolean boolean29 = pricingRequest22.seasonalSale();
        int int30 = pricingRequest22.loyaltyPoints();
        double double31 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType34, true, "hi!", true, (int) (short) 0);
        java.lang.String str40 = pricingRequest39.couponCode();
        boolean boolean41 = pricingRequest39.firstOrder();
        java.lang.String str42 = pricingRequest39.toString();
        java.lang.String str43 = pricingRequest39.couponCode();
        double double44 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType49, true, "hi!", true, (int) (short) 0);
        int int55 = pricingRequest54.loyaltyPoints();
        boolean boolean56 = pricingRequest54.seasonalSale();
        double double57 = pricingRequest54.basePrice();
        boolean boolean58 = pricingRequest54.firstOrder();
        boolean boolean59 = pricingRequest54.seasonalSale();
        int int60 = pricingRequest54.loyaltyPoints();
        java.lang.String str61 = pricingRequest54.couponCode();
        double double62 = pricingRequest54.basePrice();
        java.lang.String str63 = pricingRequest54.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest54.customerType();
        int int65 = pricingRequest54.loyaltyPoints();
        int int66 = pricingRequest54.quantity();
        int int67 = pricingRequest54.quantity();
        java.lang.String str68 = pricingRequest54.toString();
        java.lang.String str69 = pricingRequest54.toString();
        java.lang.String str70 = pricingRequest54.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (byte) -1, customerType71, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double77 = pricingEngine0.calculateFinalPrice(pricingRequest76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.67d + "'", double14 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 8.67d + "'", double31 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str42, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 8.67d + "'", double44 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str63, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str68, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str69, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str70, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        boolean boolean11 = pricingRequest8.seasonalSale();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        int int21 = pricingRequest20.loyaltyPoints();
        boolean boolean22 = pricingRequest20.seasonalSale();
        double double23 = pricingRequest20.basePrice();
        boolean boolean24 = pricingRequest20.firstOrder();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType28, true, "hi!", true, (int) (short) 0);
        int int34 = pricingRequest33.loyaltyPoints();
        boolean boolean35 = pricingRequest33.seasonalSale();
        boolean boolean36 = pricingRequest33.seasonalSale();
        java.lang.String str37 = pricingRequest33.couponCode();
        double double38 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType41, true, "hi!", true, (int) (short) 0);
        int int47 = pricingRequest46.loyaltyPoints();
        java.lang.String str48 = pricingRequest46.couponCode();
        java.lang.String str49 = pricingRequest46.couponCode();
        boolean boolean50 = pricingRequest46.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest46.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest46.customerType();
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest46);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType56, true, "hi!", true, (int) (short) 0);
        java.lang.String str62 = pricingRequest61.couponCode();
        boolean boolean63 = pricingRequest61.firstOrder();
        int int64 = pricingRequest61.loyaltyPoints();
        java.lang.String str65 = pricingRequest61.toString();
        boolean boolean66 = pricingRequest61.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest61.customerType();
        double double68 = pricingEngine0.calculateFinalPrice(pricingRequest61);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.67d + "'", double25 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 8.67d + "'", double38 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 8.67d + "'", double53 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 8.67d + "'", double68 == 8.67d);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.String str14 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine15 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType18, true, "hi!", true, (int) (short) 0);
        int int24 = pricingRequest23.loyaltyPoints();
        boolean boolean25 = pricingRequest23.seasonalSale();
        double double26 = pricingRequest23.basePrice();
        double double27 = pricingEngine15.calculateFinalPrice(pricingRequest23);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest23.customerType();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) customerType28);
        int int30 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.67d + "'", double27 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType8, true, "hi!", true, (int) (short) 0);
        java.lang.String str14 = pricingRequest13.couponCode();
        boolean boolean15 = pricingRequest13.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType16, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 1, customerType16, true, "", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 52, customerType27, false, "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]", true, 97);
        java.lang.String str33 = pricingRequest32.couponCode();
        java.lang.String str34 = pricingRequest32.toString();
        java.lang.String str35 = pricingRequest32.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=97]" + "'", str34, "PricingRequest[basePrice=-1.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType16, true, "hi!", true, (int) (short) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.seasonalSale();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        double double26 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        java.lang.String str27 = pricingRequest21.toString();
        boolean boolean28 = pricingRequest21.seasonalSale();
        int int29 = pricingRequest21.quantity();
        int int30 = pricingRequest21.quantity();
        int int31 = pricingRequest21.quantity();
        double double32 = pricingRequest21.basePrice();
        java.lang.String str33 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.67d + "'", double26 == 8.67d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str33, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType4, true, "hi!", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) '4', customerType10, false, "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]", false, (int) ' ');
        java.lang.Class<?> wildcardClass16 = pricingRequest15.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        double double17 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine pricingEngine18 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType21, true, "hi!", true, (int) (short) 0);
        int int27 = pricingRequest26.loyaltyPoints();
        boolean boolean28 = pricingRequest26.seasonalSale();
        boolean boolean29 = pricingRequest26.seasonalSale();
        double double30 = pricingEngine18.calculateFinalPrice(pricingRequest26);
        boolean boolean31 = pricingRequest26.firstOrder();
        java.lang.String str32 = pricingRequest26.toString();
        double double33 = pricingRequest26.basePrice();
        boolean boolean34 = pricingRequest16.equals((java.lang.Object) pricingRequest26);
        java.lang.String str35 = pricingRequest16.toString();
        int int36 = pricingRequest16.loyaltyPoints();
        double double37 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (short) 1, customerType38, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        java.lang.String str44 = pricingRequest43.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 8.67d + "'", double30 == 8.67d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str32, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]" + "'", str35, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]" + "'", str44, "PricingRequest[basePrice=10.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType2, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass10 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        int int14 = pricingRequest8.quantity();
        java.lang.String str15 = pricingRequest8.couponCode();
        boolean boolean16 = pricingRequest8.firstOrder();
        boolean boolean17 = pricingRequest8.firstOrder();
        int int18 = pricingRequest8.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.67d + "'", double13 == 8.67d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType14, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType21, true, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", false, (int) '4');
        int int27 = pricingRequest26.quantity();
        int int28 = pricingRequest26.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        boolean boolean13 = pricingRequest7.firstOrder();
        int int14 = pricingRequest7.quantity();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType20, true, "hi!", true, (int) (short) 0);
        java.lang.String str26 = pricingRequest25.couponCode();
        boolean boolean27 = pricingRequest25.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '4', customerType28, false, "", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) pricingRequest33);
        double double37 = pricingRequest7.basePrice();
        double double38 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType27, true, "hi!", true, (int) (short) 0);
        java.lang.String str33 = pricingRequest32.couponCode();
        boolean boolean35 = pricingRequest32.equals((java.lang.Object) 10L);
        double double36 = pricingRequest32.basePrice();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest32);
        java.lang.Class<?> wildcardClass38 = pricingRequest32.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType15, true, "hi!", true, (int) (short) 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        boolean boolean22 = pricingRequest20.firstOrder();
        boolean boolean23 = pricingRequest20.firstOrder();
        double double24 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        int int25 = pricingRequest20.loyaltyPoints();
        boolean boolean26 = pricingRequest20.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.67d + "'", double12 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.67d + "'", double24 == 8.67d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType6, false, "", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 0, customerType17, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (int) (short) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType3, true, "hi!", true, (int) (short) 0);
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.seasonalSale();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.firstOrder();
        boolean boolean13 = pricingRequest8.seasonalSale();
        int int14 = pricingRequest8.loyaltyPoints();
        double double15 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType20, true, "hi!", true, (int) (short) 0);
        java.lang.String str26 = pricingRequest25.couponCode();
        boolean boolean27 = pricingRequest25.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest25.customerType();
        java.lang.String str29 = pricingRequest25.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType30, true, "", false, (int) (short) -1);
        boolean boolean36 = pricingRequest8.equals((java.lang.Object) pricingRequest35);
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 0, customerType42, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) '4', customerType42, true, "PricingRequest[basePrice=1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=35]", true, 1);
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest52);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType56, true, "hi!", true, (int) (short) 0);
        java.lang.String str62 = pricingRequest61.couponCode();
        boolean boolean63 = pricingRequest61.firstOrder();
        boolean boolean64 = pricingRequest61.firstOrder();
        java.lang.String str65 = pricingRequest61.couponCode();
        int int66 = pricingRequest61.loyaltyPoints();
        double double67 = pricingRequest61.basePrice();
        double double68 = pricingEngine0.calculateFinalPrice(pricingRequest61);
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType71, true, "hi!", true, (int) (short) 0);
        int int77 = pricingRequest76.loyaltyPoints();
        boolean boolean78 = pricingRequest76.seasonalSale();
        double double79 = pricingRequest76.basePrice();
        boolean boolean80 = pricingRequest76.firstOrder();
        double double81 = pricingRequest76.basePrice();
        double double82 = pricingEngine0.calculateFinalPrice(pricingRequest76);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 8.67d + "'", double37 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1900.79d + "'", double53 == 1900.79d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 8.67d + "'", double68 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 8.67d + "'", double82 == 8.67d);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }
}

