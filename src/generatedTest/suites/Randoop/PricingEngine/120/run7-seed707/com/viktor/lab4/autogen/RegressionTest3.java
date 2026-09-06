package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType10, false, "", true, (int) (byte) 100);
        int int16 = pricingRequest15.loyaltyPoints();
        boolean boolean17 = pricingRequest15.firstOrder();
        boolean boolean18 = pricingRequest15.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType23, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        boolean boolean35 = pricingRequest15.equals((java.lang.Object) customerType34);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (short) 100, customerType34, true, "", true, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest(45.95d, (int) ' ', customerType34, false, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 32, customerType34, false, "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (byte) -1, customerType34, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100], firstOrder=false, loyaltyPoints=0]", false, (int) 'a');
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        double double26 = pricingRequest7.basePrice();
        double double27 = pricingRequest7.basePrice();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.couponCode();
        int int16 = pricingRequest7.loyaltyPoints();
        java.lang.String str17 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType20, true, "hi!", true, (int) (short) -1);
        java.lang.String str26 = pricingRequest25.couponCode();
        double double27 = pricingRequest25.basePrice();
        int int28 = pricingRequest25.quantity();
        boolean boolean29 = pricingRequest25.seasonalSale();
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) pricingRequest25);
        int int31 = pricingRequest7.quantity();
        java.lang.String str32 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 1L);
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        boolean boolean15 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType20, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType20, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest30.customerType();
        java.lang.String str32 = pricingRequest30.toString();
        java.lang.String str33 = pricingRequest30.toString();
        boolean boolean34 = pricingRequest30.seasonalSale();
        int int35 = pricingRequest30.loyaltyPoints();
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) pricingRequest30);
        java.lang.Class<?> wildcardClass37 = pricingRequest30.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str32, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str33, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        boolean boolean16 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType23, true, "hi!", true, (int) (short) -1);
        boolean boolean29 = pricingRequest28.seasonalSale();
        boolean boolean31 = pricingRequest28.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType32, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (byte) 10, customerType32, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, 0);
        java.lang.Class<?> wildcardClass43 = customerType32.getClass();
        boolean boolean44 = pricingRequest7.equals((java.lang.Object) wildcardClass43);
        int int45 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest7.customerType();
        boolean boolean47 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, (int) '#', customerType15, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, 0);
        java.lang.String str26 = pricingRequest25.toString();
        double double27 = pricingRequest25.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType11, false, "", true, (int) (short) -1);
        int int17 = pricingRequest16.loyaltyPoints();
        int int18 = pricingRequest16.quantity();
        double double19 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType22, true, "hi!", true, (int) (short) -1);
        java.lang.String str28 = pricingRequest27.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest27.customerType();
        boolean boolean30 = pricingRequest27.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest27.customerType();
        boolean boolean32 = pricingRequest27.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType35, true, "hi!", true, (int) (short) -1);
        boolean boolean41 = pricingRequest40.seasonalSale();
        boolean boolean43 = pricingRequest40.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest40.customerType();
        java.lang.String str45 = pricingRequest40.toString();
        double double46 = pricingRequest40.basePrice();
        boolean boolean47 = pricingRequest27.equals((java.lang.Object) double46);
        boolean boolean48 = pricingRequest16.equals((java.lang.Object) pricingRequest27);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType51, true, "hi!", true, (int) (short) -1);
        int int57 = pricingRequest56.quantity();
        int int58 = pricingRequest56.quantity();
        int int59 = pricingRequest56.quantity();
        int int60 = pricingRequest56.loyaltyPoints();
        boolean boolean61 = pricingRequest56.seasonalSale();
        java.lang.Object obj62 = null;
        boolean boolean63 = pricingRequest56.equals(obj62);
        int int64 = pricingRequest56.loyaltyPoints();
        int int65 = pricingRequest56.quantity();
        boolean boolean66 = pricingRequest27.equals((java.lang.Object) pricingRequest56);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str45, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 35.0d + "'", double46 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        java.lang.String str14 = pricingRequest13.couponCode();
        java.lang.String str15 = pricingRequest13.toString();
        boolean boolean16 = pricingRequest13.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType17, false, "", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) (short) -1, customerType17, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (short) 1, customerType17, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=1]", true, (int) (byte) 10);
        int int33 = pricingRequest32.quantity();
        java.lang.String str34 = pricingRequest32.toString();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=1], firstOrder=true, loyaltyPoints=10]" + "'", str34, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=1], firstOrder=true, loyaltyPoints=10]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        double double11 = pricingRequest7.basePrice();
        int int12 = pricingRequest7.quantity();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        int int18 = pricingRequest7.quantity();
        boolean boolean19 = pricingRequest7.firstOrder();
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
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        boolean boolean38 = pricingRequest33.seasonalSale();
        java.lang.String str39 = pricingRequest33.couponCode();
        java.lang.String str40 = pricingRequest33.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        java.lang.String str16 = pricingRequest7.couponCode();
        boolean boolean17 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass18 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        int int20 = pricingRequest19.quantity();
        int int21 = pricingRequest19.quantity();
        int int22 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType23, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType23, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (short) 1, customerType23, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 10, customerType23, false, "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 10, customerType23, false, "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 0, customerType23, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=10]", false, (int) '#');
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.String str14 = pricingRequest7.toString();
        int int15 = pricingRequest7.loyaltyPoints();
        int int16 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        java.lang.String str12 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        boolean boolean14 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        java.lang.Object obj16 = null;
        boolean boolean17 = pricingRequest11.equals(obj16);
        java.lang.String str18 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) (short) 0, customerType19, false, "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]", true, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, 0, customerType19, false, "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]", true, (int) (byte) 100);
        double double30 = pricingRequest29.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7.99d + "'", double30 == 7.99d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.loyaltyPoints();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.equals((java.lang.Object) false);
        double double16 = pricingRequest7.basePrice();
        boolean boolean17 = pricingRequest7.firstOrder();
        int int18 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        boolean boolean14 = pricingRequest13.seasonalSale();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType17, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 1);
        double double33 = pricingRequest32.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest32.customerType();
        int int35 = pricingRequest32.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        boolean boolean38 = pricingRequest33.seasonalSale();
        boolean boolean39 = pricingRequest33.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest33.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 1, customerType14, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=1]", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType22, true, "hi!", true, (int) (short) -1);
        boolean boolean28 = pricingRequest27.seasonalSale();
        int int29 = pricingRequest27.quantity();
        double double30 = pricingRequest27.basePrice();
        boolean boolean31 = pricingRequest27.firstOrder();
        java.lang.String str32 = pricingRequest27.toString();
        int int33 = pricingRequest27.loyaltyPoints();
        java.lang.String str34 = pricingRequest27.couponCode();
        boolean boolean35 = pricingRequest27.seasonalSale();
        boolean boolean36 = pricingRequest19.equals((java.lang.Object) pricingRequest27);
        boolean boolean37 = pricingRequest27.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        int int13 = pricingRequest9.loyaltyPoints();
        int int14 = pricingRequest9.quantity();
        boolean boolean15 = pricingRequest9.firstOrder();
        int int16 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 52, (int) 'a', customerType17, false, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, (int) '#');
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType25, false, "", true, (int) (byte) 100);
        int int31 = pricingRequest30.loyaltyPoints();
        double double32 = pricingRequest30.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '4', customerType35, true, "hi!", true, (int) (short) 0);
        boolean boolean41 = pricingRequest40.seasonalSale();
        java.lang.String str42 = pricingRequest40.toString();
        double double43 = pricingEngine0.calculateFinalPrice(pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType46, false, "", true, (int) (byte) 100);
        int int52 = pricingRequest51.loyaltyPoints();
        double double53 = pricingRequest51.basePrice();
        double double54 = pricingRequest51.basePrice();
        boolean boolean55 = pricingRequest51.firstOrder();
        java.lang.String str56 = pricingRequest51.toString();
        java.lang.String str57 = pricingRequest51.couponCode();
        java.lang.String str58 = pricingRequest51.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType63, true, "hi!", true, (int) (short) -1);
        boolean boolean69 = pricingRequest68.seasonalSale();
        int int70 = pricingRequest68.quantity();
        double double71 = pricingRequest68.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = pricingRequest68.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest68.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest78 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 1, customerType73, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=1]", true, 100);
        boolean boolean79 = pricingRequest51.equals((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double80 = pricingEngine0.calculateFinalPrice(pricingRequest51);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str42, "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 3286.59d + "'", double43 == 3286.59d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str56, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str58, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 35.0d + "'", double71 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType73 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType73.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean22 = pricingRequest19.equals((java.lang.Object) 100.0d);
        boolean boolean23 = pricingRequest19.firstOrder();
        boolean boolean24 = pricingRequest19.firstOrder();
        java.lang.String str25 = pricingRequest19.toString();
        boolean boolean26 = pricingRequest19.firstOrder();
        java.lang.String str27 = pricingRequest19.couponCode();
        int int28 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType33, true, "hi!", true, (int) (short) -1);
        int int39 = pricingRequest38.quantity();
        int int40 = pricingRequest38.quantity();
        int int41 = pricingRequest38.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest38.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType42, false, "hi!", false, (int) '#');
        double double48 = pricingRequest47.basePrice();
        boolean boolean49 = pricingRequest47.seasonalSale();
        boolean boolean50 = pricingRequest47.firstOrder();
        boolean boolean51 = pricingRequest19.equals((java.lang.Object) pricingRequest47);
        boolean boolean52 = pricingRequest7.equals((java.lang.Object) pricingRequest47);
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest47.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        int int14 = pricingRequest13.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType15, false, "", true, (int) (short) -1);
        int int21 = pricingRequest20.quantity();
        int int22 = pricingRequest20.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (byte) 10, customerType23, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 100, customerType23, true, "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]", true, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        java.lang.Object obj30 = null;
        boolean boolean31 = pricingRequest7.equals(obj30);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest7.customerType();
        int int33 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.quantity();
        int int14 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        java.lang.String str10 = pricingRequest9.couponCode();
        double double11 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) '4', customerType12, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (byte) -1);
        boolean boolean18 = pricingRequest17.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 100L);
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType6, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 52, customerType17, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) (byte) -1, customerType15, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (-1));
        boolean boolean26 = pricingRequest25.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (byte) -1, customerType11, false, "", false, 97);
        boolean boolean17 = pricingRequest16.seasonalSale();
        java.lang.String str18 = pricingRequest16.couponCode();
        int int19 = pricingRequest16.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        double double42 = pricingRequest7.basePrice();
        java.lang.String str43 = pricingRequest7.couponCode();
        java.lang.String str44 = pricingRequest7.couponCode();
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 35.0d + "'", double42 == 35.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.quantity();
        double double13 = pricingRequest7.basePrice();
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.String str15 = pricingRequest7.couponCode();
        java.lang.Object obj16 = null;
        boolean boolean17 = pricingRequest7.equals(obj16);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        int int15 = pricingRequest11.loyaltyPoints();
        int int16 = pricingRequest11.quantity();
        int int17 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 1, customerType18, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', 35, customerType24, false, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest7.customerType();
        java.lang.String str24 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean22 = pricingRequest19.equals((java.lang.Object) 100.0d);
        boolean boolean23 = pricingRequest19.firstOrder();
        boolean boolean24 = pricingRequest19.firstOrder();
        java.lang.String str25 = pricingRequest19.toString();
        boolean boolean26 = pricingRequest19.firstOrder();
        java.lang.String str27 = pricingRequest19.couponCode();
        double double28 = pricingRequest19.basePrice();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        double double30 = pricingRequest19.basePrice();
        boolean boolean31 = pricingRequest19.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType13, false, "hi!", false, (int) '#');
        double double19 = pricingRequest18.basePrice();
        boolean boolean20 = pricingRequest18.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        int int31 = pricingRequest30.quantity();
        int int32 = pricingRequest30.quantity();
        int int33 = pricingRequest30.quantity();
        int int34 = pricingRequest30.loyaltyPoints();
        int int35 = pricingRequest30.quantity();
        int int36 = pricingRequest30.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 1, customerType37, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        boolean boolean43 = pricingRequest42.seasonalSale();
        boolean boolean44 = pricingRequest18.equals((java.lang.Object) boolean43);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        boolean boolean32 = pricingRequest14.firstOrder();
        boolean boolean33 = pricingRequest14.firstOrder();
        double double34 = pricingRequest14.basePrice();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        int int16 = pricingRequest14.quantity();
        java.lang.String str17 = pricingRequest14.couponCode();
        boolean boolean18 = pricingRequest14.seasonalSale();
        int int19 = pricingRequest14.loyaltyPoints();
        java.lang.String str20 = pricingRequest14.toString();
        java.lang.String str21 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str20, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str21, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        int int18 = pricingRequest7.quantity();
        int int19 = pricingRequest7.quantity();
        java.lang.String str20 = pricingRequest7.toString();
        java.lang.String str21 = pricingRequest7.toString();
        double double22 = pricingRequest7.basePrice();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str21, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        java.lang.String str10 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        boolean boolean12 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) (byte) 0, customerType13, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) '4');
        java.lang.String str19 = pricingRequest18.toString();
        java.lang.String str20 = pricingRequest18.toString();
        boolean boolean21 = pricingRequest18.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]" + "'", str19, "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]" + "'", str20, "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        java.lang.String str11 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        double double15 = pricingRequest7.basePrice();
        boolean boolean16 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        double double79 = pricingEngine0.calculateFinalPrice(pricingRequest66);
        com.viktor.lab4.PricingEngine.CustomerType customerType82 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest87 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType82, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        double double88 = pricingRequest87.basePrice();
        double double89 = pricingEngine0.calculateFinalPrice(pricingRequest87);
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
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 45.95d + "'", double79 == 45.95d);
        org.junit.Assert.assertTrue("'" + customerType82 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType82.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 7.99d + "'", double89 == 7.99d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        java.lang.String str20 = pricingRequest19.couponCode();
        int int21 = pricingRequest19.loyaltyPoints();
        java.lang.String str22 = pricingRequest19.toString();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        boolean boolean24 = pricingRequest19.firstOrder();
        int int25 = pricingRequest19.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType14, true, "hi!", true, (int) (short) -1);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean22 = pricingRequest19.equals((java.lang.Object) 100.0d);
        boolean boolean23 = pricingRequest19.firstOrder();
        boolean boolean24 = pricingRequest19.firstOrder();
        java.lang.String str25 = pricingRequest19.toString();
        boolean boolean26 = pricingRequest19.firstOrder();
        java.lang.String str27 = pricingRequest19.couponCode();
        double double28 = pricingRequest19.basePrice();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        boolean boolean30 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest7.customerType();
        int int32 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.couponCode();
        java.lang.String str16 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        int int15 = pricingRequest11.quantity();
        java.lang.String str16 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, 10, customerType18, true, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, 100, customerType18, false, "PricingRequest[basePrice=100.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 0, customerType13, false, "hi!", false, (int) 'a');
        double double19 = pricingRequest18.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 97, customerType18, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", false, 0);
        java.lang.String str29 = pricingRequest28.couponCode();
        boolean boolean30 = pricingRequest28.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        int int21 = pricingRequest20.quantity();
        int int22 = pricingRequest20.quantity();
        java.lang.String str23 = pricingRequest20.toString();
        int int24 = pricingRequest20.loyaltyPoints();
        java.lang.String str25 = pricingRequest20.toString();
        boolean boolean26 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType27, false, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType37, true, "hi!", true, (int) (short) -1);
        int int43 = pricingRequest42.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest42.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType44, false, "", true, (int) (short) -1);
        int int50 = pricingRequest49.loyaltyPoints();
        int int51 = pricingRequest49.quantity();
        boolean boolean52 = pricingRequest32.equals((java.lang.Object) pricingRequest49);
        java.lang.String str53 = pricingRequest49.toString();
        boolean boolean54 = pricingRequest7.equals((java.lang.Object) pricingRequest49);
        double double55 = pricingRequest49.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str53, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.couponCode();
        double double11 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass12 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType17, true, "hi!", true, (int) (short) -1);
        int int23 = pricingRequest22.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (byte) -1, customerType24, false, "", false, 97);
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) pricingRequest29);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType56, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        double double67 = pricingEngine0.calculateFinalPrice(pricingRequest66);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType70, true, "hi!", true, (int) (short) -1);
        boolean boolean76 = pricingRequest75.seasonalSale();
        boolean boolean77 = pricingRequest75.firstOrder();
        int int78 = pricingRequest75.loyaltyPoints();
        java.lang.String str79 = pricingRequest75.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType80 = pricingRequest75.customerType();
        java.lang.Object obj81 = null;
        boolean boolean82 = pricingRequest75.equals(obj81);
        java.lang.String str83 = pricingRequest75.couponCode();
        java.lang.String str84 = pricingRequest75.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double85 = pricingEngine0.calculateFinalPrice(pricingRequest75);
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 90.99d + "'", double67 == 90.99d);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str79, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType80 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType80.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str84, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        double double13 = pricingRequest7.basePrice();
        boolean boolean14 = pricingRequest7.seasonalSale();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.quantity();
        double double13 = pricingRequest7.basePrice();
        boolean boolean14 = pricingRequest7.seasonalSale();
        int int15 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        java.lang.String str14 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        java.lang.String str16 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        int int27 = pricingRequest9.quantity();
        int int28 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 35, customerType30, false, "", false, (int) (byte) 0);
        boolean boolean36 = pricingRequest35.firstOrder();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType27, false, "", true, (int) (byte) 100);
        int int33 = pricingRequest32.loyaltyPoints();
        int int34 = pricingRequest32.loyaltyPoints();
        boolean boolean35 = pricingRequest18.equals((java.lang.Object) int34);
        java.lang.String str36 = pricingRequest18.couponCode();
        boolean boolean37 = pricingRequest18.firstOrder();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.String str33 = pricingRequest7.couponCode();
        boolean boolean34 = pricingRequest7.firstOrder();
        int int35 = pricingRequest7.quantity();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        boolean boolean13 = pricingRequest9.firstOrder();
        boolean boolean14 = pricingRequest9.firstOrder();
        java.lang.String str15 = pricingRequest9.toString();
        boolean boolean16 = pricingRequest9.firstOrder();
        int int17 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 97, customerType18, false, "PricingRequest[basePrice=-1.0, quantity=35, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=-1]", false, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        int int18 = pricingRequest7.quantity();
        java.lang.String str19 = pricingRequest7.couponCode();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        double double32 = pricingRequest14.basePrice();
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        double double14 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest20.equals((java.lang.Object) 10);
        double double23 = pricingRequest20.basePrice();
        int int24 = pricingRequest20.loyaltyPoints();
        java.lang.String str25 = pricingRequest20.toString();
        int int26 = pricingRequest20.loyaltyPoints();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) pricingRequest20);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        boolean boolean30 = pricingRequest7.firstOrder();
        int int31 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.seasonalSale();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.firstOrder();
        java.lang.String str26 = pricingRequest21.toString();
        int int27 = pricingRequest21.loyaltyPoints();
        java.lang.String str28 = pricingRequest21.couponCode();
        int int29 = pricingRequest21.quantity();
        boolean boolean30 = pricingRequest21.firstOrder();
        java.lang.String str31 = pricingRequest21.toString();
        java.lang.String str32 = pricingRequest21.couponCode();
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType38, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType38, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest48.customerType();
        boolean boolean50 = pricingRequest48.firstOrder();
        boolean boolean51 = pricingRequest21.equals((java.lang.Object) pricingRequest48);
        java.lang.String str52 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str31, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 1, customerType2, true, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]", true, 32);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = pricingRequest7.equals(obj9);
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        boolean boolean29 = pricingRequest19.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType38, true, "hi!", true, (int) (short) -1);
        boolean boolean44 = pricingRequest43.seasonalSale();
        boolean boolean46 = pricingRequest43.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest43.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType47, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType47, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) -1, customerType58, false, "hi!", false, (int) (byte) -1);
        boolean boolean64 = pricingRequest19.equals((java.lang.Object) "hi!");
        java.lang.String str65 = pricingRequest19.couponCode();
        java.lang.Class<?> wildcardClass66 = pricingRequest19.getClass();
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
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        int int12 = pricingRequest7.loyaltyPoints();
        boolean boolean13 = pricingRequest7.firstOrder();
        int int14 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType10, true, "hi!", true, (int) (short) -1);
        java.lang.String str16 = pricingRequest15.couponCode();
        java.lang.String str17 = pricingRequest15.toString();
        boolean boolean18 = pricingRequest15.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType19, false, "", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) (short) -1, customerType19, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (short) 1, customerType19, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=1]", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) 10, customerType19, false, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=100]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }
}

