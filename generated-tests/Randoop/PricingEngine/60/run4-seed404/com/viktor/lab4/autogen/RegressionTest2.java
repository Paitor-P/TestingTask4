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
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 35, customerType15, false, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 0, customerType15, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]", true, 1);
        double double26 = pricingRequest25.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        boolean boolean16 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType21, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType21, false, "hi!", false, 10);
        boolean boolean32 = pricingRequest31.firstOrder();
        double double33 = pricingRequest31.basePrice();
        java.lang.String str34 = pricingRequest31.couponCode();
        boolean boolean35 = pricingRequest14.equals((java.lang.Object) pricingRequest31);
        boolean boolean36 = pricingRequest31.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest31.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        boolean boolean16 = pricingRequest14.seasonalSale();
        java.lang.String str17 = pricingRequest14.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine18 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType21, false, "hi!", false, (int) '#');
        boolean boolean27 = pricingRequest26.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest26.customerType();
        double double31 = pricingEngine18.calculateFinalPrice(pricingRequest26);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType34, false, "hi!", false, (int) '#');
        double double40 = pricingEngine18.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType43, false, "hi!", false, (int) '#');
        double double49 = pricingRequest48.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest48.customerType();
        java.lang.String str51 = pricingRequest48.toString();
        int int52 = pricingRequest48.quantity();
        double double53 = pricingEngine18.calculateFinalPrice(pricingRequest48);
        boolean boolean54 = pricingRequest14.equals((java.lang.Object) double53);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType61, false, "hi!", false, (int) '#');
        boolean boolean67 = pricingRequest66.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest66.customerType();
        double double69 = pricingRequest66.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest66.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (short) -1, customerType70, false, "", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '#', customerType70, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = pricingRequest80.customerType();
        boolean boolean82 = pricingRequest14.equals((java.lang.Object) customerType81);
        boolean boolean83 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 880.99d + "'", double31 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 880.99d + "'", double40 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str51, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 880.99d + "'", double53 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType6, false, "hi!", false, 10);
        boolean boolean17 = pricingRequest16.firstOrder();
        double double18 = pricingRequest16.basePrice();
        java.lang.String str19 = pricingRequest16.couponCode();
        int int20 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (byte) 0, customerType21, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97]", true, (int) ' ');
        java.lang.String str27 = pricingRequest26.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97]");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        boolean boolean15 = pricingRequest14.firstOrder();
        int int16 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType21, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType21, false, "", false, 0);
        int int32 = pricingRequest31.quantity();
        boolean boolean33 = pricingRequest31.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        double double35 = pricingRequest31.basePrice();
        boolean boolean36 = pricingRequest14.equals((java.lang.Object) double35);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType41, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType41, false, "", false, 0);
        int int52 = pricingRequest51.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest51.customerType();
        boolean boolean54 = pricingRequest51.firstOrder();
        boolean boolean55 = pricingRequest51.seasonalSale();
        boolean boolean56 = pricingRequest14.equals((java.lang.Object) boolean55);
        java.lang.String str57 = pricingRequest14.toString();
        boolean boolean58 = pricingRequest14.firstOrder();
        java.lang.String str59 = pricingRequest14.couponCode();
        boolean boolean60 = pricingRequest14.firstOrder();
        int int61 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str57, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.loyaltyPoints();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType20, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType20, false, "", false, 0);
        int int31 = pricingRequest30.quantity();
        double double32 = pricingRequest30.basePrice();
        int int33 = pricingRequest30.quantity();
        int int34 = pricingRequest30.quantity();
        int int35 = pricingRequest30.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, 0, customerType36, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", true, (int) (short) 100);
        boolean boolean42 = pricingRequest7.equals((java.lang.Object) true);
        boolean boolean43 = pricingRequest7.seasonalSale();
        boolean boolean44 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine pricingEngine12 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        java.lang.String str23 = pricingRequest20.couponCode();
        double double24 = pricingEngine12.calculateFinalPrice(pricingRequest20);
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingEngine12);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        boolean boolean34 = pricingRequest33.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType39, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) ' ', customerType39, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 10);
        boolean boolean50 = pricingRequest33.equals((java.lang.Object) "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        double double51 = pricingEngine12.calculateFinalPrice(pricingRequest33);
        double double52 = pricingRequest33.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 880.99d + "'", double24 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 880.99d + "'", double51 == 880.99d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        double double22 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType25, false, "hi!", false, (int) '#');
        boolean boolean31 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest30.customerType();
        int int33 = pricingRequest30.loyaltyPoints();
        boolean boolean34 = pricingRequest30.firstOrder();
        double double35 = pricingRequest30.basePrice();
        java.lang.String str36 = pricingRequest30.toString();
        double double37 = pricingEngine0.calculateFinalPrice(pricingRequest30);
        boolean boolean38 = pricingRequest30.seasonalSale();
        java.lang.String str39 = pricingRequest30.couponCode();
        boolean boolean40 = pricingRequest30.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 880.99d + "'", double22 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str36, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 880.99d + "'", double37 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 10, customerType2, true, "hi!", true, (-1));
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.loyaltyPoints();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.loyaltyPoints();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest20.customerType();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        double double34 = pricingRequest33.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        java.lang.String str36 = pricingRequest33.toString();
        int int37 = pricingRequest33.quantity();
        java.lang.String str38 = pricingRequest33.toString();
        double double39 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType42, false, "hi!", false, (int) '#');
        boolean boolean48 = pricingRequest47.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest47.customerType();
        int int50 = pricingRequest47.loyaltyPoints();
        boolean boolean51 = pricingRequest47.firstOrder();
        double double52 = pricingRequest47.basePrice();
        java.lang.String str53 = pricingRequest47.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest47.customerType();
        java.lang.String str55 = pricingRequest47.toString();
        java.lang.String str56 = pricingRequest47.toString();
        double double57 = pricingEngine0.calculateFinalPrice(pricingRequest47);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 880.99d + "'", double25 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str36, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 880.99d + "'", double39 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str53, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str55, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str56, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 880.99d + "'", double57 == 880.99d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        boolean boolean14 = pricingRequest13.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) '#', customerType16, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 32, customerType16, true, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType27, true, "PricingRequest[basePrice=-1.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        boolean boolean15 = pricingRequest7.firstOrder();
        boolean boolean16 = pricingRequest7.firstOrder();
        int int17 = pricingRequest7.loyaltyPoints();
        boolean boolean18 = pricingRequest7.seasonalSale();
        java.lang.String str19 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str19, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType8, false, "hi!", false, 10);
        boolean boolean19 = pricingRequest18.firstOrder();
        boolean boolean20 = pricingRequest18.firstOrder();
        boolean boolean21 = pricingRequest18.firstOrder();
        java.lang.String str22 = pricingRequest18.toString();
        java.lang.String str23 = pricingRequest18.couponCode();
        boolean boolean24 = pricingRequest18.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(8.84d, (int) (short) 10, customerType25, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(735.49d, (int) 'a', customerType25, false, "PricingRequest[basePrice=-1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", true, 0);
        double double36 = pricingRequest35.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str22, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 735.49d + "'", double36 == 735.49d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        double double12 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType13, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 0, customerType13, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97], firstOrder=false, loyaltyPoints=1]", false, (int) '4');
        int int24 = pricingRequest23.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(735.49d, (int) (short) -1, customerType11, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97]", false, 1);
        java.lang.String str17 = pricingRequest16.couponCode();
        int int18 = pricingRequest16.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.seasonalSale();
        java.lang.String str13 = pricingRequest8.toString();
        double double14 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType19, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (short) 1, customerType19, true, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean30 = pricingRequest29.firstOrder();
        double double31 = pricingEngine0.calculateFinalPrice(pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType34, false, "hi!", false, (int) '#');
        boolean boolean40 = pricingRequest39.seasonalSale();
        double double41 = pricingRequest39.basePrice();
        double double42 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType49, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType49, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 97, customerType49, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, 100);
        double double65 = pricingEngine0.calculateFinalPrice(pricingRequest64);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 880.99d + "'", double14 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 92.99d + "'", double31 == 92.99d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 880.99d + "'", double42 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 822.79d + "'", double65 == 822.79d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        int int16 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest14.customerType();
        java.lang.String str18 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        java.lang.String str24 = pricingRequest21.toString();
        int int25 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine pricingEngine26 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest34.customerType();
        java.lang.String str37 = pricingRequest34.couponCode();
        double double38 = pricingEngine26.calculateFinalPrice(pricingRequest34);
        boolean boolean39 = pricingRequest21.equals((java.lang.Object) pricingEngine26);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 0, customerType40, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 97);
        boolean boolean46 = pricingRequest7.equals((java.lang.Object) 97);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType51, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType51, false, "", false, 0);
        int int62 = pricingRequest61.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest61.customerType();
        boolean boolean64 = pricingRequest61.firstOrder();
        int int65 = pricingRequest61.quantity();
        java.lang.String str66 = pricingRequest61.couponCode();
        int int67 = pricingRequest61.loyaltyPoints();
        boolean boolean68 = pricingRequest7.equals((java.lang.Object) pricingRequest61);
        double double69 = pricingRequest61.basePrice();
        java.lang.String str70 = pricingRequest61.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str24, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 880.99d + "'", double38 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str70, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) ' ', customerType2, true, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine11 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        java.lang.String str22 = pricingRequest19.couponCode();
        double double23 = pricingEngine11.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType26, false, "hi!", false, (int) '#');
        boolean boolean32 = pricingRequest31.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest31.customerType();
        int int34 = pricingRequest31.loyaltyPoints();
        java.lang.String str35 = pricingRequest31.couponCode();
        double double36 = pricingEngine11.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType39, false, "hi!", false, (int) '#');
        boolean boolean45 = pricingRequest44.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest44.customerType();
        java.lang.String str47 = pricingRequest44.couponCode();
        int int48 = pricingRequest44.loyaltyPoints();
        double double49 = pricingEngine11.calculateFinalPrice(pricingRequest44);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        double double59 = pricingRequest57.basePrice();
        boolean boolean61 = pricingRequest57.equals((java.lang.Object) "");
        double double62 = pricingEngine11.calculateFinalPrice(pricingRequest57);
        boolean boolean63 = pricingRequest7.equals((java.lang.Object) pricingEngine11);
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest71 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType66, false, "hi!", false, (int) '#');
        boolean boolean72 = pricingRequest71.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest71.customerType();
        double double74 = pricingRequest71.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = pricingRequest71.customerType();
        int int76 = pricingRequest71.loyaltyPoints();
        java.lang.String str77 = pricingRequest71.toString();
        int int78 = pricingRequest71.quantity();
        boolean boolean79 = pricingRequest71.firstOrder();
        boolean boolean80 = pricingRequest71.firstOrder();
        int int81 = pricingRequest71.loyaltyPoints();
        double double82 = pricingEngine11.calculateFinalPrice(pricingRequest71);
        boolean boolean83 = pricingRequest71.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 880.99d + "'", double23 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 880.99d + "'", double36 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 880.99d + "'", double49 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 880.99d + "'", double62 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + customerType73 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType73.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str77, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 35 + "'", int81 == 35);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 880.99d + "'", double82 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(880.99d, (int) '4', customerType14, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean21 = pricingRequest19.equals((java.lang.Object) customerType20);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 0, customerType20, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) -1, customerType20, true, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) 0, customerType20, false, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 10, customerType20, true, "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest(8.79d, (int) (byte) 100, customerType20, false, "", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType20, false, "PricingRequest[basePrice=1.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", true, 1);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (short) -1, customerType13, false, "", true, (int) (short) 10);
        int int19 = pricingRequest18.loyaltyPoints();
        boolean boolean20 = pricingRequest18.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        int int23 = pricingRequest20.loyaltyPoints();
        java.lang.String str24 = pricingRequest20.couponCode();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        boolean boolean26 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType31, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType31, false, "", false, 0);
        int int42 = pricingRequest41.quantity();
        boolean boolean43 = pricingRequest41.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType48, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType48, false, "hi!", false, 10);
        boolean boolean59 = pricingRequest58.firstOrder();
        double double60 = pricingRequest58.basePrice();
        java.lang.String str61 = pricingRequest58.couponCode();
        boolean boolean62 = pricingRequest41.equals((java.lang.Object) pricingRequest58);
        boolean boolean63 = pricingRequest20.equals((java.lang.Object) boolean62);
        int int64 = pricingRequest20.loyaltyPoints();
        double double65 = pricingRequest20.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 880.99d + "'", double25 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        double double14 = pricingRequest13.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType15, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 0, customerType15, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97], firstOrder=false, loyaltyPoints=1]", false, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 100, customerType15, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=100]", true, 35);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType11, true, "hi!", true, (int) (byte) 0);
        boolean boolean17 = pricingRequest16.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType20, false, "hi!", false, (int) '#');
        double double26 = pricingRequest25.basePrice();
        int int27 = pricingRequest25.loyaltyPoints();
        java.lang.String str28 = pricingRequest25.toString();
        boolean boolean29 = pricingRequest25.firstOrder();
        int int30 = pricingRequest25.loyaltyPoints();
        java.lang.String str31 = pricingRequest25.toString();
        boolean boolean32 = pricingRequest25.seasonalSale();
        boolean boolean33 = pricingRequest16.equals((java.lang.Object) pricingRequest25);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str28, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str31, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType4, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) '4', customerType4, false, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        java.lang.String str15 = pricingRequest14.toString();
        java.lang.String str16 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=-1.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        java.lang.String str17 = pricingRequest14.toString();
        int int18 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest14.customerType();
        int int20 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine21 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType24, false, "hi!", false, (int) '#');
        boolean boolean30 = pricingRequest29.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest29.customerType();
        double double34 = pricingEngine21.calculateFinalPrice(pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest29.customerType();
        boolean boolean36 = pricingRequest14.equals((java.lang.Object) customerType35);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str17, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 880.99d + "'", double34 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        double double11 = pricingRequest8.basePrice();
        boolean boolean12 = pricingRequest8.seasonalSale();
        java.lang.String str13 = pricingRequest8.toString();
        double double14 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType19, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (short) 1, customerType19, true, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean30 = pricingRequest29.firstOrder();
        double double31 = pricingEngine0.calculateFinalPrice(pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType34, false, "hi!", false, (int) '#');
        boolean boolean40 = pricingRequest39.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest39.customerType();
        int int44 = pricingRequest39.quantity();
        double double45 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        boolean boolean46 = pricingRequest39.seasonalSale();
        int int47 = pricingRequest39.quantity();
        int int48 = pricingRequest39.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 880.99d + "'", double14 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 92.99d + "'", double31 == 92.99d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 880.99d + "'", double45 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        boolean boolean15 = pricingRequest14.firstOrder();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        int int18 = pricingRequest14.loyaltyPoints();
        double double19 = pricingRequest14.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType28, false, "", false, 0);
        int int39 = pricingRequest38.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest38.customerType();
        boolean boolean41 = pricingRequest38.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest38.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (short) 1, customerType42, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (short) 0, customerType42, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, 0);
        boolean boolean53 = pricingRequest14.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass54 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType6, false, "", false, 0);
        int int17 = pricingRequest16.quantity();
        boolean boolean18 = pricingRequest16.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 100, customerType19, false, "PricingRequest[basePrice=1.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=1]", true, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest14.customerType();
        int int18 = pricingRequest14.quantity();
        java.lang.String str19 = pricingRequest14.toString();
        java.lang.String str20 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str20, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType28, false, "", false, 0);
        int int39 = pricingRequest38.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest38.customerType();
        boolean boolean41 = pricingRequest21.equals((java.lang.Object) pricingRequest38);
        int int42 = pricingRequest21.quantity();
        int int43 = pricingRequest21.loyaltyPoints();
        double double44 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine pricingEngine45 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType48, false, "hi!", false, (int) '#');
        boolean boolean54 = pricingRequest53.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = pricingRequest53.customerType();
        java.lang.String str56 = pricingRequest53.couponCode();
        double double57 = pricingEngine45.calculateFinalPrice(pricingRequest53);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType60, false, "hi!", false, (int) '#');
        double double66 = pricingEngine45.calculateFinalPrice(pricingRequest65);
        boolean boolean67 = pricingRequest21.equals((java.lang.Object) double66);
        double double68 = pricingRequest21.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 880.99d + "'", double44 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 880.99d + "'", double57 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 880.99d + "'", double66 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (byte) 10, customerType10, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 10);
        java.lang.String str16 = pricingRequest15.toString();
        int int17 = pricingRequest15.quantity();
        int int18 = pricingRequest15.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType23, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType23, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        boolean boolean35 = pricingRequest33.seasonalSale();
        boolean boolean36 = pricingRequest33.seasonalSale();
        java.lang.String str37 = pricingRequest33.couponCode();
        int int38 = pricingRequest33.loyaltyPoints();
        java.lang.String str39 = pricingRequest33.toString();
        boolean boolean40 = pricingRequest15.equals((java.lang.Object) str39);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest15.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]" + "'", str16, "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str39, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) '4', customerType11, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=0]", true, 97);
        double double17 = pricingRequest16.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType12, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType12, false, "", false, 0);
        int int23 = pricingRequest22.quantity();
        double double24 = pricingRequest22.basePrice();
        int int25 = pricingRequest22.quantity();
        int int26 = pricingRequest22.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (short) 0, customerType27, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1], firstOrder=false, loyaltyPoints=0]", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 100, customerType27, true, "hi!", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 10, customerType27, false, "PricingRequest[basePrice=1.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest(35.0d, 1, customerType27, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        double double21 = pricingRequest19.basePrice();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) double21);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest34.customerType();
        double double37 = pricingRequest34.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (short) -1, customerType38, false, "", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '#', customerType38, true, "hi!", true, (int) (short) -1);
        java.lang.String str49 = pricingRequest48.toString();
        boolean boolean50 = pricingRequest7.equals((java.lang.Object) pricingRequest48);
        int int51 = pricingRequest48.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str49, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        double double21 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        java.lang.String str23 = pricingRequest20.toString();
        int int24 = pricingRequest20.quantity();
        com.viktor.lab4.PricingEngine pricingEngine25 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        boolean boolean34 = pricingRequest33.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        java.lang.String str36 = pricingRequest33.couponCode();
        double double37 = pricingEngine25.calculateFinalPrice(pricingRequest33);
        boolean boolean38 = pricingRequest20.equals((java.lang.Object) pricingEngine25);
        boolean boolean39 = pricingRequest8.equals((java.lang.Object) pricingRequest20);
        int int40 = pricingRequest8.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str23, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 880.99d + "'", double37 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType20, false, "hi!", false, (int) '#');
        double double26 = pricingRequest25.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest25.customerType();
        java.lang.String str28 = pricingRequest25.toString();
        int int29 = pricingRequest25.quantity();
        com.viktor.lab4.PricingEngine pricingEngine30 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType33, false, "hi!", false, (int) '#');
        boolean boolean39 = pricingRequest38.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest38.customerType();
        java.lang.String str41 = pricingRequest38.couponCode();
        double double42 = pricingEngine30.calculateFinalPrice(pricingRequest38);
        boolean boolean43 = pricingRequest25.equals((java.lang.Object) pricingEngine30);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 35, customerType44, true, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) (short) 10, customerType44, false, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, 97);
        double double55 = pricingEngine0.calculateFinalPrice(pricingRequest54);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType58, false, "hi!", false, (int) '#');
        boolean boolean64 = pricingRequest63.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = pricingRequest63.customerType();
        int int66 = pricingRequest63.loyaltyPoints();
        boolean boolean67 = pricingRequest63.firstOrder();
        double double68 = pricingRequest63.basePrice();
        java.lang.String str69 = pricingRequest63.toString();
        java.lang.String str70 = pricingRequest63.couponCode();
        double double71 = pricingEngine0.calculateFinalPrice(pricingRequest63);
        int int72 = pricingRequest63.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str28, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 880.99d + "'", double42 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 305.49d + "'", double55 == 305.49d);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str69, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 880.99d + "'", double71 == 880.99d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        int int12 = pricingRequest7.loyaltyPoints();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType8, false, "", false, 0);
        double double19 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType24, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType24, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest34.customerType();
        int int36 = pricingRequest34.loyaltyPoints();
        boolean boolean37 = pricingRequest18.equals((java.lang.Object) pricingRequest34);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType38, false, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (byte) 10, customerType38, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = pricingRequest57.customerType();
        double double62 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType65, false, "hi!", false, (int) '#');
        double double71 = pricingEngine49.calculateFinalPrice(pricingRequest70);
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType74, false, "hi!", false, (int) '#');
        boolean boolean80 = pricingRequest79.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = pricingRequest79.customerType();
        int int82 = pricingRequest79.loyaltyPoints();
        boolean boolean83 = pricingRequest79.firstOrder();
        double double84 = pricingRequest79.basePrice();
        java.lang.String str85 = pricingRequest79.toString();
        double double86 = pricingEngine49.calculateFinalPrice(pricingRequest79);
        boolean boolean87 = pricingRequest48.equals((java.lang.Object) pricingEngine49);
        com.viktor.lab4.PricingEngine.CustomerType customerType88 = pricingRequest48.customerType();
        java.lang.Class<?> wildcardClass89 = customerType88.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 880.99d + "'", double62 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 880.99d + "'", double71 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 35 + "'", int82 == 35);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str85, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 880.99d + "'", double86 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + customerType88 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType88.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.firstOrder();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        double double22 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType26, false, "hi!", false, (int) '#');
        boolean boolean32 = pricingRequest31.seasonalSale();
        double double33 = pricingRequest31.basePrice();
        boolean boolean34 = pricingRequest19.equals((java.lang.Object) double33);
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str36 = pricingRequest19.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str36, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 35, customerType2, true, "PricingRequest[basePrice=100.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=10]", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        int int23 = pricingRequest20.loyaltyPoints();
        java.lang.String str24 = pricingRequest20.couponCode();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine pricingEngine26 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest34.customerType();
        java.lang.String str37 = pricingRequest34.couponCode();
        double double38 = pricingEngine26.calculateFinalPrice(pricingRequest34);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType41, false, "hi!", false, (int) '#');
        double double47 = pricingRequest46.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest46.customerType();
        java.lang.String str49 = pricingRequest46.toString();
        int int50 = pricingRequest46.quantity();
        com.viktor.lab4.PricingEngine pricingEngine51 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType54, false, "hi!", false, (int) '#');
        boolean boolean60 = pricingRequest59.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = pricingRequest59.customerType();
        java.lang.String str62 = pricingRequest59.couponCode();
        double double63 = pricingEngine51.calculateFinalPrice(pricingRequest59);
        boolean boolean64 = pricingRequest46.equals((java.lang.Object) pricingEngine51);
        boolean boolean65 = pricingRequest34.equals((java.lang.Object) pricingRequest46);
        double double66 = pricingEngine0.calculateFinalPrice(pricingRequest46);
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType71, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest81 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType71, false, "", false, 0);
        int int82 = pricingRequest81.quantity();
        boolean boolean83 = pricingRequest81.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType84 = pricingRequest81.customerType();
        double double85 = pricingRequest81.basePrice();
        java.lang.String str86 = pricingRequest81.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType87 = pricingRequest81.customerType();
        int int88 = pricingRequest81.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double89 = pricingEngine0.calculateFinalPrice(pricingRequest81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 880.99d + "'", double25 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 880.99d + "'", double38 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str49, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 880.99d + "'", double63 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 880.99d + "'", double66 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + customerType84 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType84.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str86, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType87 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType87.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        double double22 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine pricingEngine23 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType26, false, "hi!", false, (int) '#');
        boolean boolean32 = pricingRequest31.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest31.customerType();
        java.lang.String str34 = pricingRequest31.couponCode();
        double double35 = pricingEngine23.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType38, false, "hi!", false, (int) '#');
        double double44 = pricingRequest43.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = pricingRequest43.customerType();
        java.lang.String str46 = pricingRequest43.toString();
        int int47 = pricingRequest43.quantity();
        com.viktor.lab4.PricingEngine pricingEngine48 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType51, false, "hi!", false, (int) '#');
        boolean boolean57 = pricingRequest56.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest56.customerType();
        java.lang.String str59 = pricingRequest56.couponCode();
        double double60 = pricingEngine48.calculateFinalPrice(pricingRequest56);
        boolean boolean61 = pricingRequest43.equals((java.lang.Object) pricingEngine48);
        boolean boolean62 = pricingRequest31.equals((java.lang.Object) pricingRequest43);
        double double63 = pricingEngine0.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType68, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest78 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType68, false, "", false, 0);
        int int79 = pricingRequest78.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType80 = pricingRequest78.customerType();
        boolean boolean81 = pricingRequest78.firstOrder();
        int int82 = pricingRequest78.quantity();
        int int83 = pricingRequest78.loyaltyPoints();
        java.lang.String str84 = pricingRequest78.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double85 = pricingEngine0.calculateFinalPrice(pricingRequest78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 880.99d + "'", double22 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 880.99d + "'", double35 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str46, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 880.99d + "'", double60 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 880.99d + "'", double63 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + customerType80 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType80.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        java.lang.String str15 = pricingRequest14.couponCode();
        double double16 = pricingRequest14.basePrice();
        int int17 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType2, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass9 = customerType8.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        double double21 = pricingRequest19.basePrice();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) double21);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest34.customerType();
        double double37 = pricingRequest34.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (short) -1, customerType38, false, "", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '#', customerType38, true, "hi!", true, (int) (short) -1);
        java.lang.String str49 = pricingRequest48.toString();
        boolean boolean50 = pricingRequest7.equals((java.lang.Object) pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType53, false, "hi!", false, (int) '#');
        double double59 = pricingRequest58.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest58.customerType();
        java.lang.String str61 = pricingRequest58.couponCode();
        boolean boolean62 = pricingRequest7.equals((java.lang.Object) pricingRequest58);
        java.lang.String str63 = pricingRequest58.toString();
        java.lang.String str64 = pricingRequest58.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str49, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str63, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str64, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType4, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) ' ', customerType4, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        boolean boolean16 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType28, false, "", false, 0);
        int int39 = pricingRequest38.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest38.customerType();
        boolean boolean41 = pricingRequest21.equals((java.lang.Object) pricingRequest38);
        int int42 = pricingRequest21.quantity();
        int int43 = pricingRequest21.loyaltyPoints();
        double double44 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType47, false, "hi!", false, (int) '#');
        double double53 = pricingRequest52.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest52.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType59, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType59, false, "", false, 0);
        int int70 = pricingRequest69.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = pricingRequest69.customerType();
        boolean boolean72 = pricingRequest52.equals((java.lang.Object) pricingRequest69);
        int int73 = pricingRequest52.quantity();
        int int74 = pricingRequest52.loyaltyPoints();
        boolean boolean75 = pricingRequest52.seasonalSale();
        double double76 = pricingEngine0.calculateFinalPrice(pricingRequest52);
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest86 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType81, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest91 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType81, false, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) -1);
        boolean boolean92 = pricingRequest91.seasonalSale();
        boolean boolean93 = pricingRequest91.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double94 = pricingEngine0.calculateFinalPrice(pricingRequest91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 880.99d + "'", double44 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 35 + "'", int74 == 35);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 880.99d + "'", double76 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType6, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) ' ', customerType6, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 0, customerType18, true, "PricingRequest[basePrice=0.0, quantity=35, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=35]", false, 10);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType28, false, "", false, 0);
        int int39 = pricingRequest38.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest38.customerType();
        boolean boolean41 = pricingRequest21.equals((java.lang.Object) pricingRequest38);
        int int42 = pricingRequest21.quantity();
        int int43 = pricingRequest21.loyaltyPoints();
        double double44 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType47, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest52.customerType();
        boolean boolean54 = pricingRequest52.seasonalSale();
        int int55 = pricingRequest52.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType60, false, "hi!", false, (int) '#');
        double double66 = pricingRequest65.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest65.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType67, true, "hi!", true, (int) (byte) 0);
        double double73 = pricingRequest72.basePrice();
        boolean boolean74 = pricingRequest72.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType77 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest82 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '#', customerType77, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) '#');
        double double83 = pricingRequest82.basePrice();
        boolean boolean84 = pricingRequest72.equals((java.lang.Object) pricingRequest82);
        java.lang.String str85 = pricingRequest82.toString();
        int int86 = pricingRequest82.quantity();
        boolean boolean87 = pricingRequest82.seasonalSale();
        boolean boolean88 = pricingRequest52.equals((java.lang.Object) boolean87);
        double double89 = pricingEngine0.calculateFinalPrice(pricingRequest52);
        boolean boolean90 = pricingRequest52.firstOrder();
        java.lang.String str91 = pricingRequest52.toString();
        java.lang.String str92 = pricingRequest52.couponCode();
        int int93 = pricingRequest52.loyaltyPoints();
        int int94 = pricingRequest52.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 880.99d + "'", double44 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "PricingRequest[basePrice=0.0, quantity=35, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=35]" + "'", str85, "PricingRequest[basePrice=0.0, quantity=35, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 35 + "'", int86 == 35);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 880.99d + "'", double89 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str91, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 35 + "'", int93 == 35);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 35 + "'", int94 == 35);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        java.lang.String str24 = pricingRequest21.toString();
        int int25 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine pricingEngine26 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest34.customerType();
        java.lang.String str37 = pricingRequest34.couponCode();
        double double38 = pricingEngine26.calculateFinalPrice(pricingRequest34);
        boolean boolean39 = pricingRequest21.equals((java.lang.Object) pricingEngine26);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 0, customerType40, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 97);
        boolean boolean46 = pricingRequest7.equals((java.lang.Object) 97);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType51, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType51, false, "", false, 0);
        int int62 = pricingRequest61.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest61.customerType();
        boolean boolean64 = pricingRequest61.firstOrder();
        int int65 = pricingRequest61.quantity();
        java.lang.String str66 = pricingRequest61.couponCode();
        int int67 = pricingRequest61.loyaltyPoints();
        boolean boolean68 = pricingRequest7.equals((java.lang.Object) pricingRequest61);
        int int69 = pricingRequest61.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str24, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 880.99d + "'", double38 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        double double21 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType26, false, "hi!", false, (int) '#');
        boolean boolean32 = pricingRequest31.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest31.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) '#', customerType34, true, "", false, 1);
        int int40 = pricingRequest39.loyaltyPoints();
        int int41 = pricingRequest39.quantity();
        java.lang.String str42 = pricingRequest39.couponCode();
        double double43 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType46, false, "hi!", false, (int) '#');
        double double52 = pricingRequest51.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest51.customerType();
        java.lang.String str54 = pricingRequest51.toString();
        int int55 = pricingRequest51.quantity();
        com.viktor.lab4.PricingEngine pricingEngine56 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType59, false, "hi!", false, (int) '#');
        boolean boolean65 = pricingRequest64.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = pricingRequest64.customerType();
        java.lang.String str67 = pricingRequest64.couponCode();
        double double68 = pricingEngine56.calculateFinalPrice(pricingRequest64);
        boolean boolean69 = pricingRequest51.equals((java.lang.Object) pricingEngine56);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest51.customerType();
        java.lang.String str71 = pricingRequest51.couponCode();
        boolean boolean72 = pricingRequest51.firstOrder();
        boolean boolean73 = pricingRequest39.equals((java.lang.Object) pricingRequest51);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 880.99d + "'", double21 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 34.24d + "'", double43 == 34.24d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str54, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 880.99d + "'", double68 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        java.lang.String str12 = pricingRequest9.toString();
        int int13 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine pricingEngine14 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType17, false, "hi!", false, (int) '#');
        boolean boolean23 = pricingRequest22.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest22.customerType();
        java.lang.String str25 = pricingRequest22.couponCode();
        double double26 = pricingEngine14.calculateFinalPrice(pricingRequest22);
        boolean boolean27 = pricingRequest9.equals((java.lang.Object) pricingEngine14);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 35, customerType28, true, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 880.99d + "'", double26 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        int int23 = pricingRequest20.loyaltyPoints();
        java.lang.String str24 = pricingRequest20.couponCode();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        boolean boolean34 = pricingRequest33.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        java.lang.String str36 = pricingRequest33.couponCode();
        int int37 = pricingRequest33.loyaltyPoints();
        double double38 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType41, false, "hi!", false, (int) '#');
        boolean boolean47 = pricingRequest46.seasonalSale();
        double double48 = pricingRequest46.basePrice();
        boolean boolean50 = pricingRequest46.equals((java.lang.Object) "");
        double double51 = pricingEngine0.calculateFinalPrice(pricingRequest46);
        java.lang.Class<?> wildcardClass52 = pricingRequest46.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 880.99d + "'", double25 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 880.99d + "'", double38 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 880.99d + "'", double51 == 880.99d);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine11 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        java.lang.String str22 = pricingRequest19.couponCode();
        double double23 = pricingEngine11.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType26, false, "hi!", false, (int) '#');
        double double32 = pricingRequest31.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest31.customerType();
        java.lang.String str34 = pricingRequest31.toString();
        int int35 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine pricingEngine36 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType39, false, "hi!", false, (int) '#');
        boolean boolean45 = pricingRequest44.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest44.customerType();
        java.lang.String str47 = pricingRequest44.couponCode();
        double double48 = pricingEngine36.calculateFinalPrice(pricingRequest44);
        boolean boolean49 = pricingRequest31.equals((java.lang.Object) pricingEngine36);
        boolean boolean50 = pricingRequest19.equals((java.lang.Object) pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest31.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType54, false, "hi!", false, (int) '#');
        boolean boolean60 = pricingRequest59.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = pricingRequest59.customerType();
        int int62 = pricingRequest59.loyaltyPoints();
        boolean boolean63 = pricingRequest59.firstOrder();
        double double64 = pricingRequest59.basePrice();
        boolean boolean65 = pricingRequest31.equals((java.lang.Object) pricingRequest59);
        int int66 = pricingRequest59.loyaltyPoints();
        boolean boolean67 = pricingRequest7.equals((java.lang.Object) pricingRequest59);
        boolean boolean68 = pricingRequest59.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 880.99d + "'", double23 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str34, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 880.99d + "'", double48 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine11 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        java.lang.String str22 = pricingRequest19.couponCode();
        double double23 = pricingEngine11.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType26, false, "hi!", false, (int) '#');
        double double32 = pricingRequest31.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest31.customerType();
        java.lang.String str34 = pricingRequest31.toString();
        int int35 = pricingRequest31.quantity();
        com.viktor.lab4.PricingEngine pricingEngine36 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType39, false, "hi!", false, (int) '#');
        boolean boolean45 = pricingRequest44.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest44.customerType();
        java.lang.String str47 = pricingRequest44.couponCode();
        double double48 = pricingEngine36.calculateFinalPrice(pricingRequest44);
        boolean boolean49 = pricingRequest31.equals((java.lang.Object) pricingEngine36);
        boolean boolean50 = pricingRequest19.equals((java.lang.Object) pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest31.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType54, false, "hi!", false, (int) '#');
        boolean boolean60 = pricingRequest59.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = pricingRequest59.customerType();
        int int62 = pricingRequest59.loyaltyPoints();
        boolean boolean63 = pricingRequest59.firstOrder();
        double double64 = pricingRequest59.basePrice();
        boolean boolean65 = pricingRequest31.equals((java.lang.Object) pricingRequest59);
        int int66 = pricingRequest59.loyaltyPoints();
        boolean boolean67 = pricingRequest7.equals((java.lang.Object) pricingRequest59);
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType72, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest82 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType72, false, "", false, 0);
        int int83 = pricingRequest82.quantity();
        boolean boolean84 = pricingRequest82.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType85 = pricingRequest82.customerType();
        double double86 = pricingRequest82.basePrice();
        double double87 = pricingRequest82.basePrice();
        int int88 = pricingRequest82.loyaltyPoints();
        double double89 = pricingRequest82.basePrice();
        boolean boolean90 = pricingRequest59.equals((java.lang.Object) pricingRequest82);
        boolean boolean91 = pricingRequest59.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 880.99d + "'", double23 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str34, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 880.99d + "'", double48 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + customerType85 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType85.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType8, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        java.lang.String str20 = pricingRequest18.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType21, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 100, customerType21, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", true, 32);
        java.lang.String str32 = pricingRequest31.couponCode();
        java.lang.Class<?> wildcardClass33 = pricingRequest31.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str20, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str32, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.firstOrder();
        java.lang.String str14 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine pricingEngine15 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType18, false, "hi!", false, (int) '#');
        boolean boolean24 = pricingRequest23.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        java.lang.String str26 = pricingRequest23.couponCode();
        double double27 = pricingEngine15.calculateFinalPrice(pricingRequest23);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType30, false, "hi!", false, (int) '#');
        double double36 = pricingRequest35.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest35.customerType();
        java.lang.String str38 = pricingRequest35.toString();
        int int39 = pricingRequest35.quantity();
        com.viktor.lab4.PricingEngine pricingEngine40 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType43, false, "hi!", false, (int) '#');
        boolean boolean49 = pricingRequest48.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest48.customerType();
        java.lang.String str51 = pricingRequest48.couponCode();
        double double52 = pricingEngine40.calculateFinalPrice(pricingRequest48);
        boolean boolean53 = pricingRequest35.equals((java.lang.Object) pricingEngine40);
        boolean boolean54 = pricingRequest23.equals((java.lang.Object) pricingRequest35);
        boolean boolean55 = pricingRequest7.equals((java.lang.Object) pricingRequest35);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 880.99d + "'", double27 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 880.99d + "'", double52 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        boolean boolean16 = pricingRequest14.seasonalSale();
        java.lang.String str17 = pricingRequest14.couponCode();
        com.viktor.lab4.PricingEngine pricingEngine18 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType21, false, "hi!", false, (int) '#');
        boolean boolean27 = pricingRequest26.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest26.customerType();
        double double31 = pricingEngine18.calculateFinalPrice(pricingRequest26);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType34, false, "hi!", false, (int) '#');
        double double40 = pricingEngine18.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType43, false, "hi!", false, (int) '#');
        double double49 = pricingRequest48.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest48.customerType();
        java.lang.String str51 = pricingRequest48.toString();
        int int52 = pricingRequest48.quantity();
        double double53 = pricingEngine18.calculateFinalPrice(pricingRequest48);
        boolean boolean54 = pricingRequest14.equals((java.lang.Object) double53);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest(880.99d, (int) '4', customerType61, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean68 = pricingRequest66.equals((java.lang.Object) customerType67);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 0, customerType67, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest78 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) -1, customerType67, true, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType79 = pricingRequest78.customerType();
        java.lang.Object obj80 = null;
        boolean boolean81 = pricingRequest78.equals(obj80);
        boolean boolean82 = pricingRequest14.equals((java.lang.Object) pricingRequest78);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 880.99d + "'", double31 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 880.99d + "'", double40 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str51, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 880.99d + "'", double53 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + customerType79 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType79.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.firstOrder();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        boolean boolean17 = pricingRequest14.firstOrder();
        boolean boolean18 = pricingRequest14.seasonalSale();
        int int19 = pricingRequest14.quantity();
        int int20 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest14.customerType();
        boolean boolean22 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType19, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType19, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest29.customerType();
        boolean boolean31 = pricingRequest29.seasonalSale();
        boolean boolean32 = pricingRequest29.seasonalSale();
        int int33 = pricingRequest29.loyaltyPoints();
        boolean boolean34 = pricingRequest13.equals((java.lang.Object) pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (byte) 0, customerType35, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (short) 1, customerType35, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=100]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) (short) 10, customerType35, false, "PricingRequest[basePrice=0.0, quantity=100, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10], firstOrder=false, loyaltyPoints=100]", true, (int) (short) 0);
        int int51 = pricingRequest50.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        int int16 = pricingRequest14.loyaltyPoints();
        boolean boolean17 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest14.customerType();
        java.lang.String str19 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType22, false, "hi!", false, (int) '#');
        boolean boolean28 = pricingRequest27.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest27.customerType();
        int int30 = pricingRequest27.loyaltyPoints();
        java.lang.String str31 = pricingRequest27.couponCode();
        int int32 = pricingRequest27.quantity();
        double double33 = pricingRequest27.basePrice();
        boolean boolean34 = pricingRequest14.equals((java.lang.Object) pricingRequest27);
        boolean boolean35 = pricingRequest27.firstOrder();
        int int36 = pricingRequest27.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType41, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType41, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest51.customerType();
        boolean boolean53 = pricingRequest51.seasonalSale();
        boolean boolean54 = pricingRequest51.seasonalSale();
        int int55 = pricingRequest51.loyaltyPoints();
        java.lang.String str56 = pricingRequest51.toString();
        java.lang.Class<?> wildcardClass57 = pricingRequest51.getClass();
        boolean boolean58 = pricingRequest27.equals((java.lang.Object) wildcardClass57);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType61, false, "hi!", false, (int) '#');
        boolean boolean67 = pricingRequest66.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest66.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest66.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest66.customerType();
        int int71 = pricingRequest66.quantity();
        boolean boolean72 = pricingRequest27.equals((java.lang.Object) int71);
        double double73 = pricingRequest27.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str56, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.couponCode();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest20.customerType();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        double double34 = pricingRequest33.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        java.lang.String str36 = pricingRequest33.toString();
        int int37 = pricingRequest33.quantity();
        java.lang.String str38 = pricingRequest33.toString();
        double double39 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType46, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType46, false, "", false, 0);
        int int57 = pricingRequest56.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest56.customerType();
        boolean boolean59 = pricingRequest56.firstOrder();
        boolean boolean60 = pricingRequest56.seasonalSale();
        int int61 = pricingRequest56.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = pricingRequest56.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 97, customerType62, true, "", true, (int) 'a');
        double double68 = pricingEngine0.calculateFinalPrice(pricingRequest67);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 880.99d + "'", double25 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str36, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 880.99d + "'", double39 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + customerType62 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType62.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 6594.29d + "'", double68 == 6594.29d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        double double21 = pricingRequest19.basePrice();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) double21);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest34.customerType();
        double double37 = pricingRequest34.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (short) -1, customerType38, false, "", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '#', customerType38, true, "hi!", true, (int) (short) -1);
        java.lang.String str49 = pricingRequest48.toString();
        boolean boolean50 = pricingRequest7.equals((java.lang.Object) pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType53, false, "hi!", false, (int) '#');
        double double59 = pricingRequest58.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest58.customerType();
        java.lang.String str61 = pricingRequest58.couponCode();
        boolean boolean62 = pricingRequest7.equals((java.lang.Object) pricingRequest58);
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType67, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType67, false, "", false, 0);
        int int78 = pricingRequest77.quantity();
        boolean boolean79 = pricingRequest77.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType80 = pricingRequest77.customerType();
        boolean boolean81 = pricingRequest7.equals((java.lang.Object) customerType80);
        com.viktor.lab4.PricingEngine.CustomerType customerType82 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str49, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + customerType80 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType80.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + customerType82 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType82.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType8, false, "", false, 0);
        double double19 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType24, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType24, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest34.customerType();
        int int36 = pricingRequest34.loyaltyPoints();
        boolean boolean37 = pricingRequest18.equals((java.lang.Object) pricingRequest34);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType38, false, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (byte) 10, customerType38, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = pricingRequest57.customerType();
        double double62 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType65, false, "hi!", false, (int) '#');
        double double71 = pricingEngine49.calculateFinalPrice(pricingRequest70);
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType74, false, "hi!", false, (int) '#');
        boolean boolean80 = pricingRequest79.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = pricingRequest79.customerType();
        int int82 = pricingRequest79.loyaltyPoints();
        boolean boolean83 = pricingRequest79.firstOrder();
        double double84 = pricingRequest79.basePrice();
        java.lang.String str85 = pricingRequest79.toString();
        double double86 = pricingEngine49.calculateFinalPrice(pricingRequest79);
        boolean boolean87 = pricingRequest48.equals((java.lang.Object) pricingEngine49);
        com.viktor.lab4.PricingEngine.CustomerType customerType88 = pricingRequest48.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType89 = pricingRequest48.customerType();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 880.99d + "'", double62 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 880.99d + "'", double71 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 35 + "'", int82 == 35);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str85, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 880.99d + "'", double86 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + customerType88 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType88.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType89 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType89.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        int int11 = pricingRequest8.loyaltyPoints();
        java.lang.String str12 = pricingRequest8.couponCode();
        int int13 = pricingRequest8.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 10, customerType16, true, "hi!", true, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType24, false, "hi!", false, (int) '#');
        double double30 = pricingRequest29.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType36, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType36, false, "", false, 0);
        int int47 = pricingRequest46.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest46.customerType();
        boolean boolean49 = pricingRequest29.equals((java.lang.Object) pricingRequest46);
        int int50 = pricingRequest29.quantity();
        java.lang.Class<?> wildcardClass51 = pricingRequest29.getClass();
        boolean boolean52 = pricingRequest21.equals((java.lang.Object) pricingRequest29);
        boolean boolean53 = pricingRequest8.equals((java.lang.Object) boolean52);
        double double54 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        java.lang.String str55 = pricingRequest8.toString();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 880.99d + "'", double54 == 880.99d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str55, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        double double14 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (short) -1, customerType15, false, "", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '#', customerType15, true, "hi!", true, (int) (short) -1);
        boolean boolean26 = pricingRequest25.firstOrder();
        int int27 = pricingRequest25.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        int int12 = pricingRequest9.loyaltyPoints();
        int int13 = pricingRequest9.quantity();
        java.lang.String str14 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (-1), customerType15, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 1, customerType23, true, "PricingRequest[basePrice=0.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]", false, 0);
        java.lang.String str29 = pricingRequest28.toString();
        boolean boolean30 = pricingRequest28.firstOrder();
        boolean boolean31 = pricingRequest28.seasonalSale();
        boolean boolean32 = pricingRequest20.equals((java.lang.Object) boolean31);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType37, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType37, false, "", false, 0);
        java.lang.String str48 = pricingRequest47.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType53, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType53, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest63.customerType();
        boolean boolean65 = pricingRequest63.seasonalSale();
        boolean boolean66 = pricingRequest63.seasonalSale();
        boolean boolean67 = pricingRequest47.equals((java.lang.Object) boolean66);
        java.lang.Class<?> wildcardClass68 = pricingRequest47.getClass();
        boolean boolean69 = pricingRequest20.equals((java.lang.Object) wildcardClass68);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1], firstOrder=false, loyaltyPoints=0]" + "'", str29, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (byte) 10, customerType10, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 10);
        java.lang.String str16 = pricingRequest15.toString();
        int int17 = pricingRequest15.quantity();
        int int18 = pricingRequest15.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType23, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType23, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        boolean boolean35 = pricingRequest33.seasonalSale();
        boolean boolean36 = pricingRequest33.seasonalSale();
        java.lang.String str37 = pricingRequest33.couponCode();
        int int38 = pricingRequest33.loyaltyPoints();
        java.lang.String str39 = pricingRequest33.toString();
        boolean boolean40 = pricingRequest15.equals((java.lang.Object) str39);
        java.lang.Object obj41 = null;
        boolean boolean42 = pricingRequest15.equals(obj41);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]" + "'", str16, "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str39, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        java.lang.String str12 = pricingRequest9.toString();
        int int13 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) -1, customerType14, false, "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]", true, 10);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) '#', customerType14, true, "", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 32, customerType14, true, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType31, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType31, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest41.customerType();
        int int43 = pricingRequest41.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest41.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (-1), customerType44, true, "", false, (int) (short) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest(880.99d, (int) '4', customerType58, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean65 = pricingRequest63.equals((java.lang.Object) customerType64);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 0, customerType64, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) -1, customerType64, true, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType76 = pricingRequest75.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest81 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (byte) 1, customerType76, true, "", false, 10);
        boolean boolean82 = pricingRequest49.equals((java.lang.Object) true);
        boolean boolean83 = pricingRequest24.equals((java.lang.Object) pricingRequest49);
        int int84 = pricingRequest24.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + customerType76 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType76.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 35 + "'", int84 == 35);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType20, false, "hi!", false, (int) '#');
        double double26 = pricingRequest25.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest25.customerType();
        java.lang.String str28 = pricingRequest25.toString();
        int int29 = pricingRequest25.quantity();
        com.viktor.lab4.PricingEngine pricingEngine30 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType33, false, "hi!", false, (int) '#');
        boolean boolean39 = pricingRequest38.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest38.customerType();
        java.lang.String str41 = pricingRequest38.couponCode();
        double double42 = pricingEngine30.calculateFinalPrice(pricingRequest38);
        boolean boolean43 = pricingRequest25.equals((java.lang.Object) pricingEngine30);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 35, customerType44, true, "", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) (short) 10, customerType44, false, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, 97);
        double double55 = pricingEngine0.calculateFinalPrice(pricingRequest54);
        java.lang.String str56 = pricingRequest54.couponCode();
        int int57 = pricingRequest54.loyaltyPoints();
        boolean boolean58 = pricingRequest54.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str28, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 880.99d + "'", double42 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 305.49d + "'", double55 == 305.49d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str56, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (-1), customerType2, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 0);
        boolean boolean8 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType10, false, "", false, 0);
        int int21 = pricingRequest20.quantity();
        boolean boolean22 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType27, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType27, false, "hi!", false, 10);
        boolean boolean38 = pricingRequest37.firstOrder();
        double double39 = pricingRequest37.basePrice();
        java.lang.String str40 = pricingRequest37.couponCode();
        boolean boolean41 = pricingRequest20.equals((java.lang.Object) pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) ' ', customerType42, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) ' ', customerType42, false, "PricingRequest[basePrice=0.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType42, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, (int) (byte) 100);
        int int58 = pricingRequest57.quantity();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        boolean boolean16 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType21, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType21, false, "hi!", false, 10);
        boolean boolean32 = pricingRequest31.firstOrder();
        double double33 = pricingRequest31.basePrice();
        java.lang.String str34 = pricingRequest31.couponCode();
        boolean boolean35 = pricingRequest14.equals((java.lang.Object) pricingRequest31);
        boolean boolean36 = pricingRequest31.seasonalSale();
        boolean boolean37 = pricingRequest31.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        boolean boolean11 = pricingRequest9.firstOrder();
        java.lang.String str12 = pricingRequest9.couponCode();
        int int13 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest21.customerType();
        boolean boolean25 = pricingRequest9.equals((java.lang.Object) customerType24);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (byte) 10, customerType24, false, "PricingRequest[basePrice=-1.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 100);
        int int31 = pricingRequest30.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        double double15 = pricingRequest14.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType20, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType20, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest30.customerType();
        int int32 = pricingRequest30.loyaltyPoints();
        boolean boolean33 = pricingRequest14.equals((java.lang.Object) pricingRequest30);
        int int34 = pricingRequest14.quantity();
        java.lang.String str35 = pricingRequest14.toString();
        java.lang.Class<?> wildcardClass36 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str35, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        int int16 = pricingRequest14.loyaltyPoints();
        boolean boolean17 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest14.customerType();
        java.lang.String str19 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType22, false, "hi!", false, (int) '#');
        boolean boolean28 = pricingRequest27.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest27.customerType();
        int int30 = pricingRequest27.loyaltyPoints();
        java.lang.String str31 = pricingRequest27.couponCode();
        int int32 = pricingRequest27.quantity();
        double double33 = pricingRequest27.basePrice();
        boolean boolean34 = pricingRequest14.equals((java.lang.Object) pricingRequest27);
        boolean boolean35 = pricingRequest27.firstOrder();
        double double36 = pricingRequest27.basePrice();
        boolean boolean37 = pricingRequest27.seasonalSale();
        boolean boolean38 = pricingRequest27.firstOrder();
        boolean boolean39 = pricingRequest27.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.firstOrder();
        int int12 = pricingRequest7.quantity();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        double double21 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType24, false, "hi!", false, (int) '#');
        double double30 = pricingRequest29.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest29.customerType();
        java.lang.String str32 = pricingRequest29.couponCode();
        int int33 = pricingRequest29.loyaltyPoints();
        double double34 = pricingEngine0.calculateFinalPrice(pricingRequest29);
        boolean boolean35 = pricingRequest29.firstOrder();
        boolean boolean36 = pricingRequest29.firstOrder();
        double double37 = pricingRequest29.basePrice();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 880.99d + "'", double21 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 880.99d + "'", double34 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType12, false, "hi!", false, (int) '#');
        double double18 = pricingRequest17.basePrice();
        int int19 = pricingRequest17.loyaltyPoints();
        java.lang.String str20 = pricingRequest17.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest17.customerType();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) customerType21);
        java.lang.String str23 = pricingRequest7.couponCode();
        int int24 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str20, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType2, false, "", false, (int) (byte) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType8, false, "", false, 0);
        int int19 = pricingRequest18.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest18.customerType();
        boolean boolean21 = pricingRequest18.firstOrder();
        boolean boolean22 = pricingRequest18.seasonalSale();
        int int23 = pricingRequest18.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 97, customerType24, true, "", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType24, false, "PricingRequest[basePrice=305.49, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97], firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]", false, 0);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        int int16 = pricingRequest14.loyaltyPoints();
        boolean boolean17 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest14.customerType();
        java.lang.String str19 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType22, false, "hi!", false, (int) '#');
        boolean boolean28 = pricingRequest27.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest27.customerType();
        int int30 = pricingRequest27.loyaltyPoints();
        java.lang.String str31 = pricingRequest27.couponCode();
        int int32 = pricingRequest27.quantity();
        double double33 = pricingRequest27.basePrice();
        boolean boolean34 = pricingRequest14.equals((java.lang.Object) pricingRequest27);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (-1), customerType37, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest42.customerType();
        boolean boolean44 = pricingRequest27.equals((java.lang.Object) customerType43);
        java.lang.Class<?> wildcardClass45 = pricingRequest27.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType6, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        int int18 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType19, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType29, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType29, false, "hi!", false, 10);
        boolean boolean40 = pricingRequest39.firstOrder();
        int int41 = pricingRequest39.quantity();
        double double42 = pricingRequest39.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest39.customerType();
        boolean boolean44 = pricingRequest24.equals((java.lang.Object) customerType43);
        boolean boolean45 = pricingRequest24.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType17, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType17, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest27.customerType();
        boolean boolean29 = pricingRequest27.seasonalSale();
        boolean boolean30 = pricingRequest27.seasonalSale();
        int int31 = pricingRequest27.loyaltyPoints();
        boolean boolean32 = pricingRequest11.equals((java.lang.Object) pricingRequest27);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest27.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (byte) 0, customerType33, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (short) 1, customerType33, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=100]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine pricingEngine44 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType47, false, "hi!", false, (int) '#');
        boolean boolean53 = pricingRequest52.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest52.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = pricingRequest52.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest52.customerType();
        double double57 = pricingEngine44.calculateFinalPrice(pricingRequest52);
        boolean boolean59 = pricingRequest52.equals((java.lang.Object) 100.0d);
        boolean boolean60 = pricingRequest43.equals((java.lang.Object) boolean59);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 880.99d + "'", double57 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType6, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=0]", true, 10);
        int int22 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(880.99d, (int) '4', customerType2, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) customerType8);
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType4, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) '4', customerType4, false, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        java.lang.String str15 = pricingRequest14.toString();
        boolean boolean16 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=-1.0, quantity=52, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        int int23 = pricingRequest20.loyaltyPoints();
        java.lang.String str24 = pricingRequest20.couponCode();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        boolean boolean34 = pricingRequest33.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        java.lang.String str36 = pricingRequest33.couponCode();
        int int37 = pricingRequest33.loyaltyPoints();
        double double38 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType41, false, "hi!", false, (int) '#');
        boolean boolean47 = pricingRequest46.seasonalSale();
        boolean boolean48 = pricingRequest46.seasonalSale();
        double double49 = pricingEngine0.calculateFinalPrice(pricingRequest46);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest57.customerType();
        int int60 = pricingRequest57.loyaltyPoints();
        boolean boolean61 = pricingRequest57.firstOrder();
        double double62 = pricingRequest57.basePrice();
        java.lang.String str63 = pricingRequest57.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest57.customerType();
        java.lang.String str65 = pricingRequest57.toString();
        java.lang.String str66 = pricingRequest57.couponCode();
        double double67 = pricingEngine0.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest57.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 880.99d + "'", double25 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 880.99d + "'", double38 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 880.99d + "'", double49 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str63, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str65, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 880.99d + "'", double67 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType11, true, "hi!", true, (int) (byte) 0);
        double double17 = pricingRequest16.basePrice();
        java.lang.String str18 = pricingRequest16.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType30, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType30, false, "", false, 0);
        int int41 = pricingRequest40.quantity();
        boolean boolean42 = pricingRequest40.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType47, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType47, false, "hi!", false, 10);
        boolean boolean58 = pricingRequest57.firstOrder();
        double double59 = pricingRequest57.basePrice();
        java.lang.String str60 = pricingRequest57.couponCode();
        boolean boolean61 = pricingRequest40.equals((java.lang.Object) pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = pricingRequest40.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) ' ', customerType62, true, "PricingRequest[basePrice=10.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) ' ', customerType62, false, "PricingRequest[basePrice=0.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType62, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", true, (int) (byte) 100);
        boolean boolean78 = pricingRequest77.firstOrder();
        boolean boolean79 = pricingRequest16.equals((java.lang.Object) boolean78);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str18, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + customerType62 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType62.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType8, false, "", false, 0);
        int int19 = pricingRequest18.quantity();
        double double20 = pricingRequest18.basePrice();
        int int21 = pricingRequest18.quantity();
        int int22 = pricingRequest18.quantity();
        int int23 = pricingRequest18.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType24, true, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 10, customerType24, true, "", false, 97);
        double double35 = pricingRequest34.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(880.99d, (int) '4', customerType6, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean13 = pricingRequest11.equals((java.lang.Object) customerType12);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 0, customerType12, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) -1, customerType12, true, "hi!", false, (int) (byte) 0);
        boolean boolean24 = pricingRequest23.seasonalSale();
        java.lang.String str25 = pricingRequest23.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest23.customerType();
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest20.customerType();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        java.lang.String str26 = pricingRequest20.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 880.99d + "'", double25 == 880.99d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType4, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) 'a');
        int int15 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        int int17 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        boolean boolean22 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest20.customerType();
        java.lang.Class<?> wildcardClass24 = pricingRequest20.getClass();
        boolean boolean25 = pricingRequest7.equals((java.lang.Object) pricingRequest20);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType18, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType18, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest28.customerType();
        boolean boolean30 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest28.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 0, customerType31, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]", false, 0);
        boolean boolean37 = pricingRequest7.equals((java.lang.Object) pricingRequest36);
        boolean boolean38 = pricingRequest7.firstOrder();
        double double39 = pricingRequest7.basePrice();
        java.lang.String str40 = pricingRequest7.couponCode();
        java.lang.String str41 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType16, false, "hi!", false, (int) '#');
        double double22 = pricingEngine0.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType25, false, "hi!", false, (int) '#');
        double double31 = pricingRequest30.basePrice();
        int int32 = pricingRequest30.loyaltyPoints();
        java.lang.String str33 = pricingRequest30.toString();
        boolean boolean34 = pricingRequest30.firstOrder();
        double double35 = pricingEngine0.calculateFinalPrice(pricingRequest30);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType40, false, "hi!", false, (int) '#');
        double double46 = pricingRequest45.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest45.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType47, true, "hi!", true, (int) (byte) 0);
        double double53 = pricingRequest52.basePrice();
        boolean boolean54 = pricingRequest52.seasonalSale();
        double double55 = pricingRequest52.basePrice();
        int int56 = pricingRequest52.loyaltyPoints();
        double double57 = pricingEngine0.calculateFinalPrice(pricingRequest52);
        com.viktor.lab4.PricingEngine pricingEngine58 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType61, false, "hi!", false, (int) '#');
        boolean boolean67 = pricingRequest66.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest66.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest66.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest66.customerType();
        double double71 = pricingEngine58.calculateFinalPrice(pricingRequest66);
        boolean boolean72 = pricingRequest66.seasonalSale();
        java.lang.String str73 = pricingRequest66.couponCode();
        double double74 = pricingEngine0.calculateFinalPrice(pricingRequest66);
        java.lang.String str75 = pricingRequest66.toString();
        java.lang.String str76 = pricingRequest66.couponCode();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 880.99d + "'", double22 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str33, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 880.99d + "'", double35 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 8.79d + "'", double57 == 8.79d);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 880.99d + "'", double71 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 880.99d + "'", double74 == 880.99d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str75, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType11, true, "hi!", true, (int) (byte) 0);
        double double17 = pricingRequest16.basePrice();
        boolean boolean18 = pricingRequest16.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) '#', customerType21, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) '#');
        double double27 = pricingRequest26.basePrice();
        boolean boolean28 = pricingRequest16.equals((java.lang.Object) pricingRequest26);
        java.lang.String str29 = pricingRequest26.toString();
        int int30 = pricingRequest26.quantity();
        int int31 = pricingRequest26.quantity();
        int int32 = pricingRequest26.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest26.customerType();
        boolean boolean34 = pricingRequest26.firstOrder();
        com.viktor.lab4.PricingEngine pricingEngine35 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType38, false, "hi!", false, (int) '#');
        boolean boolean44 = pricingRequest43.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = pricingRequest43.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest43.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest43.customerType();
        double double48 = pricingEngine35.calculateFinalPrice(pricingRequest43);
        com.viktor.lab4.PricingEngine pricingEngine49 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = pricingRequest57.customerType();
        double double62 = pricingEngine49.calculateFinalPrice(pricingRequest57);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType65, false, "hi!", false, (int) '#');
        double double71 = pricingEngine49.calculateFinalPrice(pricingRequest70);
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType74, false, "hi!", false, (int) '#');
        boolean boolean80 = pricingRequest79.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = pricingRequest79.customerType();
        int int82 = pricingRequest79.loyaltyPoints();
        boolean boolean83 = pricingRequest79.firstOrder();
        double double84 = pricingRequest79.basePrice();
        java.lang.String str85 = pricingRequest79.toString();
        double double86 = pricingEngine49.calculateFinalPrice(pricingRequest79);
        boolean boolean87 = pricingRequest79.seasonalSale();
        int int88 = pricingRequest79.quantity();
        double double89 = pricingRequest79.basePrice();
        double double90 = pricingEngine35.calculateFinalPrice(pricingRequest79);
        boolean boolean91 = pricingRequest26.equals((java.lang.Object) pricingRequest79);
        int int92 = pricingRequest79.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=0.0, quantity=35, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=35]" + "'", str29, "PricingRequest[basePrice=0.0, quantity=35, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 880.99d + "'", double48 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 880.99d + "'", double62 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 880.99d + "'", double71 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 35 + "'", int82 == 35);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str85, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 880.99d + "'", double86 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 97 + "'", int88 == 97);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 880.99d + "'", double90 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 97 + "'", int92 == 97);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType6, false, "hi!", false, 10);
        boolean boolean17 = pricingRequest16.firstOrder();
        double double18 = pricingRequest16.basePrice();
        java.lang.String str19 = pricingRequest16.couponCode();
        int int20 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType21, true, "PricingRequest[basePrice=0.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]", true, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = pricingRequest26.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType6, false, "", false, 0);
        int int17 = pricingRequest16.quantity();
        double double18 = pricingRequest16.basePrice();
        int int19 = pricingRequest16.quantity();
        int int20 = pricingRequest16.quantity();
        int int21 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType22, true, "", false, (int) ' ');
        boolean boolean28 = pricingRequest27.firstOrder();
        int int29 = pricingRequest27.quantity();
        int int30 = pricingRequest27.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        double double23 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest20.customerType();
        double double25 = pricingEngine0.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        double double34 = pricingRequest33.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        java.lang.String str36 = pricingRequest33.toString();
        int int37 = pricingRequest33.quantity();
        java.lang.String str38 = pricingRequest33.toString();
        double double39 = pricingEngine0.calculateFinalPrice(pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(880.99d, (int) '4', customerType50, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean57 = pricingRequest55.equals((java.lang.Object) customerType56);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 0, customerType56, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) -1, customerType56, true, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) 0, customerType56, false, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 10, customerType56, true, "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 1);
        double double78 = pricingEngine0.calculateFinalPrice(pricingRequest77);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 880.99d + "'", double25 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str36, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 880.99d + "'", double39 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 7.99d + "'", double78 == 7.99d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        int int16 = pricingRequest14.loyaltyPoints();
        boolean boolean17 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest14.customerType();
        java.lang.String str19 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType22, false, "hi!", false, (int) '#');
        boolean boolean28 = pricingRequest27.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest27.customerType();
        int int30 = pricingRequest27.loyaltyPoints();
        java.lang.String str31 = pricingRequest27.couponCode();
        int int32 = pricingRequest27.quantity();
        double double33 = pricingRequest27.basePrice();
        boolean boolean34 = pricingRequest14.equals((java.lang.Object) pricingRequest27);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (-1), customerType37, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest42.customerType();
        boolean boolean44 = pricingRequest27.equals((java.lang.Object) customerType43);
        java.lang.String str45 = pricingRequest27.toString();
        int int46 = pricingRequest27.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str45, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType6, false, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (byte) -1, customerType17, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType12, false, "hi!", false, (int) '#');
        boolean boolean18 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest17.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest17.customerType();
        boolean boolean21 = pricingRequest17.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest17.customerType();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) customerType22);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType10, false, "", false, 0);
        int int21 = pricingRequest20.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        boolean boolean23 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (short) 1, customerType24, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) -1, customerType24, true, "", false, 0);
        com.viktor.lab4.PricingEngine pricingEngine35 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType38, false, "hi!", false, (int) '#');
        boolean boolean44 = pricingRequest43.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = pricingRequest43.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest43.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest43.customerType();
        double double48 = pricingEngine35.calculateFinalPrice(pricingRequest43);
        boolean boolean49 = pricingRequest43.seasonalSale();
        java.lang.Class<?> wildcardClass50 = pricingRequest43.getClass();
        boolean boolean51 = pricingRequest34.equals((java.lang.Object) pricingRequest43);
        int int52 = pricingRequest34.quantity();
        int int53 = pricingRequest34.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 35, customerType54, true, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) 0);
        int int60 = pricingRequest59.quantity();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 880.99d + "'", double48 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType4, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (short) 1, customerType4, true, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean15 = pricingRequest14.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType18, false, "hi!", false, (int) '#');
        boolean boolean24 = pricingRequest23.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        double double26 = pricingRequest23.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest23.customerType();
        int int28 = pricingRequest23.loyaltyPoints();
        boolean boolean29 = pricingRequest23.seasonalSale();
        int int30 = pricingRequest23.quantity();
        boolean boolean31 = pricingRequest23.seasonalSale();
        boolean boolean32 = pricingRequest14.equals((java.lang.Object) boolean31);
        boolean boolean33 = pricingRequest14.seasonalSale();
        java.lang.String str34 = pricingRequest14.toString();
        double double35 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=100.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str34, "PricingRequest[basePrice=100.0, quantity=1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        boolean boolean17 = pricingRequest14.firstOrder();
        boolean boolean18 = pricingRequest14.seasonalSale();
        int int19 = pricingRequest14.quantity();
        int int20 = pricingRequest14.loyaltyPoints();
        java.lang.String str21 = pricingRequest14.toString();
        boolean boolean22 = pricingRequest14.firstOrder();
        boolean boolean23 = pricingRequest14.seasonalSale();
        boolean boolean24 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        boolean boolean14 = pricingRequest8.seasonalSale();
        java.lang.String str15 = pricingRequest8.couponCode();
        boolean boolean16 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType21, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType21, false, "hi!", false, 10);
        boolean boolean32 = pricingRequest31.firstOrder();
        boolean boolean33 = pricingRequest31.firstOrder();
        boolean boolean34 = pricingRequest31.firstOrder();
        java.lang.String str35 = pricingRequest31.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest31.customerType();
        boolean boolean37 = pricingRequest8.equals((java.lang.Object) customerType36);
        int int38 = pricingRequest8.quantity();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        java.lang.String str11 = pricingRequest8.couponCode();
        double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType15, false, "hi!", false, (int) '#');
        double double21 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        java.lang.String str23 = pricingRequest20.toString();
        int int24 = pricingRequest20.quantity();
        com.viktor.lab4.PricingEngine pricingEngine25 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType28, false, "hi!", false, (int) '#');
        boolean boolean34 = pricingRequest33.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest33.customerType();
        java.lang.String str36 = pricingRequest33.couponCode();
        double double37 = pricingEngine25.calculateFinalPrice(pricingRequest33);
        boolean boolean38 = pricingRequest20.equals((java.lang.Object) pricingEngine25);
        boolean boolean39 = pricingRequest8.equals((java.lang.Object) pricingRequest20);
        double double40 = pricingRequest8.basePrice();
        int int41 = pricingRequest8.quantity();
        double double42 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest8.customerType();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 880.99d + "'", double12 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str23, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 880.99d + "'", double37 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        boolean boolean15 = pricingRequest14.firstOrder();
        boolean boolean16 = pricingRequest14.firstOrder();
        boolean boolean17 = pricingRequest14.firstOrder();
        java.lang.String str18 = pricingRequest14.toString();
        java.lang.String str19 = pricingRequest14.couponCode();
        boolean boolean20 = pricingRequest14.seasonalSale();
        double double21 = pricingRequest14.basePrice();
        java.lang.String str22 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str22, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 97, customerType4, false, "PricingRequest[basePrice=0.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType4, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        java.lang.String str15 = pricingRequest14.couponCode();
        java.lang.String str16 = pricingRequest14.couponCode();
        boolean boolean17 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(880.99d, (int) '4', customerType6, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean13 = pricingRequest11.equals((java.lang.Object) customerType12);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 0, customerType12, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) -1, customerType12, true, "hi!", false, (int) (byte) 0);
        int int24 = pricingRequest23.loyaltyPoints();
        boolean boolean25 = pricingRequest23.firstOrder();
        boolean boolean26 = pricingRequest23.firstOrder();
        boolean boolean27 = pricingRequest23.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType30, false, "hi!", false, (int) '#');
        boolean boolean36 = pricingRequest35.seasonalSale();
        boolean boolean37 = pricingRequest35.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType40, false, "hi!", false, (int) '#');
        double double46 = pricingRequest45.basePrice();
        int int47 = pricingRequest45.loyaltyPoints();
        java.lang.String str48 = pricingRequest45.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest45.customerType();
        boolean boolean50 = pricingRequest35.equals((java.lang.Object) customerType49);
        java.lang.String str51 = pricingRequest35.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest35.customerType();
        boolean boolean53 = pricingRequest23.equals((java.lang.Object) pricingRequest35);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str48, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.toString();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType19, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType19, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest29.customerType();
        java.lang.String str31 = pricingRequest29.toString();
        java.lang.String str32 = pricingRequest29.couponCode();
        int int33 = pricingRequest29.quantity();
        boolean boolean34 = pricingRequest7.equals((java.lang.Object) int33);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str31, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.couponCode();
        int int12 = pricingRequest7.quantity();
        java.lang.String str13 = pricingRequest7.couponCode();
        double double14 = pricingRequest7.basePrice();
        boolean boolean15 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}

