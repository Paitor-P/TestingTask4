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
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType8, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType8, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        boolean boolean29 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest28.customerType();
        java.lang.Class<?> wildcardClass31 = pricingRequest28.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType2, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType11, false, "hi!", false, (int) '#');
        boolean boolean17 = pricingRequest16.seasonalSale();
        java.lang.String str18 = pricingRequest16.couponCode();
        java.lang.String str19 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        double double22 = pricingRequest16.basePrice();
        double double23 = pricingRequest16.basePrice();
        java.lang.String str24 = pricingRequest16.toString();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest16);
        int int26 = pricingRequest16.quantity();
        int int27 = pricingRequest16.loyaltyPoints();
        boolean boolean28 = pricingRequest16.seasonalSale();
        java.lang.String str29 = pricingRequest16.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str24, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str29, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (byte) 100, customerType8, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) '#', customerType8, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, (int) (short) 100);
        int int29 = pricingRequest28.loyaltyPoints();
        java.lang.String str30 = pricingRequest28.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str30, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) (byte) 10);
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) (short) 10);
        boolean boolean16 = pricingRequest11.seasonalSale();
        boolean boolean17 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType20, false, "hi!", false, (int) (byte) 1);
        double double26 = pricingRequest25.basePrice();
        boolean boolean27 = pricingRequest25.seasonalSale();
        boolean boolean28 = pricingRequest11.equals((java.lang.Object) pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType29, false, "PricingRequest[basePrice=-1.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(35.0d, (int) '#', customerType29, false, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]", true, (int) '#');
        java.lang.String str40 = pricingRequest39.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]" + "'", str40, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.toString();
        int int15 = pricingRequest7.loyaltyPoints();
        java.lang.String str16 = pricingRequest7.toString();
        double double17 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType24, false, "hi!", false, (int) '#');
        boolean boolean31 = pricingRequest29.equals((java.lang.Object) (short) -1);
        boolean boolean33 = pricingRequest29.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType34, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType34, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 0);
        boolean boolean45 = pricingRequest7.equals((java.lang.Object) false);
        int int46 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str12, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str16, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        boolean boolean14 = pricingRequest7.seasonalSale();
        int int15 = pricingRequest7.loyaltyPoints();
        java.lang.String str16 = pricingRequest7.couponCode();
        java.lang.String str17 = pricingRequest7.toString();
        int int18 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        double double13 = pricingRequest7.basePrice();
        java.lang.String str14 = pricingRequest7.toString();
        boolean boolean15 = pricingRequest7.firstOrder();
        int int16 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType21, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType21, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 1);
        java.lang.String str32 = pricingRequest31.couponCode();
        boolean boolean33 = pricingRequest31.firstOrder();
        boolean boolean34 = pricingRequest31.firstOrder();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) boolean34);
        java.lang.String str36 = pricingRequest7.couponCode();
        boolean boolean37 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str32, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType2, false, "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 1);
        int int8 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType23, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType23, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (byte) 100, customerType23, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) '#', customerType23, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, (int) (short) 100);
        int int44 = pricingRequest43.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType49, false, "hi!", false, (int) '#');
        boolean boolean55 = pricingRequest54.seasonalSale();
        java.lang.String str56 = pricingRequest54.couponCode();
        boolean boolean58 = pricingRequest54.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType59, true, "", false, (int) 'a');
        double double65 = pricingRequest64.basePrice();
        double double66 = pricingRequest64.basePrice();
        boolean boolean67 = pricingRequest43.equals((java.lang.Object) pricingRequest64);
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest43.customerType();
        boolean boolean69 = pricingRequest7.equals((java.lang.Object) pricingRequest43);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 97.0d + "'", double65 == 97.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 97.0d + "'", double66 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType11, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        boolean boolean17 = pricingRequest7.equals((java.lang.Object) true);
        int int18 = pricingRequest7.quantity();
        java.lang.String str19 = pricingRequest7.couponCode();
        int int20 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.String str14 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType17, false, "hi!", false, (int) '#');
        boolean boolean23 = pricingRequest22.seasonalSale();
        java.lang.String str24 = pricingRequest22.couponCode();
        java.lang.String str25 = pricingRequest22.toString();
        double double26 = pricingRequest22.basePrice();
        java.lang.String str27 = pricingRequest22.toString();
        int int28 = pricingRequest22.loyaltyPoints();
        java.lang.String str29 = pricingRequest22.toString();
        int int30 = pricingRequest22.loyaltyPoints();
        java.lang.String str31 = pricingRequest22.toString();
        boolean boolean32 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        java.lang.String str33 = pricingRequest22.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str25, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str27, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str29, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str31, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType4, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 1, customerType4, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        double double15 = pricingRequest14.basePrice();
        double double16 = pricingRequest14.basePrice();
        int int17 = pricingRequest14.loyaltyPoints();
        int int18 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        boolean boolean16 = pricingRequest15.seasonalSale();
        java.lang.String str17 = pricingRequest15.couponCode();
        java.lang.String str18 = pricingRequest15.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 0, customerType20, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 100, customerType20, true, "PricingRequest[basePrice=638.49, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=32]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (-1), customerType20, false, "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest(673.59d, 32, customerType20, false, "PricingRequest[basePrice=32.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35], firstOrder=true, loyaltyPoints=1]", false, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType2, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        boolean boolean8 = pricingRequest7.firstOrder();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType13, false, "hi!", false, (int) '#');
        boolean boolean19 = pricingRequest18.seasonalSale();
        java.lang.String str20 = pricingRequest18.couponCode();
        java.lang.String str21 = pricingRequest18.toString();
        double double22 = pricingRequest18.basePrice();
        double double23 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType34, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType34, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType34, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType34, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 0, customerType34, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest59.customerType();
        boolean boolean61 = pricingRequest18.equals((java.lang.Object) pricingRequest59);
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType64, false, "hi!", false, (int) '#');
        boolean boolean70 = pricingRequest69.seasonalSale();
        java.lang.String str71 = pricingRequest69.couponCode();
        java.lang.String str72 = pricingRequest69.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest69.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = pricingRequest69.customerType();
        int int75 = pricingRequest69.loyaltyPoints();
        boolean boolean76 = pricingRequest69.seasonalSale();
        boolean boolean77 = pricingRequest59.equals((java.lang.Object) boolean76);
        boolean boolean78 = pricingRequest7.equals((java.lang.Object) boolean77);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str21, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + customerType73 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType73.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 35 + "'", int75 == 35);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.seasonalSale();
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.String str15 = pricingRequest7.couponCode();
        java.lang.String str16 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        boolean boolean15 = pricingRequest13.equals((java.lang.Object) (short) -1);
        boolean boolean17 = pricingRequest13.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType18, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', 100, customerType18, true, "hi!", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(280.99d, 100, customerType18, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType16, false, "hi!", false, (int) (byte) 1);
        boolean boolean22 = pricingRequest21.firstOrder();
        java.lang.String str23 = pricingRequest21.toString();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        int int25 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str23, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        java.lang.String str12 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        double double14 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        double double16 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 35, customerType17, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97], firstOrder=false, loyaltyPoints=35]", false, 100);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        boolean boolean17 = pricingRequest15.equals((java.lang.Object) (short) -1);
        boolean boolean19 = pricingRequest15.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType20, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType20, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) 'a', customerType20, true, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '4', customerType20, false, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest40.customerType();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        boolean boolean16 = pricingRequest15.seasonalSale();
        java.lang.String str17 = pricingRequest15.couponCode();
        java.lang.String str18 = pricingRequest15.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest15.customerType();
        int int20 = pricingRequest15.quantity();
        java.lang.String str21 = pricingRequest15.couponCode();
        int int22 = pricingRequest15.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType25, false, "hi!", false, (int) '#');
        boolean boolean31 = pricingRequest30.seasonalSale();
        java.lang.String str32 = pricingRequest30.couponCode();
        java.lang.String str33 = pricingRequest30.couponCode();
        boolean boolean34 = pricingRequest30.seasonalSale();
        double double35 = pricingRequest30.basePrice();
        double double36 = pricingRequest30.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType39, false, "hi!", false, (int) '#');
        boolean boolean45 = pricingRequest44.seasonalSale();
        java.lang.String str46 = pricingRequest44.couponCode();
        boolean boolean48 = pricingRequest44.equals((java.lang.Object) (short) 10);
        boolean boolean49 = pricingRequest44.seasonalSale();
        java.lang.Class<?> wildcardClass50 = pricingRequest44.getClass();
        boolean boolean51 = pricingRequest30.equals((java.lang.Object) wildcardClass50);
        int int52 = pricingRequest30.loyaltyPoints();
        java.lang.String str53 = pricingRequest30.couponCode();
        boolean boolean54 = pricingRequest15.equals((java.lang.Object) str53);
        java.lang.String str55 = pricingRequest15.toString();
        boolean boolean56 = pricingRequest7.equals((java.lang.Object) pricingRequest15);
        java.lang.String str57 = pricingRequest15.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str55, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str57, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType14, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType14, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType14, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType14, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 0, customerType14, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 35);
        int int40 = pricingRequest39.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (byte) 1, customerType41, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) '#', customerType41, true, "PricingRequest[basePrice=-1.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.toString();
        int int15 = pricingRequest7.loyaltyPoints();
        boolean boolean16 = pricingRequest7.seasonalSale();
        int int17 = pricingRequest7.quantity();
        double double18 = pricingRequest7.basePrice();
        boolean boolean19 = pricingRequest7.seasonalSale();
        java.lang.String str20 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType23, false, "hi!", false, (int) '#');
        boolean boolean29 = pricingRequest28.seasonalSale();
        java.lang.String str30 = pricingRequest28.couponCode();
        java.lang.String str31 = pricingRequest28.couponCode();
        boolean boolean32 = pricingRequest28.seasonalSale();
        boolean boolean34 = pricingRequest28.equals((java.lang.Object) 10.0d);
        boolean boolean35 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest28.customerType();
        int int37 = pricingRequest28.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest28.customerType();
        double double39 = pricingRequest28.basePrice();
        boolean boolean40 = pricingRequest7.equals((java.lang.Object) pricingRequest28);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str12, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType14, true, "", false, (int) 'a');
        double double20 = pricingRequest19.basePrice();
        int int21 = pricingRequest19.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine22 = new com.viktor.lab4.PricingEngine();
        boolean boolean23 = pricingRequest19.equals((java.lang.Object) pricingEngine22);
        int int24 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest19.customerType();
        java.lang.String str26 = pricingRequest19.toString();
        int int27 = pricingRequest19.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str26, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType2, false, "hi!", false, (int) (byte) 1);
        double double8 = pricingRequest7.basePrice();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType12, false, "hi!", false, (int) '#');
        boolean boolean18 = pricingRequest17.seasonalSale();
        java.lang.String str19 = pricingRequest17.couponCode();
        java.lang.String str20 = pricingRequest17.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest17.customerType();
        int int22 = pricingRequest17.quantity();
        java.lang.String str23 = pricingRequest17.couponCode();
        int int24 = pricingRequest17.loyaltyPoints();
        java.lang.Class<?> wildcardClass25 = pricingRequest17.getClass();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) wildcardClass25);
        boolean boolean27 = pricingRequest7.seasonalSale();
        boolean boolean28 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType6, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        java.lang.String str17 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 97, customerType18, true, "PricingRequest[basePrice=-1.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (byte) 10);
        double double24 = pricingRequest23.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType2, false, "hi!", false, (int) (byte) 1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType14, true, "", false, (int) 'a');
        double double20 = pricingRequest19.basePrice();
        double double21 = pricingRequest19.basePrice();
        java.lang.String str22 = pricingRequest19.toString();
        java.lang.String str23 = pricingRequest19.toString();
        java.lang.String str24 = pricingRequest19.couponCode();
        double double25 = pricingRequest19.basePrice();
        int int26 = pricingRequest19.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str22, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str23, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        int int15 = pricingRequest9.loyaltyPoints();
        boolean boolean16 = pricingRequest9.seasonalSale();
        boolean boolean17 = pricingRequest9.firstOrder();
        java.lang.String str18 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 0, customerType19, true, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]", false, 32);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean11 = pricingRequest9.equals((java.lang.Object) (short) -1);
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType14, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        java.lang.String str20 = pricingRequest19.toString();
        double double21 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType24, false, "hi!", false, (int) '#');
        boolean boolean30 = pricingRequest29.seasonalSale();
        java.lang.String str31 = pricingRequest29.couponCode();
        java.lang.String str32 = pricingRequest29.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType35, false, "hi!", false, (int) '#');
        boolean boolean41 = pricingRequest40.seasonalSale();
        java.lang.String str42 = pricingRequest40.couponCode();
        java.lang.String str43 = pricingRequest40.couponCode();
        boolean boolean44 = pricingRequest29.equals((java.lang.Object) pricingRequest40);
        java.lang.String str45 = pricingRequest29.toString();
        boolean boolean46 = pricingRequest29.firstOrder();
        boolean boolean47 = pricingRequest19.equals((java.lang.Object) pricingRequest29);
        boolean boolean48 = pricingRequest29.firstOrder();
        java.lang.String str49 = pricingRequest29.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]" + "'", str20, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str45, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType16, false, "hi!", false, (int) '#');
        boolean boolean23 = pricingRequest21.equals((java.lang.Object) (short) -1);
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) boolean23);
        boolean boolean25 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType17, false, "hi!", false, (int) '#');
        boolean boolean23 = pricingRequest22.seasonalSale();
        java.lang.String str24 = pricingRequest22.couponCode();
        java.lang.String str25 = pricingRequest22.toString();
        java.lang.String str26 = pricingRequest22.couponCode();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType31, false, "hi!", false, (int) '#');
        boolean boolean37 = pricingRequest36.seasonalSale();
        java.lang.String str38 = pricingRequest36.couponCode();
        java.lang.String str39 = pricingRequest36.couponCode();
        boolean boolean40 = pricingRequest36.seasonalSale();
        boolean boolean42 = pricingRequest36.equals((java.lang.Object) 10.0d);
        java.lang.String str43 = pricingRequest36.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest36.customerType();
        boolean boolean45 = pricingRequest22.equals((java.lang.Object) pricingRequest36);
        java.lang.String str46 = pricingRequest36.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str25, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str46, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType5, false, "hi!", false, (int) '#');
        boolean boolean11 = pricingRequest10.seasonalSale();
        java.lang.String str12 = pricingRequest10.couponCode();
        boolean boolean14 = pricingRequest10.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType15, true, "", false, (int) 'a');
        boolean boolean22 = pricingRequest20.equals((java.lang.Object) false);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType28, false, "hi!", false, (int) '#');
        boolean boolean34 = pricingRequest33.seasonalSale();
        java.lang.String str35 = pricingRequest33.couponCode();
        boolean boolean37 = pricingRequest33.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest33.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType38, false, "", true, (int) (byte) 10);
        boolean boolean44 = pricingRequest43.seasonalSale();
        double double45 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType50, false, "hi!", false, (int) '#');
        boolean boolean56 = pricingRequest55.seasonalSale();
        java.lang.String str57 = pricingRequest55.couponCode();
        boolean boolean59 = pricingRequest55.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest55.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType60, true, "", false, (int) 'a');
        double double66 = pricingRequest65.basePrice();
        int int67 = pricingRequest65.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine68 = new com.viktor.lab4.PricingEngine();
        boolean boolean69 = pricingRequest65.equals((java.lang.Object) pricingEngine68);
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType72, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double78 = pricingEngine68.calculateFinalPrice(pricingRequest77);
        double double79 = pricingEngine0.calculateFinalPrice(pricingRequest77);
        com.viktor.lab4.PricingEngine.CustomerType customerType82 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest87 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType82, false, "hi!", false, (int) '#');
        boolean boolean88 = pricingRequest87.seasonalSale();
        java.lang.String str89 = pricingRequest87.couponCode();
        java.lang.String str90 = pricingRequest87.toString();
        double double91 = pricingRequest87.basePrice();
        double double92 = pricingRequest87.basePrice();
        boolean boolean93 = pricingRequest87.seasonalSale();
        boolean boolean94 = pricingRequest87.seasonalSale();
        int int95 = pricingRequest87.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double96 = pricingEngine0.calculateFinalPrice(pricingRequest87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 638.49d + "'", double23 == 638.49d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 737.99d + "'", double45 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 97.0d + "'", double66 == 97.0d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 41.79d + "'", double78 == 41.79d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 41.79d + "'", double79 == 41.79d);
        org.junit.Assert.assertTrue("'" + customerType82 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType82.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str90, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 100.0d + "'", double91 == 100.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 35 + "'", int95 == 35);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        boolean boolean14 = pricingRequest7.seasonalSale();
        boolean boolean15 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType22, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType22, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (byte) 100, customerType22, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 0);
        int int38 = pricingRequest37.quantity();
        double double39 = pricingRequest37.basePrice();
        int int40 = pricingRequest37.loyaltyPoints();
        java.lang.String str41 = pricingRequest37.toString();
        boolean boolean42 = pricingRequest7.equals((java.lang.Object) str41);
        int int43 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]" + "'", str41, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType2, false, "hi!", false, (int) (byte) 1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType12, false, "hi!", false, (int) '#');
        java.lang.Class<?> wildcardClass18 = pricingRequest17.getClass();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) wildcardClass18);
        int int20 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        java.lang.String str14 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 0, customerType16, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType16, false, "hi!", false, (int) '#');
        java.lang.String str27 = pricingRequest26.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType30, false, "hi!", false, (int) '#');
        boolean boolean36 = pricingRequest35.seasonalSale();
        java.lang.String str37 = pricingRequest35.couponCode();
        java.lang.String str38 = pricingRequest35.couponCode();
        boolean boolean39 = pricingRequest35.seasonalSale();
        double double40 = pricingRequest35.basePrice();
        double double41 = pricingRequest35.basePrice();
        boolean boolean42 = pricingRequest35.firstOrder();
        boolean boolean43 = pricingRequest26.equals((java.lang.Object) boolean42);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str27, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str11, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType8, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType8, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        double double29 = pricingRequest28.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType32, false, "hi!", false, (int) '#');
        boolean boolean38 = pricingRequest37.seasonalSale();
        java.lang.String str39 = pricingRequest37.couponCode();
        java.lang.String str40 = pricingRequest37.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest37.customerType();
        int int42 = pricingRequest37.quantity();
        java.lang.String str43 = pricingRequest37.couponCode();
        int int44 = pricingRequest37.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType47, false, "hi!", false, (int) '#');
        boolean boolean53 = pricingRequest52.seasonalSale();
        java.lang.String str54 = pricingRequest52.couponCode();
        java.lang.String str55 = pricingRequest52.toString();
        java.lang.String str56 = pricingRequest52.couponCode();
        boolean boolean57 = pricingRequest37.equals((java.lang.Object) pricingRequest52);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest52.customerType();
        double double59 = pricingRequest52.basePrice();
        boolean boolean60 = pricingRequest28.equals((java.lang.Object) pricingRequest52);
        java.lang.String str61 = pricingRequest28.couponCode();
        int int62 = pricingRequest28.quantity();
        java.lang.String str63 = pricingRequest28.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest71 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType66, false, "hi!", false, (int) '#');
        boolean boolean72 = pricingRequest71.seasonalSale();
        java.lang.String str73 = pricingRequest71.couponCode();
        java.lang.String str74 = pricingRequest71.couponCode();
        boolean boolean75 = pricingRequest71.seasonalSale();
        double double76 = pricingRequest71.basePrice();
        double double77 = pricingRequest71.basePrice();
        java.lang.String str78 = pricingRequest71.toString();
        boolean boolean79 = pricingRequest71.firstOrder();
        boolean boolean80 = pricingRequest71.seasonalSale();
        boolean boolean81 = pricingRequest28.equals((java.lang.Object) pricingRequest71);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str55, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str61, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97], firstOrder=false, loyaltyPoints=35]" + "'", str63, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97], firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str78, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType14, true, "", false, (int) 'a');
        double double20 = pricingRequest19.basePrice();
        double double21 = pricingRequest19.basePrice();
        java.lang.String str22 = pricingRequest19.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType27, false, "hi!", false, (int) '#');
        boolean boolean33 = pricingRequest32.seasonalSale();
        java.lang.String str34 = pricingRequest32.couponCode();
        boolean boolean36 = pricingRequest32.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest32.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType37, true, "", false, (int) 'a');
        double double43 = pricingRequest42.basePrice();
        int int44 = pricingRequest42.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine45 = new com.viktor.lab4.PricingEngine();
        boolean boolean46 = pricingRequest42.equals((java.lang.Object) pricingEngine45);
        boolean boolean47 = pricingRequest19.equals((java.lang.Object) pricingEngine45);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        java.lang.String str59 = pricingRequest57.couponCode();
        boolean boolean61 = pricingRequest57.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType62, false, "", true, (int) (byte) 10);
        boolean boolean68 = pricingRequest67.seasonalSale();
        int int69 = pricingRequest67.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest67.customerType();
        double double71 = pricingEngine45.calculateFinalPrice(pricingRequest67);
        com.viktor.lab4.PricingEngine.CustomerType customerType78 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest83 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType78, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest88 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 1, customerType78, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest93 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) '4', customerType78, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double94 = pricingEngine45.calculateFinalPrice(pricingRequest93);
        com.viktor.lab4.PricingEngine.CustomerType customerType95 = pricingRequest93.customerType();
        boolean boolean96 = pricingRequest93.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str22, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + customerType62 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType62.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 737.99d + "'", double71 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType78 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType78.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 7.99d + "'", double94 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType95 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType95.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }
}

